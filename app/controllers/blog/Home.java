package controllers.blog;

import play.mvc.Controller;
import play.mvc.Result;

public class Home extends Controller{
	public static Result home()
	{
		return ok(views.html.blog.home.render());
	}
}
