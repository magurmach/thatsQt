
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
object editPost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.posts.Post,List[models.posts.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: models.posts.Post, categories: List[models.posts.Category]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import play.api.libs.json.Json

Seq[Any](format.raw/*1.68*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*8.3*/common/*8.9*/.blog.head("Becasue I can")),format.raw/*8.36*/("""
	
	"""),format.raw/*10.2*/("""<script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.at("javascripts/bootstrap-select.min.js")),format.raw/*10.71*/(""""></script>
	</head>
	<body>
		<script type="text/javascript" src=""""),_display_(/*13.40*/routes/*13.46*/.Assets.at("tinymce/js/tinymce/tinymce.min.js")),format.raw/*13.93*/(""""></script>
		<script type="text/javascript">
			var data = """),_display_(/*15.16*/Html(Json.obj(  
			  "body" -> post.postbody 
			).toString)),format.raw/*17.15*/("""; 
			tinyMCE.init("""),format.raw/*18.17*/("""{"""),format.raw/*18.18*/("""
				"""),format.raw/*19.5*/("""setup : function(ed) """),format.raw/*19.26*/("""{"""),format.raw/*19.27*/("""
			      """),format.raw/*20.10*/("""ed.on('init',function(e)"""),format.raw/*20.34*/("""{"""),format.raw/*20.35*/("""
			      	"""),format.raw/*21.11*/("""tinyMCE.get("e1m1").setContent(data.body);
			      """),format.raw/*22.10*/("""}"""),format.raw/*22.11*/(""");
			   """),format.raw/*23.7*/("""}"""),format.raw/*23.8*/(""",
				selector: "textarea",
				auto_focus: "e1m1",
				theme: "modern",
				browser_spellcheck : true,
				plugins: "save",
				save_enablewhendirty: false,
				toolbar: "save | insertfile undo redo | styleselect | bold italic",
				width: 1000,
				height:350,
				content_css: """"),_display_(/*33.20*/routes/*33.26*/.Assets.at("stylesheets/writepost.css")),format.raw/*33.65*/(""""
			"""),format.raw/*34.4*/("""}"""),format.raw/*34.5*/(""");
		</script>
		<div class="container">
       		 <div class="row clearfix">
				<h2 calss="text-info">
					Edit Post
				</h2>
				<form role="form" action="/saveExistingPost" method="POST">
						<input class="form-control" name="id" value=""""),_display_(/*42.53*/post/*42.57*/.getId()),format.raw/*42.65*/("""" type="hidden"/>
						<label>Title</label><input class="form-control" name="title" value=""""),_display_(/*43.76*/post/*43.80*/.getTitle()),format.raw/*43.91*/(""""/>
						<label>Sub-title</label><input class="form-control" name="sub-title" value=""""),_display_(/*44.84*/post/*44.88*/.getSubtitle()),format.raw/*44.102*/(""""/>
						<label>Select Category</label>
						<select class="selectpicker" style="display: none;" name="category">
							"""),_display_(/*47.9*/for(category<-categories) yield /*47.34*/{_display_(Seq[Any](format.raw/*47.35*/("""
								"""),format.raw/*48.9*/("""<option value='"""),_display_(/*48.25*/category/*48.33*/.getId()),format.raw/*48.41*/("""'>"""),_display_(/*48.44*/category/*48.52*/.getName()),format.raw/*48.62*/("""</option>
							""")))}),format.raw/*49.9*/("""
						"""),format.raw/*50.7*/("""</select>
						</br>
						<label>Story Summary</label><input class="form-control" name="summary" value=""""),_display_(/*52.86*/post/*52.90*/.getSummary()),format.raw/*52.103*/(""""/>
						<br>
					<textarea id="e1m1" name="e1m1" class="mceEditor"></textarea>
					<br><br>
				</form>
			</div>
		</div>
		<script type="text/javascript">
		</script>
	</body>
</html>"""))}
  }

  def render(post:models.posts.Post,categories:List[models.posts.Category]): play.twirl.api.HtmlFormat.Appendable = apply(post,categories)

  def f:((models.posts.Post,List[models.posts.Category]) => play.twirl.api.HtmlFormat.Appendable) = (post,categories) => apply(post,categories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 08:58:50 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/editPost.scala.html
                  HASH: f3d9b309d78f2ff4a771435b10d10b6b6feae08a
                  MATRIX: 770->1|954->67|982->102|1009->103|1067->136|1080->142|1127->169|1158->173|1199->187|1214->193|1284->242|1379->310|1394->316|1462->363|1550->424|1632->485|1679->504|1708->505|1740->510|1789->531|1818->532|1856->542|1908->566|1937->567|1976->578|2056->630|2085->631|2121->640|2149->641|2458->923|2473->929|2533->968|2565->973|2593->974|2866->1220|2879->1224|2908->1232|3028->1325|3041->1329|3073->1340|3187->1427|3200->1431|3236->1445|3386->1569|3427->1594|3466->1595|3502->1604|3545->1620|3562->1628|3591->1636|3621->1639|3638->1647|3669->1657|3717->1675|3751->1682|3885->1789|3898->1793|3933->1806
                  LINES: 26->1|29->1|31->4|32->5|35->8|35->8|35->8|37->10|37->10|37->10|37->10|40->13|40->13|40->13|42->15|44->17|45->18|45->18|46->19|46->19|46->19|47->20|47->20|47->20|48->21|49->22|49->22|50->23|50->23|60->33|60->33|60->33|61->34|61->34|69->42|69->42|69->42|70->43|70->43|70->43|71->44|71->44|71->44|74->47|74->47|74->47|75->48|75->48|75->48|75->48|75->48|75->48|75->48|76->49|77->50|79->52|79->52|79->52
                  -- GENERATED --
              */
          