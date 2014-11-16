
package views.html.blog

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
object post extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.posts.Post,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: models.posts.Post):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import play.api.libs.json.Json

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*8.3*/common/*8.9*/.blog.head("Becasue I can")),format.raw/*8.36*/("""
	"""),format.raw/*9.2*/("""</head>
	<script type="text/javascript">
			function getBody()"""),format.raw/*11.22*/("""{"""),format.raw/*11.23*/("""
				"""),format.raw/*12.5*/("""var data = """),_display_(/*12.17*/Html(Json.obj(  
				  "body" -> post.postbody 
				).toString)),format.raw/*14.16*/(""";
				$("#replacer").replaceWith("<div class=\"modelToBody\">"+data.body+"</div>");
			"""),format.raw/*16.4*/("""}"""),format.raw/*16.5*/("""
	"""),format.raw/*17.2*/("""</script>
	<body onload="getBody()">
	<link rel="stylesheet" href=""""),_display_(/*19.32*/routes/*19.38*/.Assets.at("stylesheets/banner.css")),format.raw/*19.74*/("""">
	<link href='http://fonts.googleapis.com/css?family=Anton' rel='stylesheet' type='text/css'>
	"""),_display_(/*21.3*/common/*21.9*/.blog.navbar("   Blogger Me")),format.raw/*21.38*/("""
	"""),format.raw/*22.2*/("""<div class="postbanner">
		<div class="posttitlebox">
			<div class="post-quote">
			 You don’t have to say everything to say something.
			</div>
			<div class="post-subtitle">
				with a nice and simply subtitle
			</div>
		</div>
	</div>
	<br>
	<div class="afterPostBanner">
		<div class="container">
	        <div class="row">
		
				<div class="col-xs-12 main-content single-content">
					<p class="meta">
						<a class="">Shakib Ahmed</a> in <a>"""),_display_(/*39.43*/post/*39.47*/.getCategory().getName()),format.raw/*39.71*/("""</a> <i class="link-spacer"></i>
						<i class="entypo-bookmark"></i> """),_display_(/*40.40*/post/*40.44*/.getPostDate()),format.raw/*40.58*/("""
					"""),format.raw/*41.6*/("""</p>
					<h1>"""),_display_(/*42.11*/post/*42.15*/.getTitle()),format.raw/*42.26*/("""</h1>
					<p class="subtitle">"""),_display_(/*43.27*/post/*43.31*/.getSubtitle()),format.raw/*43.45*/("""</p>
					
					<div class="modelToBody" id="replacer">
					</div>
					
				</div>
			</div>
		</div>
	</div>
	</body>
</html>"""))}
  }

  def render(post:models.posts.Post): play.twirl.api.HtmlFormat.Appendable = apply(post)

  def f:((models.posts.Post) => play.twirl.api.HtmlFormat.Appendable) = (post) => apply(post)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 09:01:49 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/post.scala.html
                  HASH: 291c24ae003b0820a2880ee509512ae77c83740a
                  MATRIX: 738->1|881->26|909->61|936->62|994->95|1007->101|1054->128|1082->130|1172->192|1201->193|1233->198|1272->210|1356->273|1470->360|1498->361|1527->363|1622->431|1637->437|1694->473|1818->571|1832->577|1882->606|1911->608|2392->1062|2405->1066|2450->1090|2549->1162|2562->1166|2597->1180|2630->1186|2672->1201|2685->1205|2717->1216|2776->1248|2789->1252|2824->1266
                  LINES: 26->1|29->1|31->4|32->5|35->8|35->8|35->8|36->9|38->11|38->11|39->12|39->12|41->14|43->16|43->16|44->17|46->19|46->19|46->19|48->21|48->21|48->21|49->22|66->39|66->39|66->39|67->40|67->40|67->40|68->41|69->42|69->42|69->42|70->43|70->43|70->43
                  -- GENERATED --
              */
          