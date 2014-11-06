// @SOURCE:/Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/conf/routes
// @HASH:6ef08b7dc1f6bcbfd3aa65bb453e212196e363e2
// @DATE:Thu Nov 06 22:53:12 BDT 2014


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
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix,"""controllers.Home.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog""","""controllers.blog.Home.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """post""","""controllers.blog.Home.showPost()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        
}

}
     