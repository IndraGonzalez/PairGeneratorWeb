
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Welcome to Play")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

    """),format.raw/*5.5*/("""<h1>Pair Generator</h1>

    <div>
      <ul>
        <li>Create your team --> <a href=""""),_display_(/*9.44*/routes/*9.50*/.PairGeneratorController.listTeam),format.raw/*9.83*/("""">"""),_display_(/*9.86*/routes/*9.92*/.PairGeneratorController.listTeam),format.raw/*9.125*/("""</a></li>
        <li>Generate pairs --> <a href=""""),_display_(/*10.42*/routes/*10.48*/.PairGeneratorController.listPairs),format.raw/*10.82*/("""">"""),_display_(/*10.85*/routes/*10.91*/.PairGeneratorController.listPairs),format.raw/*10.125*/("""</a></li>
      </ul>
    </div>
    
  """)))}),format.raw/*14.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Aug 06 16:23:40 CEST 2018
                  SOURCE: /Users/indralw/Desktop/play-scala-forms-example/app/views/index.scala.html
                  HASH: 4716b5194bf0ce0c6457ff14ea5779a374157d5d
                  MATRIX: 722->1|818->4|847->8|878->31|917->33|949->39|1064->128|1078->134|1131->167|1160->170|1174->176|1228->209|1306->260|1321->266|1376->300|1406->303|1421->309|1477->343|1548->384
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|33->9|33->9|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|38->14
                  -- GENERATED --
              */
          