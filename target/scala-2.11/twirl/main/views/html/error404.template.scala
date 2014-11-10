
package views.html

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
object error404 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(link: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*6.3*/common/*6.9*/.blog.head("Becasue I can")),format.raw/*6.36*/("""
	"""),format.raw/*7.2*/("""</head>
	<body>
	<div class="container">
		<div class="largeHeader">
			Occured, a 404 has!
		</div>
		<div class="post">
	                    <section>
	                        <div class="post-preview col-xs-10 no-gutter">
	                        
	                        <div class=" col-xs-2 no-gutter">
	                        	<div class="side">
	                            	<img src=""""),_display_(/*19.42*/routes/*19.48*/.Assets.at("images/404-Jedi.jpg")),format.raw/*19.81*/("""" class="user-icon user-1" alt="user-image">
	                            </div>
	                        </div>
	                        
	                        <h2><a><div class="mediumHeader">Failed I have to find <lp>../"""),_display_(/*23.89*/link),format.raw/*23.93*/("""</lp></div></a></h2>
	                        <p><div class = "message">Dark side I sense in you. Disturbance the reason is, I can't find the page.
	                        Typing mistake it must be. Or failed I really have. Sorry I am for.</div></p>
	
	                        <p class="meta">
	                        </p>
	                        </div>	
	                    </section>
	    </div>
	</body>
</html>"""))}
  }

  def render(link:String): play.twirl.api.HtmlFormat.Appendable = apply(link)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (link) => apply(link)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 10 00:10:12 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/error404.scala.html
                  HASH: dc3933c24e5663fe04ff17d128b1aa5853eb1c96
                  MATRIX: 508->1|610->15|638->17|696->50|709->56|756->83|784->85|1207->481|1222->487|1276->520|1530->747|1555->751
                  LINES: 19->1|22->1|24->3|27->6|27->6|27->6|28->7|40->19|40->19|40->19|44->23|44->23
                  -- GENERATED --
              */
          