
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
object editCategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.posts.Category,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(category: models.posts.Category):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*6.3*/common/*6.9*/.blog.head("Becasue I can")),format.raw/*6.36*/("""
	"""),format.raw/*7.2*/("""</head>
	<body>
		<script type="text/javascript">
			function livePreview()
			"""),format.raw/*11.4*/("""{"""),format.raw/*11.5*/("""
				"""),format.raw/*12.5*/("""var title="<h2>" + $("#catTitle").val() +"</h2>";
				var temp="\""+$("#catImgLink").val()+"\"";
				var link="<a href=\"category.html\"><img src="+temp+" alt=\"category-image\"></a>";
				$("#liveView").replaceWith("<div class=\"liveView\">"+title+link+"</div>");
			"""),format.raw/*16.4*/("""}"""),format.raw/*16.5*/("""
		"""),format.raw/*17.3*/("""</script>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-6 column">
					<button class="btn btn-success" onclick="livePreview()">Preview</button>
					<form class="form-horizontal" role="form" action="/saveExistingCategory" method="post">
						<input class="form-control" name="id" type="hidden" value='"""),_display_(/*23.67*/category/*23.75*/.getId()),format.raw/*23.83*/("""'>
						<label>Category Title</label><input class="form-control" name="title" id="catTitle" value='"""),_display_(/*24.99*/category/*24.107*/.getName()),format.raw/*24.117*/("""'/>
						<label>Image Link</label><input class="form-control" name="link" id="catImgLink" value=""""),_display_(/*25.96*/category/*25.104*/.getImageDirectory()),format.raw/*25.124*/(""""/>
						<br>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								 <button type="submit" class="btn btn-default">Submit</button>
							</div>
						</div>
					</form>
				</div>
				<div class="col-md-6 column">
						<div class="category-preview col-xs-6 col-sm-4 ">
                            <div id="liveView">
							</div>
                        </div>
				</div>
			</div>
		</div>
	</body>
</html>"""))}
  }

  def render(category:models.posts.Category): play.twirl.api.HtmlFormat.Appendable = apply(category)

  def f:((models.posts.Category) => play.twirl.api.HtmlFormat.Appendable) = (category) => apply(category)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 02:09:14 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/editCategory.scala.html
                  HASH: 75666dbf96d889f3615f21f0d44670927e5e841d
                  MATRIX: 750->1|871->34|899->36|957->69|970->75|1017->102|1045->104|1151->183|1179->184|1211->189|1506->457|1534->458|1564->461|1928->798|1945->806|1974->814|2102->915|2120->923|2152->933|2278->1032|2296->1040|2338->1060
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|39->11|39->11|40->12|44->16|44->16|45->17|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25
                  -- GENERATED --
              */
          