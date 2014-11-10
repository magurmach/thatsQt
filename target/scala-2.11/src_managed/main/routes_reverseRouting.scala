// @SOURCE:/Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/conf/routes
// @HASH:fec0d0660bfbf83d88069502ad079f8db92c2645
// @DATE:Mon Nov 10 01:03:10 BDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:28
// @LINE:9
// @LINE:6
package controllers {

// @LINE:28
// @LINE:9
class ReverseHome {


// @LINE:28
def error(text:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("text", dynamicString(text)))
}
                        

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
                  

// @LINE:26
// @LINE:19
// @LINE:18
package controllers.security {

// @LINE:26
// @LINE:19
// @LINE:18
class ReverseSecurity {


// @LINE:19
def verifyAndSignIn(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "requestSignIn")
}
                        

// @LINE:26
def invalid(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "invalid/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:18
def loginPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signin")
}
                        

}
                          
}
                  

// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
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
                          

// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
class ReverseWriteAndSave {


// @LINE:22
// @LINE:14
def writePost(): Call = {
   () match {
// @LINE:14
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "writePost")
                                         
   }
}
                                                

// @LINE:23
// @LINE:15
def savePost(): Call = {
   () match {
// @LINE:15
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "writePost")
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:28
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:28
// @LINE:9
class ReverseHome {


// @LINE:28
def error : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Home.error",
   """
      function(text) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("text", encodeURIComponent(text))})
      }
   """
)
                        

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
        

// @LINE:26
// @LINE:19
// @LINE:18
package controllers.security.javascript {
import ReverseRouteContext.empty

// @LINE:26
// @LINE:19
// @LINE:18
class ReverseSecurity {


// @LINE:19
def verifyAndSignIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.security.Security.verifyAndSignIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "requestSignIn"})
      }
   """
)
                        

// @LINE:26
def invalid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.security.Security.invalid",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "invalid/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:18
def loginPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.security.Security.loginPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
      }
   """
)
                        

}
              
}
        

// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
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
              

// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
class ReverseWriteAndSave {


// @LINE:22
// @LINE:14
def writePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.WriteAndSave.writePost",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "writePost"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "writePost"})
      }
      }
   """
)
                        

// @LINE:23
// @LINE:15
def savePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.WriteAndSave.savePost",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "writePost"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savePost"})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:28
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:28
// @LINE:9
class ReverseHome {


// @LINE:28
def error(text:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Home.error(text), HandlerDef(this.getClass.getClassLoader, "", "controllers.Home", "error", Seq(classOf[String]), "GET", """error""", _prefix + """$text<[^/]+>""")
)
                      

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
        

// @LINE:26
// @LINE:19
// @LINE:18
package controllers.security.ref {


// @LINE:26
// @LINE:19
// @LINE:18
class ReverseSecurity {


// @LINE:19
def verifyAndSignIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.security.Security.verifyAndSignIn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "verifyAndSignIn", Seq(), "POST", """""", _prefix + """requestSignIn""")
)
                      

// @LINE:26
def invalid(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.security.Security.invalid(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "invalid", Seq(classOf[String]), "GET", """invalid SignIn""", _prefix + """invalid/$email<[^/]+>""")
)
                      

// @LINE:18
def loginPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.security.Security.loginPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "loginPage", Seq(), "GET", """ security""", _prefix + """signin""")
)
                      

}
                          
}
        

// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
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
                          

// @LINE:23
// @LINE:22
// @LINE:15
// @LINE:14
class ReverseWriteAndSave {


// @LINE:14
def writePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.WriteAndSave.writePost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "writePost", Seq(), "GET", """""", _prefix + """writePost""")
)
                      

// @LINE:15
def savePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.WriteAndSave.savePost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "savePost", Seq(), "GET", """""", _prefix + """writePost""")
)
                      

}
                          
}
        
    