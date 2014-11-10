package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Home extends Controller{
	public static Result index()
	{
		return ok(views.html.homepage.render());
	}
	
	public static Result error(String x)
	{
		return ok(views.html.error404.render(x));
	}
}
