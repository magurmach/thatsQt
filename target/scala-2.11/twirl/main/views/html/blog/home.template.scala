
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
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.posts.Post],List[models.posts.Category],Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[models.posts.Post],categories: List[models.posts.Category], searchOn: Boolean, query:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.107*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*6.3*/common/*6.9*/.blog.head("Becasue I can")),format.raw/*6.36*/("""
	"""),format.raw/*7.2*/("""</head>
	<script>
		window.onload=function()
		"""),format.raw/*10.3*/("""{"""),format.raw/*10.4*/("""
			"""),format.raw/*11.4*/("""var screenHeight=screen.height;
			screenHeight=.90*screenHeight+"px";
			$("#mainView").css('min-height',screenHeight);
		"""),format.raw/*14.3*/("""}"""),format.raw/*14.4*/("""
	"""),format.raw/*15.2*/("""</script>
	<body>
	"""),_display_(/*17.3*/common/*17.9*/.blog.navbar("   Blogger Me")),format.raw/*17.38*/("""
	
	"""),format.raw/*19.2*/("""<div class="jPanelMenu-panel" style="position: relative; left: 0px;">
	<div class="container home-container">
        <div class="row">

            <div class="sidebar col-md-5 col-sm-12 " style="left: 0px;">
                <div class="site-info">
                    <div class="primary-info">
                    
                    <div class="side">
                    	<img src=""""),_display_(/*28.33*/routes/*28.39*/.Assets.at("images/me/profile.jpg")),format.raw/*28.74*/("""" class="user-icon user-1" alt="user-image">
                    </div> 
                    <h1>Some Bytes From Me</h1>
                        <p align="justify">
                        A week long coding and this is what I came up with. Lots of things to be done. Lots of!
                        </p>
                        <p>Eat, walk, think, code!</p>
                    </div>
                    <div class="secondary-info">
                        <p><a class="btn btn-writer btn-post" href="/"><i class="fa fa-home"></i> Go Home</a></p>
                    </div>
                </div>

            </div>

            <div class="col-md-7 col-sm-12 col-md-offset-5 main-content" id="mainView">
            <br><br><br>

                <div class="nav">
                    <a href="#" class="select-posts active">Posts</a>
                    <a href="#" class="select-categories">Categories</a>
                </div>
				"""),_display_(/*50.6*/if(searchOn==true)/*50.24*/{_display_(Seq[Any](format.raw/*50.25*/("""
					"""),format.raw/*51.6*/("""<h3 ><div class="mdisable">All posts in """),_display_(/*51.47*/query),format.raw/*51.52*/(""" """),format.raw/*51.53*/("""... </div></h3>
					<p class="horizontalLine"></p>
				""")))}),format.raw/*53.6*/("""
                """),format.raw/*54.17*/("""<div class="home-page-posts animated fadeIn ">
                """),_display_(/*55.18*/if(posts.isEmpty)/*55.35*/{_display_(Seq[Any](format.raw/*55.36*/("""
                	"""),format.raw/*56.18*/("""<h4> No posts here :( </h4>
                """)))}),format.raw/*57.18*/("""
                """),_display_(/*58.18*/for(post<-posts) yield /*58.34*/{_display_(Seq[Any](format.raw/*58.35*/("""
                
	                """),format.raw/*60.18*/("""<div class="post">
	                    <section>
	                        <div class="post-preview col-xs-12  no-gutter">
	
	                        <h2><a href='/post/"""),_display_(/*64.46*/post/*64.50*/.getId()),format.raw/*64.58*/("""'>"""),_display_(/*64.61*/post/*64.65*/.getTitle()),format.raw/*64.76*/("""</a></h2>
	                        <p>"""),_display_(/*65.30*/post/*65.34*/.getSubtitle()),format.raw/*65.48*/("""</p>
	                        
	                        <p class="meta">
	                            Shakib Ahmed in <a class="" href="/blog?category="""),_display_(/*68.80*/post/*68.84*/.getCategory().getId()),format.raw/*68.106*/("""">"""),_display_(/*68.109*/post/*68.113*/.getCategory().getName()),format.raw/*68.137*/("""</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i>
	                            """),_display_(/*69.31*/post/*69.35*/.getDateString()),format.raw/*69.51*/("""
	                        """),format.raw/*70.26*/("""</p>
	                        </div>
	
	                    </section>
	                </div>
	            """)))}),format.raw/*75.15*/("""
                
            """),format.raw/*77.13*/("""</div><!-- Home page posts -->

            <div class="home-page-categories hide animated fadeIn ">
                <div class="category row">
                    <section>
                    """),_display_(/*82.22*/for(category<-categories) yield /*82.47*/{_display_(Seq[Any](format.raw/*82.48*/("""
                    	"""),format.raw/*83.22*/("""<div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>"""),_display_(/*84.34*/category/*84.42*/.getName()),format.raw/*84.52*/("""</h2>
                            <a href="/blog?category="""),_display_(/*85.54*/category/*85.62*/.getId()),format.raw/*85.70*/(""""><img src=""""),_display_(/*85.83*/category/*85.91*/.getImageDirectory()),format.raw/*85.111*/("""" alt="category-image"></a>
                        </div>
                    """)))}),format.raw/*87.22*/("""

                    """),format.raw/*89.21*/("""</section>
                </div>
            </div>
            <!--
            <div class="home-footer">
                <a href="post.html"> About </a>
                <i class="link-spacer"></i>
                <a href="post.html"> Writer 2014 </a>

            </div>  -->

            </div><!-- main content -->

        </div> <!--/row -->

    </div></div>
    
    <script src=""""),_display_(/*106.19*/routes/*106.25*/.Assets.at("javascripts/jquery.jpanelmenu.min.js")),format.raw/*106.75*/(""""></script>
	<script src=""""),_display_(/*107.16*/routes/*107.22*/.Assets.at("javascripts/blogmain.js")),format.raw/*107.59*/(""""></script>
	<style id="jPanelMenu-style-master">
	body"""),format.raw/*109.6*/("""{"""),format.raw/*109.7*/("""width:100%"""),format.raw/*109.17*/("""}"""),format.raw/*109.18*/(""".jPanelMenu,body"""),format.raw/*109.34*/("""{"""),format.raw/*109.35*/("""overflow-x:hidden"""),format.raw/*109.52*/("""}"""),format.raw/*109.53*/("""#jPanelMenu-menu"""),format.raw/*109.69*/("""{"""),format.raw/*109.70*/("""display:block;position:fixed;top:0;left:0;height:100%;z-index:-1;overflow-x:hidden;overflow-y:scroll;-webkit-overflow-scrolling:touch"""),format.raw/*109.203*/("""}"""),format.raw/*109.204*/(""".jPanelMenu-panel"""),format.raw/*109.221*/("""{"""),format.raw/*109.222*/("""position:static;left:0;top:0;z-index:2;width:100%;min-height:100%;background:rgb(255, 255, 255)"""),format.raw/*109.317*/("""}"""),format.raw/*109.318*/("""</style>

	</body>
</html>"""))}
  }

  def render(posts:List[models.posts.Post],categories:List[models.posts.Category],searchOn:Boolean,query:String): play.twirl.api.HtmlFormat.Appendable = apply(posts,categories,searchOn,query)

  def f:((List[models.posts.Post],List[models.posts.Category],Boolean,String) => play.twirl.api.HtmlFormat.Appendable) = (posts,categories,searchOn,query) => apply(posts,categories,searchOn,query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Nov 16 13:04:24 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/home.scala.html
                  HASH: d98fc80c83aa595fc29359a69da931ac3ef7403c
                  MATRIX: 787->1|981->106|1009->108|1067->141|1080->147|1127->174|1155->176|1229->223|1257->224|1288->228|1438->351|1466->352|1495->354|1541->374|1555->380|1605->409|1636->413|2052->802|2067->808|2123->843|3090->1784|3117->1802|3156->1803|3189->1809|3257->1850|3283->1855|3312->1856|3399->1913|3444->1930|3535->1994|3561->2011|3600->2012|3646->2030|3722->2075|3767->2093|3799->2109|3838->2110|3901->2145|4098->2315|4111->2319|4140->2327|4170->2330|4183->2334|4215->2345|4281->2384|4294->2388|4329->2402|4508->2554|4521->2558|4565->2580|4596->2583|4610->2587|4656->2611|4778->2706|4791->2710|4828->2726|4882->2752|5022->2861|5080->2891|5302->3086|5343->3111|5382->3112|5432->3134|5542->3217|5559->3225|5590->3235|5676->3294|5693->3302|5722->3310|5762->3323|5779->3331|5821->3351|5932->3431|5982->3453|6400->3843|6416->3849|6488->3899|6543->3926|6559->3932|6618->3969|6701->4024|6730->4025|6769->4035|6799->4036|6844->4052|6874->4053|6920->4070|6950->4071|6995->4087|7025->4088|7188->4221|7219->4222|7266->4239|7297->4240|7422->4335|7453->4336
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|38->10|38->10|39->11|42->14|42->14|43->15|45->17|45->17|45->17|47->19|56->28|56->28|56->28|78->50|78->50|78->50|79->51|79->51|79->51|79->51|81->53|82->54|83->55|83->55|83->55|84->56|85->57|86->58|86->58|86->58|88->60|92->64|92->64|92->64|92->64|92->64|92->64|93->65|93->65|93->65|96->68|96->68|96->68|96->68|96->68|96->68|97->69|97->69|97->69|98->70|103->75|105->77|110->82|110->82|110->82|111->83|112->84|112->84|112->84|113->85|113->85|113->85|113->85|113->85|113->85|115->87|117->89|134->106|134->106|134->106|135->107|135->107|135->107|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109
                  -- GENERATED --
              */
          