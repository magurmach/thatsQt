
package views.html.common.blog

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
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<title>
"""),_display_(/*4.2*/title),format.raw/*4.7*/("""
"""),format.raw/*5.1*/("""</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width">       

<link rel="icon" type="image/png" href=""""),_display_(/*11.42*/routes/*11.48*/.Assets.at("images/favicon.png")),format.raw/*11.80*/("""">
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*12.76*/("""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.at("stylesheets/bootply.css")),format.raw/*13.74*/("""">
<link rel="stylesheet" href=""""),_display_(/*14.31*/routes/*14.37*/.Assets.at("css/font-awesome.min.css")),format.raw/*14.75*/("""">
<link rel="stylesheet" href=""""),_display_(/*15.31*/routes/*15.37*/.Assets.at("stylesheets/blogmain.css")),format.raw/*15.75*/("""">
<link rel="stylesheet" href=""""),_display_(/*16.31*/routes/*16.37*/.Assets.at("stylesheets/custombloghome.css")),format.raw/*16.81*/("""">
<link rel="stylesheet" href=""""),_display_(/*17.31*/routes/*17.37*/.Assets.at("stylesheets/bootstrap-select.min.css")),format.raw/*17.87*/("""">


<script src=""""),_display_(/*20.15*/routes/*20.21*/.Assets.at("javascripts/jquery-1.11.1.js")),format.raw/*20.63*/(""""></script>
<script src=""""),_display_(/*21.15*/routes/*21.21*/.Assets.at("javascripts/bootstrap.js")),format.raw/*21.59*/(""""></script>
<script src=""""),_display_(/*22.15*/routes/*22.21*/.Assets.at("javascripts/modernizr.js")),format.raw/*22.59*/(""""></script>

<style type="text/css">
.glyphicon """),format.raw/*25.12*/("""{"""),format.raw/*25.13*/("""
  """),format.raw/*26.3*/("""font-family: 'Glyphicons Halflings';
  src: url("""),_display_(/*27.13*/routes/*27.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot")),format.raw/*27.71*/(""");
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""
"""),format.raw/*29.1*/("""</style>
"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 08:47:31 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/common/blog/head.scala.html
                  HASH: d1e849036b6ba4f5f8ffc029245929baaedb9515
                  MATRIX: 734->1|837->16|865->18|899->27|923->32|950->33|1174->230|1189->236|1242->268|1302->301|1317->307|1377->346|1437->379|1452->385|1510->422|1570->455|1585->461|1644->499|1704->532|1719->538|1778->576|1838->609|1853->615|1918->659|1978->692|1993->698|2064->748|2110->767|2125->773|2188->815|2241->841|2256->847|2315->885|2368->911|2383->917|2442->955|2518->1003|2547->1004|2577->1007|2653->1056|2668->1062|2741->1114|2771->1117|2799->1118|2827->1119
                  LINES: 26->1|29->1|31->3|32->4|32->4|33->5|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|53->25|53->25|54->26|55->27|55->27|55->27|56->28|56->28|57->29
                  -- GENERATED --
              */
          