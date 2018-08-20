
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
  """),_display_(/*3.4*/main("Pair Generator")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

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
                  DATE: Mon Aug 20 12:01:44 CEST 2018
                  SOURCE: /Users/indralw/Desktop/PairGeneratorWebApp/app/views/index.scala.html
                  HASH: 6abd6139e50b73b9c0dfcbb6e26ff30dd731c58d
                  MATRIX: 722->1|818->4|847->8|877->30|916->32|948->38|1063->127|1077->133|1130->166|1159->169|1173->175|1227->208|1305->259|1320->265|1375->299|1405->302|1420->308|1476->342|1543->379
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|33->9|33->9|33->9|33->9|33->9|33->9|34->10|34->10|34->10|34->10|34->10|34->10|38->14
                  -- GENERATED --
              */
          