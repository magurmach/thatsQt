
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
                    <h1>Writer</h1>
                        <p>A minimal blogging theme to put your content on show. <a href="post.html">Look at the features.</a> </p>

                        <p>Content is king</p>
                    </div>
                    <div class="secondary-info">

                        <p><a class="btn btn-writer btn-post" href="#"><i class="entypo-doc-text"></i>Join Us</a> or <a href="#">Share your story</a></p>
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
    
    <script src=""""),_display_(/*242.19*/routes/*242.25*/.Assets.at("javascripts/jquery.jpanelmenu.min.js")),format.raw/*242.75*/(""""></script>
	<script src=""""),_display_(/*243.16*/routes/*243.22*/.Assets.at("javascripts/blogmain.js")),format.raw/*243.59*/(""""></script>
	<style id="jPanelMenu-style-master">
	body"""),format.raw/*245.6*/("""{"""),format.raw/*245.7*/("""width:100%"""),format.raw/*245.17*/("""}"""),format.raw/*245.18*/(""".jPanelMenu,body"""),format.raw/*245.34*/("""{"""),format.raw/*245.35*/("""overflow-x:hidden"""),format.raw/*245.52*/("""}"""),format.raw/*245.53*/("""#jPanelMenu-menu"""),format.raw/*245.69*/("""{"""),format.raw/*245.70*/("""display:block;position:fixed;top:0;left:0;height:100%;z-index:-1;overflow-x:hidden;overflow-y:scroll;-webkit-overflow-scrolling:touch"""),format.raw/*245.203*/("""}"""),format.raw/*245.204*/(""".jPanelMenu-panel"""),format.raw/*245.221*/("""{"""),format.raw/*245.222*/("""position:static;left:0;top:0;z-index:2;width:100%;min-height:100%;background:rgb(255, 255, 255)"""),format.raw/*245.317*/("""}"""),format.raw/*245.318*/("""</style>

	</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Nov 06 17:13:54 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/blog/home.scala.html
                  HASH: 0510e8498ffa9ba6559a91cae5a827e71311aeee
                  MATRIX: 584->0|642->33|655->39|702->66|730->68|775->88|788->94|837->123|868->127|11559->10790|11575->10796|11647->10846|11702->10873|11718->10879|11777->10916|11860->10971|11889->10972|11928->10982|11958->10983|12003->10999|12033->11000|12079->11017|12109->11018|12154->11034|12184->11035|12347->11168|12378->11169|12425->11186|12456->11187|12581->11282|12612->11283
                  LINES: 22->1|25->4|25->4|25->4|26->5|29->8|29->8|29->8|31->10|263->242|263->242|263->242|264->243|264->243|264->243|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245|266->245
                  -- GENERATED --
              */
          