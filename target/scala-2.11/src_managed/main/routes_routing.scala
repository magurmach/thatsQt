// @SOURCE:/Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/conf/routes
// @HASH:31008a08bbf1df8878d1a55f4d2ddeee80bf0b1e
// @DATE:Sun Nov 16 12:14:36 BDT 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Assets_at0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:9
private[this] lazy val controllers_Home_index1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Home_index1_invoker = createInvoker(
controllers.Home.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Home", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:12
private[this] lazy val controllers_blog_Home_home2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog"))))
private[this] lazy val controllers_blog_Home_home2_invoker = createInvoker(
controllers.blog.Home.home(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "home", Nil,"GET", """ Blog Pages""", Routes.prefix + """blog"""))
        

// @LINE:13
private[this] lazy val controllers_blog_Home_showPost3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_Home_showPost3_invoker = createInvoker(
controllers.blog.Home.showPost(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "showPost", Seq(classOf[Int]),"GET", """""", Routes.prefix + """post/$id<[^/]+>"""))
        

// @LINE:16
private[this] lazy val controllers_security_Security_loginPage4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
private[this] lazy val controllers_security_Security_loginPage4_invoker = createInvoker(
controllers.security.Security.loginPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "loginPage", Nil,"GET", """ security""", Routes.prefix + """signin"""))
        

// @LINE:17
private[this] lazy val controllers_security_Security_verifyAndSignIn5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("requestSignIn"))))
private[this] lazy val controllers_security_Security_verifyAndSignIn5_invoker = createInvoker(
controllers.security.Security.verifyAndSignIn(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "verifyAndSignIn", Nil,"POST", """""", Routes.prefix + """requestSignIn"""))
        

// @LINE:20
private[this] lazy val controllers_blog_WriteAndSave_writePost6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("writePost"))))
private[this] lazy val controllers_blog_WriteAndSave_writePost6_invoker = createInvoker(
controllers.blog.WriteAndSave.writePost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "writePost", Nil,"GET", """post""", Routes.prefix + """writePost"""))
        

