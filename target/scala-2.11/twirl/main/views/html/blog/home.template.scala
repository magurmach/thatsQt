
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
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
	<head>
	"""),_display_(/*4.3*/common/*4.9*/.blog.head("Becasue I can")),format.raw/*4.36*/("""
	"""),format.raw/*5.2*/("""</head>
	
	<body>
	"""),_display_(/*8.3*/common/*8.9*/.blog.navbar("   Blogger Me")),format.raw/*8.38*/("""
	
	"""),format.raw/*10.2*/("""<div class="jPanelMenu-panel" style="position: relative; left: 0px;">
	<div class="container home-container">
        <div class="row">

            <div class="sidebar col-md-5 col-sm-12 " style="left: 0px;">
                <div class="site-info">
                    <div class="primary-info">
                    <div class="side">
                    	<img src=""""),_display_(/*18.33*/routes/*18.39*/.Assets.at("images/me/profile.png")),format.raw/*18.74*/("""" class="user-icon user-1" alt="user-image">
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

            <div class="col-md-7 col-sm-12 col-md-offset-5 main-content">
            <br><br><br>

                <div class="nav">
                    <a href="#" class="select-posts active">Posts</a>
                    <a href="#" class="select-categories">Categories</a>
                </div>

                <div class="home-page-posts animated fadeIn ">
                <div class="post">
                    <section>
                        <div class="post-preview col-xs-10  no-gutter">

                        <h2><a href="post.html">A great story never told</a></h2>
                        <p>It was a cold December morning, as I sat out on my porch I decided today was the day. </p>

                        <p class="meta">
                            <a class="" href="category.html">James Reddy</a> in <a class="" href="category.html">Storytime</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i> 23 minute read
                        </p>
                        </div>

                    </section>
                </div>
                <div class="post">
                    <section>
                        <div class="post-preview col-xs-10 no-gutter">

                        <h2><a href="post.html">Builing, Hacking, Creating</a></h2>
                        <p>Is it better to start from scratch or build on someone elses work. My thoughts.</p>

                        <p class="meta">
                            <a class="" href="category.html">Mad Hacker</a> in <a class="" href="category.html">Easy Living</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i> 9 minute read
                        </p>
                        </div>

                        <div class=" col-xs-2 no-gutter">
                            <img src="img/profile-2.jpg" class="user-icon user-1" alt="user-image">
                        </div>

                    </section>
                </div>
                <div class="post">
                    <section>
                        <div class="post-preview col-xs-10 no-gutter">

                        <h2><a href="post.html">Ten reasons why you should travel, or why the city is killing your inner creative</a></h2>
                        <p>About time for your next adventure. </p>

                        <p class="meta">
                            <a class="" href="category.html">Sarah Smith</a> in <a class="" href="category.html">Adventure</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i> 5 minute read
                        </p>
                        </div>

                        <div class=" col-xs-2 no-gutter">
                            <img src="img/profile-4.png" class="user-icon user-1" alt="user-image">
                        </div>

                    </section>
                </div>
                <div class="post">
                    <section>
                        <div class="post-preview col-xs-10 no-gutter">

                        <h2><a href="post.html">Feature List</a></h2>
                        <p>Wondering what is actually included? </p>

                        <p class="meta">
                            <a class="" href="category.html">Jane Thompson</a> in <a class="" href="category.html">Writer</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i> 2 minute read
                        </p>
                        </div>

                        <div class=" col-xs-2 no-gutter">
                            <img src="img/profile-5.png" class="user-icon user-1" alt="user-image">
                        </div>

                    </section>
                </div>
                <div class="post">
                    <section>
                        <div class="post-preview col-xs-10 no-gutter">

                        <h2><a href="post.html">About Writer</a></h2>
                        <p>Not another bootstrap theme </p>

                        <p class="meta">
                            <a class="" href="category.html">John Smith</a> in <a class="" href="category.html">Writer</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i> 3 minute read
                        </p>
                        </div>

                        <div class=" col-xs-2 no-gutter">
                            <img src="img/profile-1.jpg" class="user-icon user-1" alt="user-image">
                        </div>

                    </section>
                </div>
                <div class="post">
                    <section>
                        <div class="post-preview col-xs-10 no-gutter">

                        <h2><a href="components.html">Bootstrap Components</a></h2>
                        <p>How do some of the default bootstrap components looks</p>

                        <p class="meta">
                            <a class="" href="category.html">Jane Doe</a> in <a class="" href="category.html">Writer</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i> 2 minute read
                        </p>
                        </div>

                        <div class=" col-xs-2 no-gutter">
                            <img src="img/profile-3.jpg" class="user-icon user-1" alt="user-image">
                        </div>

                    </section>
                </div>
                <div class="post">
                    <section>
                        <div class="post-preview col-xs-10 no-gutter">

                        <h2><a href="post.html">Its not always that simple</a></h2>
                        <p>How many times should you ask the same questions. </p>

                        <p class="meta">
                            <a class="" href="category.html">Tim Leen</a> in <a class="" href="category.html">Open Roads</a> <i class="link-spacer"></i> <i class="entypo-bookmark"></i> 12 minute read
                        </p>
                        </div>

                        <div class=" col-xs-2 no-gutter">
                            <img src="img/profile-3.jpg" class="user-icon user-1" alt="user-image">
                        </div>

                    </section>
                </div>
            </div><!-- Home page posts -->

            <div class="home-page-categories hide animated fadeIn ">
                <div class="category row">
                    <section>
                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Easy Living</h2>
                            <a href="category.html"><img src="img/cover-2.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Adventure</h2>
                            <a href="category.html"><img src="img/cover-4.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Storytime</h2>
                            <a href="category.html"><img src="img/cover-6.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Open Roads</h2>
                             <a href="category.html"><img src="img/cover-9.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Gaming</h2>
                            <a href="category.html"><img src="img/cover-1.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>City Life</h2>
                             <a href="category.html"><img src="img/cover-3.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Rave Culture</h2>
                             <a href="category.html"><img src="img/cover-5.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Photography</h2>
                            <a href="category.html"><img src="img/cover-7.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Animal Kingdom</h2>
                             <a href="category.html"><img src="img/cover-8.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Beach</h2>
                            <a href="category.html"><img src="img/cover-10.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Climbing</h2>
                             <a href="category.html"><img src="img/cover-11.jpg" alt="category-image"></a>
                        </div>

                        <div class="category-preview col-xs-6 col-sm-4 ">
                            <h2>Mystery</h2>
                             <a href="category.html"><img src="img/cover-12.jpg" alt="category-image"></a>
                        </div>

                    </section>
                </div>
            </div>
            <div class="home-footer">
                <a href="post.html"> About </a>
                <i class="link-spacer"></i>
                <a href="post.html"> Writer 2014 </a>

            </div>

            </div><!-- main content -->

        </div> <!--/row -->

    </div></div>
    
    <script src=""""),_display_(/*246.19*/routes/*246.25*/.Assets.at("javascripts/jquery.jpanelmenu.min.js")),format.raw/*246.75*/(""""></script>
	<script src=""""),_display_(/*247.16*/routes/*247.22*/.Assets.at("javascripts/blogmain.js")),format.raw/*247.59*/(""""></script>
	<style id="jPanelMenu-style-master">
	body"""),format.raw/*249.6*/("""{"""),format.raw/*249.7*/("""width:100%"""),format.raw/*249.17*/("""}"""),format.raw/*249.18*/(""".jPanelMenu,body"""),format.raw/*249.34*/("""{"""),format.raw/*249.35*/("""overflow-x:hidden"""),format.raw/*249.52*/("""}"""),format.raw/*249.53*/("""#jPanelMenu-menu"""),format.raw/*249.69*/("""{"""),format.raw/*249.70*/("""display:block;position:fixed;top:0;left:0;height:100%;z-index:-1;overflow-x:hidden;overflow-y:scroll;-webkit-overflow-scrolling:touch"""),format.raw/*249.203*/("""}"""),format.raw/*249.204*/(""".jPanelMenu-panel"""),format.raw/*249.221*/("""{"""),format.raw/*249.222*/("""position:static;left:0;top:0;z-index:2;width:100%;min-height:100%;background:rgb(255, 255, 255)"""),format.raw/*249.317*/("""}"""),format.raw/*249.318*/("""</style>

	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Nov 06 18:39:07 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/home.scala.html
                  HASH: a03dc292c8d38028b22abe4e48b92473e433c5db
                  MATRIX: 584->0|642->33|655->39|702->66|730->68|775->88|788->94|837->123|868->127|1263->495|1278->501|1334->536|11966->11140|11982->11146|12054->11196|12109->11223|12125->11229|12184->11266|12267->11321|12296->11322|12335->11332|12365->11333|12410->11349|12440->11350|12486->11367|12516->11368|12561->11384|12591->11385|12754->11518|12785->11519|12832->11536|12863->11537|12988->11632|13019->11633
                  LINES: 22->1|25->4|25->4|25->4|26->5|29->8|29->8|29->8|31->10|39->18|39->18|39->18|267->246|267->246|267->246|268->247|268->247|268->247|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249|270->249
                  -- GENERATED --
              */
          