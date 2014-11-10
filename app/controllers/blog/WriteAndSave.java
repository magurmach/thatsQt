package controllers.blog;

import play.mvc.Controller;
import play.mvc.Result;

public class WriteAndSave extends Controller{
	public static Result writePost()
	{
		return ok(views.html.blog.writePost.render());
	}
	
	public static Result savePost()
	{
		return ok();
	}
}
