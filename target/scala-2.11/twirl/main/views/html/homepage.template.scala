
package views.html

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
object homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>

	<head>
	    """),_display_(/*6.7*/common/*6.13*/.head("Because I Can")),format.raw/*6.35*/("""
	"""),format.raw/*7.2*/("""</head>
<body>
	<div class="container">
  <br>
  <br><br>
	<div class="row-fluid">
      <h1 class="pull-center"><strong>Welcome to Shakib's canvas</strong></h1>
      <p class="lead pull-center">Its All About My Blog, Programming etc</p>
	</div>	
  <br><br><br><br>
  <div class="span12 row-fluid">
    
      	<div class="span5 offsetHalf block">
          <div class="pull-center">
            <h1>Blogger Me</h1>
            <br><br>
            <i class="fa fa-paper-plane fa-5x"></i>
            <br><br><br><br>
            Take a look at what I have been doing <br>
            <button class="btn btn-primary btn-flat" onclick="window.location='/blog'">Go Here<i class="pull-right fa fa-angle-right"></i></button>
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
      <br>
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
        
        $(document).ready(function() """),format.raw/*91.38*/("""{"""),format.raw/*91.39*/("""
        
            
        
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""");
        
        </script>
        
        <script>
		  (function(i,s,o,g,r,a,m)"""),format.raw/*100.29*/("""{"""),format.raw/*100.30*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*100.80*/("""{"""),format.raw/*100.81*/("""
		  """),format.raw/*101.5*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*101.40*/("""}"""),format.raw/*101.41*/(""",i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		
		  ga('create', 'UA-56399850-1', 'auto');
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
                  DATE: Wed Nov 12 22:19:33 BDT 2014
                  SOURCE: /Users/sheikhahmed/Projects/ThatsQtRedShift/playseed/activator-play-slick/app/views/homepage.scala.html
                  HASH: 24a088de0daaf9724cb8828ea70ce60a7dd5bd92
                  MATRIX: 801->1|864->39|878->45|920->67|948->69|3504->2597|3533->2598|3600->2638|3629->2639|3742->2723|3772->2724|3851->2774|3881->2775|3914->2780|3978->2815|4008->2816|4167->2947|4196->2948
                  LINES: 29->2|33->6|33->6|33->6|34->7|118->91|118->91|122->95|122->95|127->100|127->100|127->100|127->100|128->101|128->101|128->101|130->103|130->103
                  -- GENERATED --
              */
          