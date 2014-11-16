
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
object allPostListPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.posts.Post],List[models.posts.Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(unpublishedPosts: List[models.posts.Post], publishedPosts: List[models.posts.Post]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.86*/("""

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
									 """),_display_(/*17.12*/for(post<-unpublishedPosts) yield /*17.39*/{_display_(Seq[Any](format.raw/*17.40*/("""
										"""),format.raw/*18.11*/("""<div class="list-group-item">
											<h4 class="list-group-item-heading">
												"""),_display_(/*20.14*/post/*20.18*/.getId()),format.raw/*20.26*/(""" """),format.raw/*20.27*/(""": """),_display_(/*20.30*/post/*20.34*/.getTitle()),format.raw/*20.45*/("""
											"""),format.raw/*21.12*/("""</h4>
											<p class="linkshow">
												<a href="/edit/"""),_display_(/*23.29*/post/*23.33*/.getId()),format.raw/*23.41*/("""">(Edit)</a>
												<a href="/preview/"""),_display_(/*24.32*/post/*24.36*/.getId()),format.raw/*24.44*/("""">(Preview)</a>
												<a href="/publish/"""),_display_(/*25.32*/post/*25.36*/.getId()),format.raw/*25.44*/("""">(Publish)</a>
												<a href="/deletePost/"""),_display_(/*26.35*/post/*26.39*/.getId()),format.raw/*26.47*/("""">(Delete)</a>
											</p>
										</div>
									""")))}),format.raw/*29.11*/("""
								"""),format.raw/*30.9*/("""</div>
							</div>
							<div class="col-md-6 column">
								<div class="list-group">
									 <a class="list-group-item active">Published Post</a>
									 """),_display_(/*35.12*/for(post<-publishedPosts) yield /*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
										"""),format.raw/*36.11*/("""<div class="list-group-item">
											<h4 class="list-group-item-heading">
												"""),_display_(/*38.14*/post/*38.18*/.getId()),format.raw/*38.26*/(""" """),format.raw/*38.27*/(""": """),_display_(/*38.30*/post/*38.34*/.getTitle()),format.raw/*38.45*/("""
											"""),format.raw/*39.12*/("""</h4>
											<p class="linkshow">
												<a href="/edit/"""),_display_(/*41.29*/post/*41.33*/.getId()),format.raw/*41.41*/("""">(Edit)</a>
												<a href="/post/"""),_display_(/*42.29*/post/*42.33*/.getId()),format.raw/*42.41*/("""">(Read)</a>
												<a href="/deletePost/"""),_display_(/*43.35*/post/*43.39*/.getId()),format.raw/*43.47*/("""">(Delete)</a>
												<a href="/unpublish/"""),_display_(/*44.34*/post/*44.38*/.getId()),format.raw/*44.46*/("""">(Unpublish)</a>
											</p>
										</div>
									""")))}),format.raw/*47.11*/("""
							"""),format.raw/*48.8*/("""</div>
						</div>
					</div>
				</div>
			</div>
	</body>
</html>"""))}
  }

  def render(unpublishedPosts:List[models.posts.Post],publishedPosts:List[models.posts.Post]): play.twirl.api.HtmlFormat.Appendable = apply(unpublishedPosts,publishedPosts)

  def f:((List[models.posts.Post],List[models.posts.Post]) => play.twirl.api.HtmlFormat.Appendable) = (unpublishedPosts,publishedPosts) => apply(unpublishedPosts,publishedPosts)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Nov 14 20:07:37 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/allPostListPage.scala.html
                  HASH: 746d17b53afd3c91f65219fce68a2d0cf1bd257c
                  MATRIX: 779->1|951->85|979->87|1037->120|1050->126|1097->153|1125->155|1450->453|1493->480|1532->481|1571->492|1689->583|1702->587|1731->595|1760->596|1790->599|1803->603|1835->614|1875->626|1968->692|1981->696|2010->704|2081->748|2094->752|2123->760|2197->807|2210->811|2239->819|2316->869|2329->873|2358->881|2447->939|2483->948|2675->1113|2716->1138|2755->1139|2794->1150|2912->1241|2925->1245|2954->1253|2983->1254|3013->1257|3026->1261|3058->1272|3098->1284|3191->1350|3204->1354|3233->1362|3301->1403|3314->1407|3343->1415|3417->1462|3430->1466|3459->1474|3534->1522|3547->1526|3576->1534|3668->1595|3703->1603
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|45->17|45->17|45->17|46->18|48->20|48->20|48->20|48->20|48->20|48->20|48->20|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|57->29|58->30|63->35|63->35|63->35|64->36|66->38|66->38|66->38|66->38|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|75->47|76->48
                  -- GENERATED --
              */
          