
package views.html.common.blog

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
object head extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<title>
"""),_display_(/*4.2*/title),format.raw/*4.7*/("""
"""),format.raw/*5.1*/("""</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="description" content="">
<meta name="viewport" content="width=device-width">       

<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*12.76*/("""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/bootply.css")),format.raw/*13.74*/("""">
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("css/font-awesome.min.css")),format.raw/*14.75*/("""">
<link rel="stylesheet" href=""""),_display_(/*15.31*/routes/*15.37*/.Assets.at("stylesheets/blogmain.css")),format.raw/*15.75*/("""">


<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("javascripts/jquery-1.11.1.js")),format.raw/*18.63*/(""""></script>
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("javascripts/bootstrap.js")),format.raw/*19.59*/(""""></script>
<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("javascripts/modernizr.js")),format.raw/*20.59*/(""""></script>

<style type="text/css">
.glyphicon """),format.raw/*23.12*/("""{"""),format.raw/*23.13*/("""
  """),format.raw/*24.3*/("""font-family: 'Glyphicons Halflings';
  src: url("""),_display_(/*25.13*/routes/*25.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot")),format.raw/*25.71*/(""");
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""
"""),format.raw/*27.1*/("""</style>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Nov 06 16:43:53 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/common/blog/head.scala.html
                  HASH: 576f36a412b906d7e63450e9b7b1d086c25cc3ed
                  MATRIX: 516->1|619->16|647->18|681->27|705->32|732->33|982->256|997->262|1057->301|1117->334|1132->340|1190->377|1250->410|1265->416|1324->454|1384->487|1399->493|1458->531|1504->550|1519->556|1582->598|1635->624|1650->630|1709->668|1762->694|1777->700|1836->738|1912->786|1941->787|1971->790|2047->839|2062->845|2135->897|2165->900|2193->901|2221->902
                  LINES: 19->1|22->1|24->3|25->4|25->4|26->5|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|44->23|44->23|45->24|46->25|46->25|46->25|47->26|47->26|48->27
                  -- GENERATED --
              */
          