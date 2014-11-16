package controllers.blog;

import java.util.List;
import java.util.Map;

import models.posts.Category;
import play.mvc.Controller;
import play.mvc.Result;

public class CategoryController extends Controller{
	
	public static Result createCategory()
	{
		return ok(views.html.blog.createCategory.render());
	}
	
	public static Result saveCategory()
	{
		Map<String,String[]> params=request().body().asFormUrlEncoded();
		models.posts.Category temporary =new models.posts.Category();
		temporary.name=params.get("title")[0];
		temporary.imageDirectory=params.get("link")[0];
		temporary.save();
		return redirect("/allCategory");
	}
	
	public static Result categoryList()
	{
		List<models.posts.Category> list= models.posts.Category.find.all();
		return ok(views.html.blog.allCategoryListPage.render(list));
	}
	
	public static Result editCategory(int id)
	{
		Category temp=Category.find.where().eq("id", id).findUnique();
		return ok(views.html.blog.editCategory.render(temp));
	}
	
	public static Result saveExisting()
	{
		Map<String,String[]> params=request().body().asFormUrlEncoded();
		int id=Integer.parseInt(params.get("id")[0]);
		Category temp=Category.find.where().eq("id", id).findUnique();
		temp.setName(params.get("title")[0]);
		temp.setImageDirectory(params.get("link")[0]);
		temp.save();
		return redirect("/allCategory");
	}
	
	public static Result deleteCategory(int id)
	{
		Category temporary= Category.find.where().eq("id", id).findUnique();
		temporary.delete();
		return redirect("/allCategory");
	}
}