// @LINE:21
private[this] lazy val controllers_blog_WriteAndSave_editPost7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_WriteAndSave_editPost7_invoker = createInvoker(
controllers.blog.WriteAndSave.editPost(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "editPost", Seq(classOf[Int]),"GET", """""", Routes.prefix + """edit/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_blog_WriteAndSave_savePost8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("savePost"))))
private[this] lazy val controllers_blog_WriteAndSave_savePost8_invoker = createInvoker(
controllers.blog.WriteAndSave.savePost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "savePost", Nil,"POST", """""", Routes.prefix + """savePost"""))
        

// @LINE:23
private[this] lazy val controllers_blog_WriteAndSave_saveExisting9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveExistingPost"))))
private[this] lazy val controllers_blog_WriteAndSave_saveExisting9_invoker = createInvoker(
controllers.blog.WriteAndSave.saveExisting(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "saveExisting", Nil,"POST", """""", Routes.prefix + """saveExistingPost"""))
        

// @LINE:26
private[this] lazy val controllers_blog_PostPublish_showAllPost10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showAllPost"))))
private[this] lazy val controllers_blog_PostPublish_showAllPost10_invoker = createInvoker(
controllers.blog.PostPublish.showAllPost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.PostPublish", "showAllPost", Nil,"GET", """CMS""", Routes.prefix + """showAllPost"""))
        

// @LINE:27
private[this] lazy val controllers_blog_WriteAndSave_deletePost11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletePost/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_WriteAndSave_deletePost11_invoker = createInvoker(
controllers.blog.WriteAndSave.deletePost(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "deletePost", Seq(classOf[Int]),"GET", """""", Routes.prefix + """deletePost/$id<[^/]+>"""))
        

// @LINE:28
private[this] lazy val controllers_blog_PostPublish_publishPost12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("publish/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_PostPublish_publishPost12_invoker = createInvoker(
controllers.blog.PostPublish.publishPost(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.PostPublish", "publishPost", Seq(classOf[Int]),"GET", """""", Routes.prefix + """publish/$id<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_blog_Home_showPost13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("preview/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_Home_showPost13_invoker = createInvoker(
controllers.blog.Home.showPost(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "showPost", Seq(classOf[Int]),"GET", """""", Routes.prefix + """preview/$id<[^/]+>"""))
        

// @LINE:30
private[this] lazy val controllers_blog_PostPublish_unpublishPost14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unpublish/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_PostPublish_unpublishPost14_invoker = createInvoker(
controllers.blog.PostPublish.unpublishPost(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.PostPublish", "unpublishPost", Seq(classOf[Int]),"GET", """""", Routes.prefix + """unpublish/$id<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_blog_CategoryController_createCategory15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createCategory"))))
private[this] lazy val controllers_blog_CategoryController_createCategory15_invoker = createInvoker(
controllers.blog.CategoryController.createCategory(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "createCategory", Nil,"GET", """""", Routes.prefix + """createCategory"""))
        

// @LINE:33
private[this] lazy val controllers_blog_CategoryController_saveCategory16_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveCategory"))))
private[this] lazy val controllers_blog_CategoryController_saveCategory16_invoker = createInvoker(
controllers.blog.CategoryController.saveCategory(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "saveCategory", Nil,"POST", """""", Routes.prefix + """saveCategory"""))
        

// @LINE:34
private[this] lazy val controllers_blog_CategoryController_categoryList17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("allCategory"))))
private[this] lazy val controllers_blog_CategoryController_categoryList17_invoker = createInvoker(
controllers.blog.CategoryController.categoryList(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "categoryList", Nil,"GET", """""", Routes.prefix + """allCategory"""))
        

// @LINE:35
private[this] lazy val controllers_blog_CategoryController_editCategory18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editCategory/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_CategoryController_editCategory18_invoker = createInvoker(
controllers.blog.CategoryController.editCategory(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "editCategory", Seq(classOf[Int]),"GET", """""", Routes.prefix + """editCategory/$id<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_blog_CategoryController_saveExisting19_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("saveExistingCategory"))))
private[this] lazy val controllers_blog_CategoryController_saveExisting19_invoker = createInvoker(
controllers.blog.CategoryController.saveExisting(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "saveExisting", Nil,"POST", """""", Routes.prefix + """saveExistingCategory"""))
        

// @LINE:37
private[this] lazy val controllers_blog_CategoryController_deleteCategory20_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteCategory/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_blog_CategoryController_deleteCategory20_invoker = createInvoker(
controllers.blog.CategoryController.deleteCategory(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "deleteCategory", Seq(classOf[Int]),"GET", """""", Routes.prefix + """deleteCategory/$id<[^/]+>"""))
        

// @LINE:40
private[this] lazy val controllers_security_Security_invalid21_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("invalid/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_security_Security_invalid21_invoker = createInvoker(
controllers.security.Security.invalid(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "invalid", Seq(classOf[String]),"GET", """invalid SignIn""", Routes.prefix + """invalid/$email<[^/]+>"""))
        

// @LINE:41
private[this] lazy val controllers_security_Security_invalidSearch22_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("invalidRequest/"),DynamicPart("query", """[^/]+""",true))))
private[this] lazy val controllers_security_Security_invalidSearch22_invoker = createInvoker(
controllers.security.Security.invalidSearch(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "invalidSearch", Seq(classOf[String]),"GET", """""", Routes.prefix + """invalidRequest/$query<[^/]+>"""))
        

// @LINE:43
private[this] lazy val controllers_Home_error23_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("text", """[^/]+""",true))))
private[this] lazy val controllers_Home_error23_invoker = createInvoker(
controllers.Home.error(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Home", "error", Seq(classOf[String]),"GET", """error""", Routes.prefix + """$text<[^/]+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix,"""controllers.Home.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog""","""controllers.blog.Home.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post/$id<[^/]+>""","""controllers.blog.Home.showPost(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.security.Security.loginPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """requestSignIn""","""controllers.security.Security.verifyAndSignIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """writePost""","""controllers.blog.WriteAndSave.writePost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/$id<[^/]+>""","""controllers.blog.WriteAndSave.editPost(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """savePost""","""controllers.blog.WriteAndSave.savePost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveExistingPost""","""controllers.blog.WriteAndSave.saveExisting()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showAllPost""","""controllers.blog.PostPublish.showAllPost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletePost/$id<[^/]+>""","""controllers.blog.WriteAndSave.deletePost(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """publish/$id<[^/]+>""","""controllers.blog.PostPublish.publishPost(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """preview/$id<[^/]+>""","""controllers.blog.Home.showPost(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unpublish/$id<[^/]+>""","""controllers.blog.PostPublish.unpublishPost(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createCategory""","""controllers.blog.CategoryController.createCategory()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveCategory""","""controllers.blog.CategoryController.saveCategory()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """allCategory""","""controllers.blog.CategoryController.categoryList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editCategory/$id<[^/]+>""","""controllers.blog.CategoryController.editCategory(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """saveExistingCategory""","""controllers.blog.CategoryController.saveExisting()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteCategory/$id<[^/]+>""","""controllers.blog.CategoryController.deleteCategory(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """invalid/$email<[^/]+>""","""controllers.security.Security.invalid(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """invalidRequest/$query<[^/]+>""","""controllers.security.Security.invalidSearch(query:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$text<[^/]+>""","""controllers.Home.error(text:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Assets_at0_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at0_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:9
case controllers_Home_index1_route(params) => {
   call { 
        controllers_Home_index1_invoker.call(controllers.Home.index())
   }
}
        

// @LINE:12
case controllers_blog_Home_home2_route(params) => {
   call { 
        controllers_blog_Home_home2_invoker.call(controllers.blog.Home.home())
   }
}
        

// @LINE:13
case controllers_blog_Home_showPost3_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_Home_showPost3_invoker.call(controllers.blog.Home.showPost(id))
   }
}
        

// @LINE:16
case controllers_security_Security_loginPage4_route(params) => {
   call { 
        controllers_security_Security_loginPage4_invoker.call(controllers.security.Security.loginPage())
   }
}
        

// @LINE:17
case controllers_security_Security_verifyAndSignIn5_route(params) => {
   call { 
        controllers_security_Security_verifyAndSignIn5_invoker.call(controllers.security.Security.verifyAndSignIn())
   }
}
        

// @LINE:20
case controllers_blog_WriteAndSave_writePost6_route(params) => {
   call { 
        controllers_blog_WriteAndSave_writePost6_invoker.call(controllers.blog.WriteAndSave.writePost())
   }
}
        

// @LINE:21
case controllers_blog_WriteAndSave_editPost7_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_WriteAndSave_editPost7_invoker.call(controllers.blog.WriteAndSave.editPost(id))
   }
}
        

// @LINE:22
case controllers_blog_WriteAndSave_savePost8_route(params) => {
   call { 
        controllers_blog_WriteAndSave_savePost8_invoker.call(controllers.blog.WriteAndSave.savePost())
   }
}
        

// @LINE:23
case controllers_blog_WriteAndSave_saveExisting9_route(params) => {
   call { 
        controllers_blog_WriteAndSave_saveExisting9_invoker.call(controllers.blog.WriteAndSave.saveExisting())
   }
}
        

// @LINE:26
case controllers_blog_PostPublish_showAllPost10_route(params) => {
   call { 
        controllers_blog_PostPublish_showAllPost10_invoker.call(controllers.blog.PostPublish.showAllPost())
   }
}
        

// @LINE:27
case controllers_blog_WriteAndSave_deletePost11_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_WriteAndSave_deletePost11_invoker.call(controllers.blog.WriteAndSave.deletePost(id))
   }
}
        

// @LINE:28
case controllers_blog_PostPublish_publishPost12_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_PostPublish_publishPost12_invoker.call(controllers.blog.PostPublish.publishPost(id))
   }
}
        

// @LINE:29
case controllers_blog_Home_showPost13_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_Home_showPost13_invoker.call(controllers.blog.Home.showPost(id))
   }
}
        

