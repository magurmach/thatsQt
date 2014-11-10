
package views.html.blog

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
object writePost extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*4.3*/common/*4.9*/.blog.head("Becasue I can")),format.raw/*4.36*/("""
	"""),format.raw/*5.2*/("""</head>
	<body>
		<script type="text/javascript" src=""""),_display_(/*7.40*/routes/*7.46*/.Assets.at("tinymce/js/tinymce/tinymce.min.js")),format.raw/*7.93*/(""""></script>
		<script type="text/javascript">
		tinymce.init("""),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
			"""),format.raw/*10.4*/("""selector: "textarea",
			auto_focus: "e1m1",
			theme: "modern",
			browser_spellcheck : true,
			plugins: "save",
			toolbar: "save | insertfile undo redo | styleselect | bold italic",
			save_enablewhendirty: true,
			width: 1000,
			height:350,
			content_css: """"),_display_(/*19.19*/routes/*19.25*/.Assets.at("stylesheets/writepost.css")),format.raw/*19.64*/(""""
		"""),format.raw/*20.3*/("""}"""),format.raw/*20.4*/(""");
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
					<textarea id="e1m1" name="postbody"></textarea>
					<br><br>
				</form>
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
                  DATE: Mon Nov 10 19:24:05 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/writePost.scala.html
                  HASH: b34d48f88b54c5413b99d5caccba4c11054ca17d
                  MATRIX: 589->0|647->33|660->39|707->66|735->68|816->123|830->129|897->176|985->237|1013->238|1044->242|1337->508|1352->514|1412->553|1443->557|1471->558
                  LINES: 22->1|25->4|25->4|25->4|26->5|28->7|28->7|28->7|30->9|30->9|31->10|40->19|40->19|40->19|41->20|41->20
                  -- GENERATED --
              */
          