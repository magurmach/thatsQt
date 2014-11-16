// @SOURCE:/Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/conf/routes
// @HASH:31008a08bbf1df8878d1a55f4d2ddeee80bf0b1e
// @DATE:Sun Nov 16 12:14:36 BDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:43
// @LINE:9
// @LINE:6
package controllers {

// @LINE:43
// @LINE:9
class ReverseHome {


// @LINE:43
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
                  

// @LINE:41
// @LINE:40
// @LINE:17
// @LINE:16
package controllers.security {

// @LINE:41
// @LINE:40
// @LINE:17
// @LINE:16
class ReverseSecurity {


// @LINE:41
def invalidSearch(query:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "invalidRequest/" + implicitly[PathBindable[String]].unbind("query", dynamicString(query)))
}
                        

// @LINE:17
def verifyAndSignIn(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "requestSignIn")
}
                        

// @LINE:40
def invalid(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "invalid/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:16
def loginPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "signin")
}
                        

}
                          
}
                  

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:12
package controllers.blog {

// @LINE:29
// @LINE:13
// @LINE:12
class ReverseHome {


// @LINE:12
def home(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "blog")
}
                        

// @LINE:29
// @LINE:13
def showPost(id:Int): Call = {
   (id: @unchecked) match {
// @LINE:13
case (id)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "post/" + implicitly[PathBindable[Int]].unbind("id", id))
                                         
   }
}
                                                

}
                          

// @LINE:30
// @LINE:28
// @LINE:26
class ReversePostPublish {


// @LINE:26
def showAllPost(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showAllPost")
}
                        

// @LINE:28
def publishPost(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "publish/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:30
def unpublishPost(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "unpublish/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

}
                          

// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseWriteAndSave {


// @LINE:20
def writePost(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "writePost")
}
                        

// @LINE:22
def savePost(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "savePost")
}
                        

// @LINE:21
def editPost(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "edit/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:23
def saveExisting(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "saveExistingPost")
}
                        

// @LINE:27
def deletePost(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deletePost/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseCategoryController {


// @LINE:34
def categoryList(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "allCategory")
}
                        

// @LINE:32
def createCategory(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "createCategory")
}
                        

// @LINE:36
def saveExisting(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "saveExistingCategory")
}
                        

// @LINE:33
def saveCategory(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "saveCategory")
}
                        

// @LINE:35
def editCategory(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editCategory/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:37
def deleteCategory(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deleteCategory/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:43
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:43
// @LINE:9
class ReverseHome {


// @LINE:43
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
        

// @LINE:41
// @LINE:40
// @LINE:17
// @LINE:16
package controllers.security.javascript {
import ReverseRouteContext.empty

// @LINE:41
// @LINE:40
// @LINE:17
// @LINE:16
class ReverseSecurity {


// @LINE:41
def invalidSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.security.Security.invalidSearch",
   """
      function(query) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "invalidRequest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("query", encodeURIComponent(query))})
      }
   """
)
                        

// @LINE:17
def verifyAndSignIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.security.Security.verifyAndSignIn",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "requestSignIn"})
      }
   """
)
                        

// @LINE:40
def invalid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.security.Security.invalid",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "invalid/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:16
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
        

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:12
package controllers.blog.javascript {
import ReverseRouteContext.empty

// @LINE:29
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
                        

// @LINE:29
// @LINE:13
def showPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.Home.showPost",
   """
      function(id) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "post/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "preview/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
      }
   """
)
                        

}
              

// @LINE:30
// @LINE:28
// @LINE:26
class ReversePostPublish {


// @LINE:26
def showAllPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.PostPublish.showAllPost",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showAllPost"})
      }
   """
)
                        

// @LINE:28
def publishPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.PostPublish.publishPost",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publish/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:30
def unpublishPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.PostPublish.unpublishPost",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unpublish/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseWriteAndSave {


// @LINE:20
def writePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.WriteAndSave.writePost",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "writePost"})
      }
   """
)
                        

// @LINE:22
def savePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.WriteAndSave.savePost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savePost"})
      }
   """
)
                        

// @LINE:21
def editPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.WriteAndSave.editPost",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def saveExisting : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.WriteAndSave.saveExisting",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveExistingPost"})
      }
   """
)
                        

// @LINE:27
def deletePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.WriteAndSave.deletePost",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePost/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseCategoryController {


// @LINE:34
def categoryList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.CategoryController.categoryList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allCategory"})
      }
   """
)
                        

// @LINE:32
def createCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.CategoryController.createCategory",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createCategory"})
      }
   """
)
                        

// @LINE:36
def saveExisting : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.CategoryController.saveExisting",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveExistingCategory"})
      }
   """
)
                        

