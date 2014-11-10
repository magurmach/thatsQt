// @SOURCE:/Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/conf/routes
// @HASH:fec0d0660bfbf83d88069502ad079f8db92c2645
// @DATE:Mon Nov 10 01:03:10 BDT 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

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
private[this] lazy val controllers_blog_Home_showPost3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("post"))))
private[this] lazy val controllers_blog_Home_showPost3_invoker = createInvoker(
controllers.blog.Home.showPost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "showPost", Nil,"GET", """""", Routes.prefix + """post"""))
        

// @LINE:14
private[this] lazy val controllers_blog_WriteAndSave_writePost4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("writePost"))))
private[this] lazy val controllers_blog_WriteAndSave_writePost4_invoker = createInvoker(
controllers.blog.WriteAndSave.writePost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "writePost", Nil,"GET", """""", Routes.prefix + """writePost"""))
        

// @LINE:15
private[this] lazy val controllers_blog_WriteAndSave_savePost5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("writePost"))))
private[this] lazy val controllers_blog_WriteAndSave_savePost5_invoker = createInvoker(
controllers.blog.WriteAndSave.savePost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "savePost", Nil,"GET", """""", Routes.prefix + """writePost"""))
        

// @LINE:18
private[this] lazy val controllers_security_Security_loginPage6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signin"))))
private[this] lazy val controllers_security_Security_loginPage6_invoker = createInvoker(
controllers.security.Security.loginPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "loginPage", Nil,"GET", """ security""", Routes.prefix + """signin"""))
        

// @LINE:19
private[this] lazy val controllers_security_Security_verifyAndSignIn7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("requestSignIn"))))
private[this] lazy val controllers_security_Security_verifyAndSignIn7_invoker = createInvoker(
controllers.security.Security.verifyAndSignIn(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "verifyAndSignIn", Nil,"POST", """""", Routes.prefix + """requestSignIn"""))
        

// @LINE:22
private[this] lazy val controllers_blog_WriteAndSave_writePost8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("writePost"))))
private[this] lazy val controllers_blog_WriteAndSave_writePost8_invoker = createInvoker(
controllers.blog.WriteAndSave.writePost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "writePost", Nil,"GET", """post""", Routes.prefix + """writePost"""))
        

// @LINE:23
private[this] lazy val controllers_blog_WriteAndSave_savePost9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("savePost"))))
private[this] lazy val controllers_blog_WriteAndSave_savePost9_invoker = createInvoker(
controllers.blog.WriteAndSave.savePost(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "savePost", Nil,"POST", """""", Routes.prefix + """savePost"""))
        

// @LINE:26
private[this] lazy val controllers_security_Security_invalid10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("invalid/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_security_Security_invalid10_invoker = createInvoker(
controllers.security.Security.invalid(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "invalid", Seq(classOf[String]),"GET", """invalid SignIn""", Routes.prefix + """invalid/$email<[^/]+>"""))
        

// @LINE:28
private[this] lazy val controllers_Home_error11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("text", """[^/]+""",true))))
private[this] lazy val controllers_Home_error11_invoker = createInvoker(
controllers.Home.error(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Home", "error", Seq(classOf[String]),"GET", """error""", Routes.prefix + """$text<[^/]+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix,"""controllers.Home.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog""","""controllers.blog.Home.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post""","""controllers.blog.Home.showPost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """writePost""","""controllers.blog.WriteAndSave.writePost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """writePost""","""controllers.blog.WriteAndSave.savePost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signin""","""controllers.security.Security.loginPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """requestSignIn""","""controllers.security.Security.verifyAndSignIn()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """writePost""","""controllers.blog.WriteAndSave.writePost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """savePost""","""controllers.blog.WriteAndSave.savePost()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """invalid/$email<[^/]+>""","""controllers.security.Security.invalid(email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$text<[^/]+>""","""controllers.Home.error(text:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
   call { 
        controllers_blog_Home_showPost3_invoker.call(controllers.blog.Home.showPost())
   }
}
        

// @LINE:14
case controllers_blog_WriteAndSave_writePost4_route(params) => {
   call { 
        controllers_blog_WriteAndSave_writePost4_invoker.call(controllers.blog.WriteAndSave.writePost())
   }
}
        

// @LINE:15
case controllers_blog_WriteAndSave_savePost5_route(params) => {
   call { 
        controllers_blog_WriteAndSave_savePost5_invoker.call(controllers.blog.WriteAndSave.savePost())
   }
}
        

// @LINE:18
case controllers_security_Security_loginPage6_route(params) => {
   call { 
        controllers_security_Security_loginPage6_invoker.call(controllers.security.Security.loginPage())
   }
}
        

// @LINE:19
case controllers_security_Security_verifyAndSignIn7_route(params) => {
   call { 
        controllers_security_Security_verifyAndSignIn7_invoker.call(controllers.security.Security.verifyAndSignIn())
   }
}
        

// @LINE:22
case controllers_blog_WriteAndSave_writePost8_route(params) => {
   call { 
        controllers_blog_WriteAndSave_writePost8_invoker.call(controllers.blog.WriteAndSave.writePost())
   }
}
        

// @LINE:23
case controllers_blog_WriteAndSave_savePost9_route(params) => {
   call { 
        controllers_blog_WriteAndSave_savePost9_invoker.call(controllers.blog.WriteAndSave.savePost())
   }
}
        

// @LINE:26
case controllers_security_Security_invalid10_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_security_Security_invalid10_invoker.call(controllers.security.Security.invalid(email))
   }
}
        

// @LINE:28
case controllers_Home_error11_route(params) => {
   call(params.fromPath[String]("text", None)) { (text) =>
        controllers_Home_error11_invoker.call(controllers.Home.error(text))
   }
}
        
}

}
     