package controllers.blog;

import java.util.List;
import java.util.Map;

import models.posts.Category;
import models.posts.Post;
import play.mvc.Controller;
import play.mvc.Result;

public class WriteAndSave extends Controller{
	public static Result writePost()
	{
		List<Category> list=Category.find.all();
		return ok(views.html.blog.writePost.render(list));
	}
	
	public static Result savePost()
	{
		Map<String,String[]> params=request().body().asFormUrlEncoded();
		Post temporary=new Post();
		temporary.title=params.get("title")[0];
		temporary.subtitle=params.get("sub-title")[0];
		int categoryId=Integer.parseInt(params.get("category")[0]);
		Category cat=Category.find.where().eq("id", categoryId).findUnique();
		temporary.category=cat;
		temporary.summary=params.get("summary")[0];
		temporary.postbody=params.get("postbody")[0];
		temporary.save();
		return redirect("/showAllPost");
	}
	
	public static Result saveExisting()
	{
		Map<String,String[]> params=request().body().asFormUrlEncoded();
		int id=Integer.parseInt(params.get("id")[0]);
		Post temporary=Post.find.where().eq("id", id).findUnique();
		temporary.setTitle(params.get("title")[0]);
		temporary.setSubtitle(params.get("sub-title")[0]);
		temporary.setSummary(params.get("summary")[0]);
		int categoryId=Integer.parseInt(params.get("category")[0]);
		Category cat=Category.find.where().eq("id", categoryId).findUnique();
		temporary.setCategory(cat);
		temporary.setPostbody(params.get("e1m1")[0]);
		temporary.save();
		return redirect("/showAllPost");
		
	}
	
	public static Result deletePost(int id)
	{
		Post temporary= Post.find.where().eq("id", id).findUnique();
		if(temporary!=null)
		{
			temporary.delete();
		}
		return redirect("/showAllPost");
	}
	public static Result editPost(int id)
	{
		Post temporary= Post.find.where().eq("id", id).findUnique();
		List<Category> list=Category.find.all();
		return ok(views.html.blog.editPost.render(temporary,list));
	}
}
