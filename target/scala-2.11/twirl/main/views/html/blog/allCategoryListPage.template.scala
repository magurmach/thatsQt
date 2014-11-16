
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
object allCategoryListPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.posts.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: List[models.posts.Category]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*6.3*/common/*6.9*/.blog.head("Becasue I can")),format.raw/*6.36*/("""
	"""),format.raw/*7.2*/("""</head>
	<body>
	<br><br>
		<div class="container">
				<div class="row clearfix">
					<div class="col-md-12 column">
						<div class="row clearfix">
							<div class="col-md-6 column">
								<div class="list-group">
									 <a class="list-group-item active">Unpublished Post</a>
									 """),_display_(/*17.12*/for(category<-categories) yield /*17.37*/{_display_(Seq[Any](format.raw/*17.38*/("""
										"""),format.raw/*18.11*/("""<div class="list-group-item">
											<h4 class="list-group-item-heading">
												"""),_display_(/*20.14*/category/*20.22*/.getId()),format.raw/*20.30*/(""" """),format.raw/*20.31*/(""": """),_display_(/*20.34*/category/*20.42*/.getName()),format.raw/*20.52*/("""
											"""),format.raw/*21.12*/("""</h4>
											<p class="linkshow">
												<a href="/editCategory/"""),_display_(/*23.37*/category/*23.45*/.getId()),format.raw/*23.53*/("""">(Edit)</a>
												<a href="/deleteCategory/"""),_display_(/*24.39*/category/*24.47*/.getId()),format.raw/*24.55*/("""">(Delete)</a>
											</p>
										</div>
									""")))}),format.raw/*27.11*/("""
								"""),format.raw/*28.9*/("""</div>
							</div>
						</div>
					</div>
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
                  DATE: Sun Nov 16 00:00:47 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/allCategoryListPage.scala.html
                  HASH: aaf86f7fd5192046e0225bdb6265b179466cfb51
                  MATRIX: 763->1|892->42|920->44|978->77|991->83|1038->110|1066->112|1391->410|1432->435|1471->436|1510->447|1628->538|1645->546|1674->554|1703->555|1733->558|1750->566|1781->576|1821->588|1922->662|1939->670|1968->678|2046->729|2063->737|2092->745|2181->803|2217->812
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|45->17|45->17|45->17|46->18|48->20|48->20|48->20|48->20|48->20|48->20|48->20|49->21|51->23|51->23|51->23|52->24|52->24|52->24|55->27|56->28
                  -- GENERATED --
              */
          