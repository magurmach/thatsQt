package controllers.security;

import java.util.Map;

import models.user.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.helper.form;
import views.html.*;
import play.api.data.Form;

public class Security extends Controller{
	
	
	public static Result loginPage()
	{
		return ok(views.html.security.signin.render());
	}
	
	public static Result verifyAndSignIn()
	{
		
		Map<String, String[]> params=request().body().asFormUrlEncoded();
		if(params.get("email")[0].equals("008.shakib@gmail.com")
				&& params.get("password")[0].equals("#amar#"))
			
		{
			session("signedin","008.shakib");
			return redirect("/showAllPost");
		}
		else
		{
			return redirect("/invalid/"+params.get("email")[0]);
		}
	}
	
	public static Result invalid(String mail)
	{
		return ok(views.html.invalid.render(mail));
	}
	
	public static Result invalidSearch(String query)
	{
		return ok(views.html.invalidRequest.render(query));
	}
}
