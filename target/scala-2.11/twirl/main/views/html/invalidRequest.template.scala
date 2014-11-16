
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
object invalidRequest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(query: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*5.3*/common/*5.9*/.blog.head("Becasue I can")),format.raw/*5.36*/("""
	"""),format.raw/*6.2*/("""</head>
	<body>
	<div class="container">
		<div class="largeHeader">
			Invalid, your requests are!
		</div>
		<div class="post">
	                    <section>
	                        <div class="post-preview col-xs-10 no-gutter">
	                        
	                        <div class=" col-xs-2 no-gutter">
	                        	<div class="side">
	                            	<img src=""""),_display_(/*18.42*/routes/*18.48*/.Assets.at("images/404-Jedi.jpg")),format.raw/*18.81*/("""" class="user-icon user-1" alt="user-image">
	                            </div>
	                        </div>
	                        
	                        <h2><a><div class="mediumHeader">Invalid your demands are to access <lp>"""),_display_(/*22.99*/query),format.raw/*22.104*/("""</lp></div></a></h2>
	                        <p><div class = "message">Darkness I see in you. Bad your intentions are, must. Jedi you are not. Access this you can not.</div></p>
	                        <p class="meta">
	                        </p>
	                        </div>
	                    </section>
	    </div>
	</body>
</html>"""))}
  }

  def render(query:String): play.twirl.api.HtmlFormat.Appendable = apply(query)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (query) => apply(query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 12:17:42 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/invalidRequest.scala.html
                  HASH: 47e55599c39d9cee4e29e60aab3670510dc38139
                  MATRIX: 732->1|835->16|862->17|920->50|933->56|980->83|1008->85|1439->489|1454->495|1508->528|1772->765|1799->770
                  LINES: 26->1|29->1|30->2|33->5|33->5|33->5|34->6|46->18|46->18|46->18|50->22|50->22
                  -- GENERATED --
              */
          