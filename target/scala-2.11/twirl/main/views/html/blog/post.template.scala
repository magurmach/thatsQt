
package views.html.blog

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
object post extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*4.3*/common/*4.9*/.blog.head("Becasue I can")),format.raw/*4.36*/("""
	"""),format.raw/*5.2*/("""</head>
	
	<body>
	<link rel="stylesheet" href=""""),_display_(/*8.32*/routes/*8.38*/.Assets.at("stylesheets/banner.css")),format.raw/*8.74*/("""">
	
	"""),_display_(/*10.3*/common/*10.9*/.blog.navbar("   Blogger Me")),format.raw/*10.38*/("""
	
	"""),format.raw/*12.2*/("""<div class="postbanner">
		<div class="posttitlebox">
			<div class="post-title">
			 Text Dummy Title
			</div>
			<div class="post-subtitle">
				with a nice and simply subtitle
			</div>
			
		</div>
	
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
                  DATE: Fri Nov 07 00:00:56 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/post.scala.html
                  HASH: b51fe4dae936b46231ef24a70fd866e7f1b71f70
                  MATRIX: 584->0|642->33|655->39|702->66|730->68|805->117|819->123|875->159|908->166|922->172|972->201|1003->205
                  LINES: 22->1|25->4|25->4|25->4|26->5|29->8|29->8|29->8|31->10|31->10|31->10|33->12
                  -- GENERATED --
              */
          