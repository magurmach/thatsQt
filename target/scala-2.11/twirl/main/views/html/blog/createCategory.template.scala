
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
object createCategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*4.3*/common/*4.9*/.blog.head("Becasue I can")),format.raw/*4.36*/("""
	"""),format.raw/*5.2*/("""</head>
	<body>
		<script type="text/javascript">
			function livePreview()
			"""),format.raw/*9.4*/("""{"""),format.raw/*9.5*/("""
				"""),format.raw/*10.5*/("""var title="<h2>" + $("#catTitle").val() +"</h2>";
				var temp="\""+$("#catImgLink").val()+"\"";
				var link="<a href=\"category.html\"><img src="+temp+" alt=\"category-image\"></a>";
				$("#liveView").replaceWith("<div class=\"liveView\">"+title+link+"</div>");
			"""),format.raw/*14.4*/("""}"""),format.raw/*14.5*/("""
		"""),format.raw/*15.3*/("""</script>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-6 column">
					<button class="btn btn-success" onclick="livePreview()">Preview</button>
					<form class="form-horizontal" role="form" action="/saveCategory" method="post">
						<label>Category Title</label><input class="form-control" name="title" id="catTitle"/>
						<label>Image Link</label><input class="form-control" name="link" id="catImgLink"/>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 01:33:06 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/createCategory.scala.html
                  HASH: 46cd5dc6599a4a68157a86282b649cfa4562636e
                  MATRIX: 812->0|870->33|883->39|930->66|958->68|1063->147|1090->148|1122->153|1417->421|1445->422|1475->425
                  LINES: 29->1|32->4|32->4|32->4|33->5|37->9|37->9|38->10|42->14|42->14|43->15
                  -- GENERATED --
              */
          