
package views.html.common

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
object head extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<title>
"""),_display_(/*4.2*/title),format.raw/*4.7*/("""
"""),format.raw/*5.1*/("""</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="icon" type="image/png" href=""""),_display_(/*12.42*/routes/*12.48*/.Assets.at("images/favicon.png")),format.raw/*12.80*/("""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/bootstrap-combined.min.css")),format.raw/*13.89*/("""">
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("stylesheets/main.css")),format.raw/*14.71*/("""">
<link rel="stylesheet" href=""""),_display_(/*15.31*/routes/*15.37*/.Assets.at("stylesheets/bootply.css")),format.raw/*15.74*/("""">
<link rel="stylesheet" href=""""),_display_(/*16.31*/routes/*16.37*/.Assets.at("css/font-awesome.min.css")),format.raw/*16.75*/("""">

<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("javascripts/jquery-1.11.1.js")),format.raw/*18.63*/(""""></script>
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("javascripts/bootstrap.js")),format.raw/*19.59*/(""""></script>

<style type="text/css">
.glyphicon """),format.raw/*22.12*/("""{"""),format.raw/*22.13*/("""
  """),format.raw/*23.3*/("""font-family: 'Glyphicons Halflings';
  src: url("""),_display_(/*24.13*/routes/*24.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot")),format.raw/*24.71*/(""");
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
"""),format.raw/*26.1*/("""</style>"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Nov 15 08:15:35 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/common/head.scala.html
                  HASH: 99cdd799a57dd9f9158058ae2c516a6670e52a9d
                  MATRIX: 729->1|833->17|861->19|895->28|919->33|946->34|1181->242|1196->248|1249->280|1309->313|1324->319|1397->371|1457->404|1472->410|1527->444|1587->477|1602->483|1660->520|1720->553|1735->559|1794->597|1839->615|1854->621|1917->663|1970->689|1985->695|2044->733|2120->781|2149->782|2179->785|2255->834|2270->840|2343->892|2373->895|2401->896|2429->897
                  LINES: 26->1|29->1|31->3|32->4|32->4|33->5|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|50->22|50->22|51->23|52->24|52->24|52->24|53->25|53->25|54->26
                  -- GENERATED --
              */
          