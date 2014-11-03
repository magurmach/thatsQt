
package views.html

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
object homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

	<head>
	    """),_display_(/*6.7*/common/*6.13*/.head("Because I Can")),format.raw/*6.35*/("""
	"""),format.raw/*7.2*/("""</head>
	<div class="container">
  <br>
  <br><br>
	<div class="row-fluid">
      <h1 class="pull-center"><strong>Welcome to Prime's canvas</strong></h1>
      <p class="lead pull-center">Blog, Foods, Programming etc</p>
	</div>	
  <br><br><br><br>
  <div class="span12 row-fluid">
    
      	<div class="span5 offsetHalf block">
          <div class="pull-center">
            <h1>Blogger Me</h1>
            <br><br>
            <i class="fa fa-paper-plane fa-5x"></i>
            <br><br><br><br>
            Take a look at what I have done and what I am trying to do <br>
            <button class="btn btn-primary btn-flat">Go Here<i class="pull-right fa fa-angle-right"></i></button>
          </div>
      	</div>
      	<div class="span5 block">
          <div class="pull-center">
      	 	<h1>Programmer Me</h1>
      	 	<br><br>
      	 	<i class="fa fa-terminal fa-5x"></i>
      	 	<br><br><br><br>
          	Welcome to my sports<br>
          	<button class="btn btn-primary btn-flat">Go There<i class="pull-right fa fa-angle-right"></i></button>
          </div>
      	</div>
      
  </div> 
	<div class="row-fluid">
	<br><br><br><br><br>
		<h3 class="pull-center">WOW FACTS!</h3>
	</div>	
  <br><br>
  <div class="row-fluid">
  	<div class="span12">
      <div class="span3 block block-sm offsetHalf1">
	      <div class="pull-center">
	      	<h2>UI design</h2>
	      </div>
	      <br>
      I built this UI using bootstrap and custom bootply. And you know what? This rather looks good!
      </div>
      <div class="span3 block block-sm">
      	<div class="pull-center">
      		<h2>Why</h2>
      	</div>
      	<br>
      	This domain was a birthday gift from Neel. Why waste it?
      </div>
      <div class="span3 block block-sm">
      <div class="pull-center">
      	<h2>Host</h2>
      </div>
      So far openshift is awesome (as long as they are free!), better than cloudbees!
      </div>
    </div>
	</div>
</div><!---/cont---->
<br><br><br><br>
  

        
        <script async="" src="//www.google-analytics.com/analytics.js"></script><script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>


        <script type="text/javascript" src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>






        
        <!-- JavaScript jQuery code from Bootply.com editor  -->
        
        <script type="text/javascript">
        
        $(document).ready(function() """),format.raw/*89.38*/("""{"""),format.raw/*89.39*/("""
        
            
        
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/(""");
        
        </script>
        
        <script>
          (function(i,s,o,g,r,a,m)"""),format.raw/*98.35*/("""{"""),format.raw/*98.36*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*98.86*/("""{"""),format.raw/*98.87*/("""
          """),format.raw/*99.11*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*99.46*/("""}"""),format.raw/*99.47*/(""",i[r].l=1*new Date();a=s.createElement(o),
          m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
          """),format.raw/*101.11*/("""}"""),format.raw/*101.12*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');
          ga('create', 'UA-40413119-1', 'bootply.com');
          ga('send', 'pageview');
        </script>
        
    
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 03 09:05:38 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/homepage.scala.html
                  HASH: aeadeb7cdece74792301a84c4a7e5ebe7593d0ef
                  MATRIX: 583->1|646->39|660->45|702->67|730->69|3244->2555|3273->2556|3340->2596|3369->2597|3487->2687|3516->2688|3594->2738|3623->2739|3662->2750|3725->2785|3754->2786|3926->2929|3956->2930
                  LINES: 22->2|26->6|26->6|26->6|27->7|109->89|109->89|113->93|113->93|118->98|118->98|118->98|118->98|119->99|119->99|119->99|121->101|121->101
                  -- GENERATED --
              */
          