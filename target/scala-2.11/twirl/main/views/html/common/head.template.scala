
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

<link rel="stylesheet" href=""""),_display_(/*7.31*/routes/*7.37*/.Assets.at("stylesheets/bootstrap-combined.min.css")),format.raw/*7.89*/("""">
<link rel="stylesheet" href=""""),_display_(/*8.31*/routes/*8.37*/.Assets.at("stylesheets/main.css")),format.raw/*8.71*/("""">
<link rel="stylesheet" href=""""),_display_(/*9.31*/routes/*9.37*/.Assets.at("stylesheets/bootply.css")),format.raw/*9.74*/("""">
<link rel="stylesheet" href=""""),_display_(/*10.31*/routes/*10.37*/.Assets.at("css/font-awesome.min.css")),format.raw/*10.75*/("""">

<script src=""""),_display_(/*12.15*/routes/*12.21*/.Assets.at("javascripts/jquery-1.11.1.js")),format.raw/*12.63*/(""""></script>
<script src=""""),_display_(/*13.15*/routes/*13.21*/.Assets.at("javascripts/bootstrap.js")),format.raw/*13.59*/(""""></script>

<style type="text/css">
.glyphicon """),format.raw/*16.12*/("""{"""),format.raw/*16.13*/("""
  """),format.raw/*17.3*/("""font-family: 'Glyphicons Halflings';
  src: url("""),_display_(/*18.13*/routes/*18.19*/.Assets.at("fonts/glyphicons-halflings-regular.eot")),format.raw/*18.71*/(""");
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""
"""),format.raw/*20.1*/("""</style>"""))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 03 08:16:33 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/common/head.scala.html
                  HASH: 10f6c50f2809d3fe5aa1f7a9462d80ff10b2a539
                  MATRIX: 511->1|615->17|643->19|677->28|701->33|728->34|794->74|808->80|880->132|939->165|953->171|1007->205|1066->238|1080->244|1137->281|1197->314|1212->320|1271->358|1316->376|1331->382|1394->424|1447->450|1462->456|1521->494|1597->542|1626->543|1656->546|1732->595|1747->601|1820->653|1850->656|1878->657|1906->658
                  LINES: 19->1|22->1|24->3|25->4|25->4|26->5|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|33->12|33->12|33->12|34->13|34->13|34->13|37->16|37->16|38->17|39->18|39->18|39->18|40->19|40->19|41->20
                  -- GENERATED --
              */
          