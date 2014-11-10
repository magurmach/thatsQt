
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
object invalid extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mail: String):play.twirl.api.HtmlFormat.Appendable = {
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
			Invalid, the login attempt is!
		</div>
		<div class="post">
	                    <section>
	                        <div class="post-preview col-xs-10 no-gutter">
	                        
	                        <div class=" col-xs-2 no-gutter">
	                        	<div class="side">
	                            	<img src=""""),_display_(/*19.42*/routes/*19.48*/.Assets.at("images/404-Jedi.jpg")),format.raw/*19.81*/("""" class="user-icon user-1" alt="user-image">
	                            </div>
	                        </div>
	                        
	                        <h2><a><div class="mediumHeader">Invalid your demands are <lp>"""),_display_(/*23.89*/mail),format.raw/*23.93*/("""</lp></div></a></h2>
	                        <p><div class = "message">Forgot about yourself, you have. Lost you are, yes. Go home you should,
	                        drunk you are</div></p>
	                        <p class="meta">
	                        </p>
	                        </div>	
	                    </section>
	    </div>
	</body>
</html>"""))}
  }

  def render(mail:String): play.twirl.api.HtmlFormat.Appendable = apply(mail)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (mail) => apply(mail)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 10 00:10:12 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/invalid.scala.html
                  HASH: fb7112fa9999b73c635694633860994c681194fc
                  MATRIX: 507->1|609->15|637->17|695->50|708->56|755->83|783->85|1217->492|1232->498|1286->531|1540->758|1565->762
                  LINES: 19->1|22->1|24->3|27->6|27->6|27->6|28->7|40->19|40->19|40->19|44->23|44->23
                  -- GENERATED --
              */
          