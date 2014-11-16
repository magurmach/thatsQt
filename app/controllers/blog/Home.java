package controllers.blog;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import akka.event.slf4j.Logger;
import models.posts.Category;
import models.posts.Post;
import play.mvc.Controller;
import play.mvc.Result;

public class Home extends Controller{
	public static Result home()
	{
		final Set<Map.Entry<String,String[]>> entries = request().queryString().entrySet();
        String key="", value="";
		for (Map.Entry<String,String[]> entry : entries) {
            key = entry.getKey();
            value = Arrays.toString(entry.getValue());
            if(key.equals("category"))
            {
            	value=value.substring(1, value.length()-1);
            	break;
            }
        }
		List<Category> categoryList=Category.find.all();
		if(key.equals("") || value.equals(""))
		{
			List<Post> postList=Post.find.all();
			return ok(views.html.blog.home.render(postList,categoryList,false,""));
		}
		else
		{
			int id=Integer.parseInt(value);
			Category category=null;
			category=Category.find.where().eq("id", id).findUnique();
			if(category==null)
			{
				return redirect("/invalidRequest/category="+value);
			}
			List<Post> postList=Post.find.where().eq("category", category).findList();
			return ok(views.html.blog.home.render(postList,categoryList,true,category.getName()));
		}
		/*
		List<Post> postList=Post.find.all();
		List<Category> categoryList=Category.find.all();
		return ok(views.html.blog.home.render(postList,categoryList));*/
	}
	
	public static Result postOfCategory(String category)
	{
		return ok(category);
	}
	
	public static Result showPost(int id)
	{
		Post post=Post.find.where().eq("id", id).findUnique();
		return ok(views.html.blog.post.render(post));
	}
}
