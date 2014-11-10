
package views.html.security

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
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
                  DATE: Mon Nov 10 00:10:12 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/security/signin.scala.html
                  HASH: f981368584e1b0ab4982645501e1d835042bd646
                  MATRIX: 590->1|659->45|673->51|730->88|758->90|867->172|882->178|939->214
                  LINES: 22->2|25->5|25->5|25->5|26->6|30->10|30->10|30->10
                  -- GENERATED --
              */
          