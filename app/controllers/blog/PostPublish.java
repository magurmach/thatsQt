package controllers.blog;

import java.util.Date;
import java.util.List;

import models.posts.Post;
import play.mvc.Controller;
import play.mvc.Result;
import scala.collection.JavaConverters;

public class PostPublish  extends Controller{
	
	public static Result showAllPost()
	{
		String str=session("signedin");
		if(str==null)
		{
			return redirect("/signin");
		}
		List<Post> unpublished,published;
		unpublished= Post.find.where().eq("postStatus", false).findList();
		published=Post.find.where().eq("postStatus", true).findList();
		return ok(views.html.blog.allPostListPage.render(unpublished,published));
	}
	
	public static Result publishPost(int id)
	{
		String str=session("signedin");
		if(str==null)
		{
			return redirect("/signin");
		}
		Post temporary;
		temporary= Post.find.where().eq("id",id).findUnique();
		if(temporary!=null) 
		{
			temporary.setPostStatus(true);
			temporary.setPostDate(new Date());
			temporary.save();
		}
		return redirect("/showAllPost");
	}
	
	public static Result unpublishPost(int id)
	{
		String str=session("signedin");
		if(str==null)
		{
			return redirect("/signin");
		}
		Post temporary;
		temporary=Post.find.where().eq("id", id).findUnique();
		if(temporary!=null)
		{
			temporary.setPostStatus(false);
			temporary.save();
		}
		return redirect("/showAllPost");
	}
	
}
