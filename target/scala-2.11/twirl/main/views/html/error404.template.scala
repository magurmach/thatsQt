
package views.html

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
                  DATE: Wed Nov 12 22:19:33 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/error404.scala.html
                  HASH: 90460dfc54d0840965221015d22afd83c8ab25c7
                  MATRIX: 726->1|828->15|856->17|914->50|927->56|974->83|1002->85|1425->481|1440->487|1494->520|1748->747|1773->751
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|47->19|47->19|47->19|51->23|51->23
                  -- GENERATED --
              */
          