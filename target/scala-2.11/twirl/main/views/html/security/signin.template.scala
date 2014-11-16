
package views.html.security

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
	<head>
		"""),_display_(/*5.4*/common/*5.10*/.blog.head("Becasue I can - Sign In")),format.raw/*5.47*/("""
	"""),format.raw/*6.2*/("""</head>
	
  	<body cz-shortcut-listen="true">
  	
		<link rel="stylesheet" href=""""),_display_(/*10.33*/routes/*10.39*/.Assets.at("stylesheets/signin.css")),format.raw/*10.75*/("""">

	    <div class="container">
		      <form class="form-signin" role="form" action="/requestSignIn" method="POST">
		        <h2 class="form-signin-heading">Please sign in</h2>
		        <input type="email" class="form-control" placeholder="Email address" required="" autofocus="" name="email">
		        <input type="password" class="form-control" placeholder="Password" required="" name="password">
		        <br>
		        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		      </form>
		</div>
	
	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 12 22:19:33 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/security/signin.scala.html
                  HASH: 95319d8d6fc1aebfa7f3c144a964f6f5c29f59a2
                  MATRIX: 808->1|877->45|891->51|948->88|976->90|1085->172|1100->178|1157->214
                  LINES: 29->2|32->5|32->5|32->5|33->6|37->10|37->10|37->10
                  -- GENERATED --
              */
          