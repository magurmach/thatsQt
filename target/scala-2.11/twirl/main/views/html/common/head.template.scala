
package views.html.common

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
  def apply/*1.2*/(title : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<title>
"""),_display_(/*4.2*/title),format.raw/*4.7*/("""
"""),format.raw/*5.1*/("""</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href=""""),_display_(/*8.31*/routes/*8.37*/.Assets.at("stylesheets/bootstrap-combined.min.css")),format.raw/*8.89*/("""">
<link rel="stylesheet" href=""""),_display_(/*9.31*/routes/*9.37*/.Assets.at("stylesheets/main.css")),format.raw/*9.71*/("""">
<link rel="stylesheet" href=""""),_display_(/*10.31*/routes/*10.37*/.Assets.at("stylesheets/bootply.css")),format.raw/*10.74*/("""">
<link rel="stylesheet" href=""""),_display_(/*11.31*/routes/*11.37*/.Assets.at("css/font-awesome.min.css")),format.raw/*11.75*/("""">

<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("javascripts/jquery-1.11.1.js")),format.raw/*13.63*/(""""></script>
<script src=""""),_display_(/*14.15*/routes/*14.21*/.Assets.at("javascripts/bootstrap.js")),format.raw/*14.59*/(""""></script>

<style type="text/css">
.glyphicon """),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""
  """),format.raw/*18.3*/("""font-family: 'Glyphicons Halflings';
  src: url("""),_display_(/*19.13*/routes/*19.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot")),format.raw/*19.71*/(""");
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
"""),format.raw/*21.1*/("""</style>"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 10 18:04:18 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/common/head.scala.html
                  HASH: 1bb3b6d9dcd37a1809875b5e972911b40d920e51
                  MATRIX: 511->1|615->17|643->19|677->28|701->33|728->34|863->143|877->149|949->201|1008->234|1022->240|1076->274|1136->307|1151->313|1209->350|1269->383|1284->389|1343->427|1388->445|1403->451|1466->493|1519->519|1534->525|1593->563|1669->611|1698->612|1728->615|1804->664|1819->670|1892->722|1922->725|1950->726|1978->727
                  LINES: 19->1|22->1|24->3|25->4|25->4|26->5|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|34->13|34->13|34->13|35->14|35->14|35->14|38->17|38->17|39->18|40->19|40->19|40->19|41->20|41->20|42->21
                  -- GENERATED --
              */
          