// @LINE:33
def saveCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.CategoryController.saveCategory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveCategory"})
      }
   """
)
                        

// @LINE:35
def editCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.CategoryController.editCategory",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editCategory/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:37
def deleteCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.blog.CategoryController.deleteCategory",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteCategory/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:43
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:43
// @LINE:9
class ReverseHome {


// @LINE:43
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
        

// @LINE:41
// @LINE:40
// @LINE:17
// @LINE:16
package controllers.security.ref {


// @LINE:41
// @LINE:40
// @LINE:17
// @LINE:16
class ReverseSecurity {


// @LINE:41
def invalidSearch(query:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.security.Security.invalidSearch(query), HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "invalidSearch", Seq(classOf[String]), "GET", """""", _prefix + """invalidRequest/$query<[^/]+>""")
)
                      

// @LINE:17
def verifyAndSignIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.security.Security.verifyAndSignIn(), HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "verifyAndSignIn", Seq(), "POST", """""", _prefix + """requestSignIn""")
)
                      

// @LINE:40
def invalid(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.security.Security.invalid(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "invalid", Seq(classOf[String]), "GET", """invalid SignIn""", _prefix + """invalid/$email<[^/]+>""")
)
                      

// @LINE:16
def loginPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.security.Security.loginPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.security.Security", "loginPage", Seq(), "GET", """ security""", _prefix + """signin""")
)
                      

}
                          
}
        

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:13
// @LINE:12
package controllers.blog.ref {


// @LINE:29
// @LINE:13
// @LINE:12
class ReverseHome {


// @LINE:12
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.Home.home(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "home", Seq(), "GET", """ Blog Pages""", _prefix + """blog""")
)
                      

// @LINE:13
def showPost(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.Home.showPost(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.Home", "showPost", Seq(classOf[Int]), "GET", """""", _prefix + """post/$id<[^/]+>""")
)
                      

}
                          

// @LINE:30
// @LINE:28
// @LINE:26
class ReversePostPublish {


// @LINE:26
def showAllPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.PostPublish.showAllPost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.PostPublish", "showAllPost", Seq(), "GET", """CMS""", _prefix + """showAllPost""")
)
                      

// @LINE:28
def publishPost(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.PostPublish.publishPost(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.PostPublish", "publishPost", Seq(classOf[Int]), "GET", """""", _prefix + """publish/$id<[^/]+>""")
)
                      

// @LINE:30
def unpublishPost(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.PostPublish.unpublishPost(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.PostPublish", "unpublishPost", Seq(classOf[Int]), "GET", """""", _prefix + """unpublish/$id<[^/]+>""")
)
                      

}
                          

// @LINE:27
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseWriteAndSave {


// @LINE:20
def writePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.WriteAndSave.writePost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "writePost", Seq(), "GET", """post""", _prefix + """writePost""")
)
                      

// @LINE:22
def savePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.WriteAndSave.savePost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "savePost", Seq(), "POST", """""", _prefix + """savePost""")
)
                      

// @LINE:21
def editPost(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.WriteAndSave.editPost(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "editPost", Seq(classOf[Int]), "GET", """""", _prefix + """edit/$id<[^/]+>""")
)
                      

// @LINE:23
def saveExisting(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.WriteAndSave.saveExisting(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "saveExisting", Seq(), "POST", """""", _prefix + """saveExistingPost""")
)
                      

// @LINE:27
def deletePost(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.WriteAndSave.deletePost(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.WriteAndSave", "deletePost", Seq(classOf[Int]), "GET", """""", _prefix + """deletePost/$id<[^/]+>""")
)
                      

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseCategoryController {


// @LINE:34
def categoryList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.CategoryController.categoryList(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "categoryList", Seq(), "GET", """""", _prefix + """allCategory""")
)
                      

// @LINE:32
def createCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.CategoryController.createCategory(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "createCategory", Seq(), "GET", """""", _prefix + """createCategory""")
)
                      

// @LINE:36
def saveExisting(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.CategoryController.saveExisting(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "saveExisting", Seq(), "POST", """""", _prefix + """saveExistingCategory""")
)
                      

// @LINE:33
def saveCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.CategoryController.saveCategory(), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "saveCategory", Seq(), "POST", """""", _prefix + """saveCategory""")
)
                      

// @LINE:35
def editCategory(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.CategoryController.editCategory(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "editCategory", Seq(classOf[Int]), "GET", """""", _prefix + """editCategory/$id<[^/]+>""")
)
                      

// @LINE:37
def deleteCategory(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.blog.CategoryController.deleteCategory(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.blog.CategoryController", "deleteCategory", Seq(classOf[Int]), "GET", """""", _prefix + """deleteCategory/$id<[^/]+>""")
)
                      

}
                          
}
        
    