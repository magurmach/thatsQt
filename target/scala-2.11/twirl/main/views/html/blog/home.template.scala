
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
                        First time I am into designing and you have to admit, it looks good!
                        While you keep thinking 'this is nothing but another cute wordpress thing', I keep continuing design something you continue to envy of.
						</p>
                        <p>If I can think it, I can design it.</p>
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
				"""),_display_(/*51.6*/if(searchOn==true)/*51.24*/{_display_(Seq[Any](format.raw/*51.25*/("""
					"""),format.raw/*52.6*/("""<h3>Posts in """),_display_(/*52.20*/query),format.raw/*52.25*/("""</h3>
				""")))}),format.raw/*53.6*/("""
                """),format.raw/*54.17*/("""<div class="home-page-posts animated fadeIn ">
                if(posts.empty)"""),format.raw/*55.32*/("""{"""),format.raw/*55.33*/("""
                	"""),format.raw/*56.18*/("""<h3> nothing found</h3>
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/("""
                """),_display_(/*58.18*/for(post<-posts) yield /*58.34*/{_display_(Seq[Any](format.raw/*58.35*/("""
                
	                """),format.raw/*60.18*/("""<div class="post">
	                    <section>
	                        <div class="post-preview col-xs-12  no-gutter">
	
	                        <h2><a href='/post/"""),_display_(/*64.46*/post/*64.50*/.getId()),format.raw/*64.58*/("""'>"""),_display_(/*64.61*/post/*64.65*/.getTitle()),format.raw/*64.76*/("""</a></h2>
	                        <p>"""),_display_(/*65.30*/post/*65.34*/.getSubtitle()),format.raw/*65.48*/("""</p>
	                        
	                        <p class="meta">
	                            Shakib Ahmed in <a class="" href="category.html">"""),_display_(/*68.80*/post/*68.84*/.getCategory().getName()),format.raw/*68.108*/("""</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i>
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
                  DATE: Sun Nov 16 11:50:38 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/home.scala.html
                  HASH: 1f5a0996c79daed70aaef89cea6f4f4322c46b2d
                  MATRIX: 787->1|981->106|1009->108|1067->141|1080->147|1127->174|1155->176|1229->223|1257->224|1288->228|1438->351|1466->352|1495->354|1541->374|1555->380|1605->409|1636->413|2052->802|2067->808|2123->843|3225->1919|3252->1937|3291->1938|3324->1944|3365->1958|3391->1963|3432->1974|3477->1991|3583->2069|3612->2070|3658->2088|3726->2128|3755->2129|3800->2147|3832->2163|3871->2164|3934->2199|4131->2369|4144->2373|4173->2381|4203->2384|4216->2388|4248->2399|4314->2438|4327->2442|4362->2456|4541->2608|4554->2612|4600->2636|4722->2731|4735->2735|4772->2751|4826->2777|4966->2886|5024->2916|5246->3111|5287->3136|5326->3137|5376->3159|5486->3242|5503->3250|5534->3260|5620->3319|5637->3327|5666->3335|5706->3348|5723->3356|5765->3376|5876->3456|5926->3478|6344->3868|6360->3874|6432->3924|6487->3951|6503->3957|6562->3994|6645->4049|6674->4050|6713->4060|6743->4061|6788->4077|6818->4078|6864->4095|6894->4096|6939->4112|6969->4113|7132->4246|7163->4247|7210->4264|7241->4265|7366->4360|7397->4361
                  LINES: 26->1|29->1|31->3|34->6|34->6|34->6|35->7|38->10|38->10|39->11|42->14|42->14|43->15|45->17|45->17|45->17|47->19|56->28|56->28|56->28|79->51|79->51|79->51|80->52|80->52|80->52|81->53|82->54|83->55|83->55|84->56|85->57|85->57|86->58|86->58|86->58|88->60|92->64|92->64|92->64|92->64|92->64|92->64|93->65|93->65|93->65|96->68|96->68|96->68|97->69|97->69|97->69|98->70|103->75|105->77|110->82|110->82|110->82|111->83|112->84|112->84|112->84|113->85|113->85|113->85|113->85|113->85|113->85|115->87|117->89|134->106|134->106|134->106|135->107|135->107|135->107|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109|137->109
                  -- GENERATED --
              */
          