
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
	<link href='http://fonts.googleapis.com/css?family=Anton' rel='stylesheet' type='text/css'>
	"""),_display_(/*10.3*/common/*10.9*/.blog.navbar("   Blogger Me")),format.raw/*10.38*/("""
	
	"""),format.raw/*12.2*/("""<div class="postbanner">
		<div class="posttitlebox">
			<div class="post-quote">
			 You don’t have to say everything to say something.
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
                  DATE: Mon Nov 10 00:10:12 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/post.scala.html
                  HASH: c837b7ec195d9f7d8255c522369ac373d22fbb71
                  MATRIX: 584->0|642->33|655->39|702->66|730->68|805->117|819->123|875->159|999->257|1013->263|1063->292|1094->296
                  LINES: 22->1|25->4|25->4|25->4|26->5|29->8|29->8|29->8|31->10|31->10|31->10|33->12
                  -- GENERATED --
              */
          