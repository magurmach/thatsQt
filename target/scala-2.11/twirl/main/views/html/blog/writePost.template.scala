
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
object writePost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.posts.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: List[models.posts.Category]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*6.3*/common/*6.9*/.blog.head("Becasue I can")),format.raw/*6.36*/("""
	
	"""),format.raw/*8.2*/("""<script src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.at("javascripts/bootstrap-select.min.js")),format.raw/*8.71*/(""""></script>
	
	</head>
	<body>
		<script type="text/javascript" src=""""),_display_(/*12.40*/routes/*12.46*/.Assets.at("tinymce/js/tinymce/tinymce.min.js")),format.raw/*12.93*/(""""></script>
		<script type="text/javascript">
		tinymce.init("""),format.raw/*14.16*/("""{"""),format.raw/*14.17*/("""
			"""),format.raw/*15.4*/("""selector: "textarea",
			auto_focus: "e1m1",
			theme: "modern",
			browser_spellcheck : true,
			plugins: "save",
			save_enablewhendirty: false,
			toolbar: "save | insertfile undo redo | styleselect | bold italic",
			width: 1000,
			height:350,
			content_css: """"),_display_(/*24.19*/routes/*24.25*/.Assets.at("stylesheets/writepost.css")),format.raw/*24.64*/(""""
		"""),format.raw/*25.3*/("""}"""),format.raw/*25.4*/(""");
			
		</script>
		<div class="container">
       		 <div class="row clearfix">
				<h2 calss="text-info">
					Write Post
				</h2>
				
				<form role="form" action="/savePost" method="POST">
						<label>Title</label><input class="form-control" name="title"/>
					<div class="form-group">
						<label>Sub-title</label><input class="form-control" name="sub-title"/>
					</div>
						<label>Select Category</label>
						<select class="selectpicker" style="display: none;" name="category">
							"""),_display_(/*41.9*/for(category<-categories) yield /*41.34*/{_display_(Seq[Any](format.raw/*41.35*/("""
								"""),format.raw/*42.9*/("""<option value='"""),_display_(/*42.25*/category/*42.33*/.getId()),format.raw/*42.41*/("""'>"""),_display_(/*42.44*/category/*42.52*/.getName()),format.raw/*42.62*/("""</option>
							""")))}),format.raw/*43.9*/("""
						"""),format.raw/*44.7*/("""</select>
						</br>
						<label>Story Summary</label><input class="form-control" name="summary"/>
						<br>
					<textarea id="e1m1" name="postbody"></textarea>
					<br><br>
				</form>
			</div>
		</div>
	</body>
</html>"""))}
  }

  def render(categories:List[models.posts.Category]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((List[models.posts.Category]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 08:57:10 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/writePost.scala.html
                  HASH: 591f75ea8858ce85246323a23b8781321218b534
                  MATRIX: 753->1|882->42|910->44|968->77|981->83|1028->110|1058->114|1098->128|1112->134|1181->183|1278->253|1293->259|1361->306|1450->367|1479->368|1510->372|1804->639|1819->645|1879->684|1910->688|1938->689|2468->1193|2509->1218|2548->1219|2584->1228|2627->1244|2644->1252|2673->1260|2703->1263|2720->1271|2751->1281|2799->1299|2833->1306
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|36->8|36->8|36->8|36->8|40->12|40->12|40->12|42->14|42->14|43->15|52->24|52->24|52->24|53->25|53->25|69->41|69->41|69->41|70->42|70->42|70->42|70->42|70->42|70->42|70->42|71->43|72->44
                  -- GENERATED --
              */
          