// @LINE:30
case controllers_blog_PostPublish_unpublishPost14_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_PostPublish_unpublishPost14_invoker.call(controllers.blog.PostPublish.unpublishPost(id))
   }
}
        

// @LINE:32
case controllers_blog_CategoryController_createCategory15_route(params) => {
   call { 
        controllers_blog_CategoryController_createCategory15_invoker.call(controllers.blog.CategoryController.createCategory())
   }
}
        

// @LINE:33
case controllers_blog_CategoryController_saveCategory16_route(params) => {
   call { 
        controllers_blog_CategoryController_saveCategory16_invoker.call(controllers.blog.CategoryController.saveCategory())
   }
}
        

// @LINE:34
case controllers_blog_CategoryController_categoryList17_route(params) => {
   call { 
        controllers_blog_CategoryController_categoryList17_invoker.call(controllers.blog.CategoryController.categoryList())
   }
}
        

// @LINE:35
case controllers_blog_CategoryController_editCategory18_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_CategoryController_editCategory18_invoker.call(controllers.blog.CategoryController.editCategory(id))
   }
}
        

// @LINE:36
case controllers_blog_CategoryController_saveExisting19_route(params) => {
   call { 
        controllers_blog_CategoryController_saveExisting19_invoker.call(controllers.blog.CategoryController.saveExisting())
   }
}
        

// @LINE:37
case controllers_blog_CategoryController_deleteCategory20_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_blog_CategoryController_deleteCategory20_invoker.call(controllers.blog.CategoryController.deleteCategory(id))
   }
}
        

// @LINE:40
case controllers_security_Security_invalid21_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_security_Security_invalid21_invoker.call(controllers.security.Security.invalid(email))
   }
}
        

// @LINE:41
case controllers_security_Security_invalidSearch22_route(params) => {
   call(params.fromPath[String]("query", None)) { (query) =>
        controllers_security_Security_invalidSearch22_invoker.call(controllers.security.Security.invalidSearch(query))
   }
}
        

// @LINE:43
case controllers_Home_error23_route(params) => {
   call(params.fromPath[String]("text", None)) { (text) =>
        controllers_Home_error23_invoker.call(controllers.Home.error(text))
   }
}
        
}

}
     