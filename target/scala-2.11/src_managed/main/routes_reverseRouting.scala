// @SOURCE:/Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/conf/routes
// @HASH:6ef08b7dc1f6bcbfd3aa65bb453e212196e363e2
// @DATE:Thu Nov 06 22:53:12 BDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseHome {


// @LINE:9
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:6
class ReverseAssets {


// @LINE:6
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          
}
                  

// @LINE:13
// @LINE:12
package controllers.blog {

// @LINE:13
// @LINE:12
class ReverseHome {


// @LINE:12
def home(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blog")
}
                        

// @LINE:13
def showPost(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "post")
}
                        

}
                          
}
                  


// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
class ReverseHome {


// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Home.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseAssets {


// @LINE:6
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              
}
        

// @LINE:13
// @LINE:12
package controllers.blog.javascript {
import ReverseRouteContext.empty

// @LINE:13
// @LINE:12
class ReverseHome {


// @LINE:12
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.Home.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blog"})
      }
   """
)
                        

// @LINE:13
def showPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.Home.showPost",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
      }
   """
)
                        

}
              
}
        


// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseHome {


// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Home.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Home", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:6
class ReverseAssets {


// @LINE:6
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          
}
        

// @LINE:13
// @LINE:12
package controllers.blog.ref {


// @LINE:13
// @LINE:12
class ReverseHome {


// @LINE:12
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.Home.home(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "home", Seq(), "GET", """ Blog Pages""", _prefix + """blog""")
)
                      

// @LINE:13
def showPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.Home.showPost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "showPost", Seq(), "GET", """""", _prefix + """post""")
)
                      

}
                          
}
        
    