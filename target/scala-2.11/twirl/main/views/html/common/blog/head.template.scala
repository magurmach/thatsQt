
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
<link rel="stylesheet" href=""""),_display_(/*16.31*/routes/*16.37*/.Assets.at("stylesheets/custombloghome.css")),format.raw/*16.81*/("""">


<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("javascripts/jquery-1.11.1.js")),format.raw/*19.63*/(""""></script>
<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("javascripts/bootstrap.js")),format.raw/*20.59*/(""""></script>
<script src=""""),_display_(/*21.15*/routes/*21.21*/.Assets.at("javascripts/modernizr.js")),format.raw/*21.59*/(""""></script>

<style type="text/css">
.glyphicon """),format.raw/*24.12*/("""{"""),format.raw/*24.13*/("""
  """),format.raw/*25.3*/("""font-family: 'Glyphicons Halflings';
  src: url("""),_display_(/*26.13*/routes/*26.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot")),format.raw/*26.71*/(""");
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""
"""),format.raw/*28.1*/("""</style>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Nov 06 18:36:50 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/common/blog/head.scala.html
                  HASH: d6eb5925e0f1d9a2343e6ad5beaf981f611cf0fc
                  MATRIX: 516->1|619->16|647->18|681->27|705->32|732->33|982->256|997->262|1057->301|1117->334|1132->340|1190->377|1250->410|1265->416|1324->454|1384->487|1399->493|1458->531|1518->564|1533->570|1598->614|1644->633|1659->639|1722->681|1775->707|1790->713|1849->751|1902->777|1917->783|1976->821|2052->869|2081->870|2111->873|2187->922|2202->928|2275->980|2305->983|2333->984|2361->985
                  LINES: 19->1|22->1|24->3|25->4|25->4|26->5|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|45->24|45->24|46->25|47->26|47->26|47->26|48->27|48->27|49->28
                  -- GENERATED --
              */
          