
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

object listPairs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[scala.Tuple2[TeamMember, TeamMember]],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(pairs: Seq[(TeamMember,TeamMember)])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
  """),_display_(/*4.4*/main("Pair Generator")/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""

    """),format.raw/*6.5*/("""<h1>Pairs</h1>

    """),format.raw/*8.40*/("""
    """),_display_(/*9.6*/request/*9.13*/.flash.data.map/*9.28*/{ case (name, value) =>_display_(Seq[Any](format.raw/*9.51*/("""
      """),format.raw/*10.7*/("""<div>"""),_display_(/*10.13*/name),format.raw/*10.17*/(""": """),_display_(/*10.20*/value),format.raw/*10.25*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<table>
      <thead>
        <tr>
          <th>Team Member 1</th>
          <th>Team Member 2</th>
        </tr>
      </thead>
      <tbody>
      """),_display_(/*21.8*/for(member <- pairs) yield /*21.28*/ {_display_(Seq[Any](format.raw/*21.30*/("""
        """),format.raw/*22.9*/("""<tr><td>"""),_display_(/*22.18*/member/*22.24*/._1.name),format.raw/*22.32*/("""</td><td>"""),_display_(/*22.42*/member/*22.48*/._2.name),format.raw/*22.56*/("""</td></tr>
      """)))}),format.raw/*23.8*/("""
      """),format.raw/*24.7*/("""</tbody>
    </table>

    <hr/>

    <a href=""""),_display_(/*29.15*/routes/*29.21*/.PairGeneratorController.index),format.raw/*29.51*/("""">Go back</a>
    <a href=""""),_display_(/*30.15*/routes/*30.21*/.PairGeneratorController.listPairs),format.raw/*30.55*/("""">Randomize</a>

  """)))}),format.raw/*32.4*/("""
"""))
      }
    }
  }

  def render(pairs:Seq[scala.Tuple2[TeamMember, TeamMember]],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(pairs)(request)

  def f:((Seq[scala.Tuple2[TeamMember, TeamMember]]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (pairs) => (request) => apply(pairs)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Aug 20 12:08:25 CEST 2018
                  SOURCE: /Users/indralw/Desktop/PairGeneratorWebApp/app/views/listPairs.scala.html
                  HASH: fb399cc27bc427798a5898237c13a2c6ff5abda1
                  MATRIX: 790->2|962->81|991->85|1021->107|1060->109|1092->115|1139->170|1170->176|1185->183|1208->198|1268->221|1302->228|1335->234|1360->238|1390->241|1416->246|1458->258|1491->264|1668->415|1704->435|1744->437|1780->446|1816->455|1831->461|1860->469|1897->479|1912->485|1941->493|1989->511|2023->518|2098->566|2113->572|2164->602|2219->630|2234->636|2289->670|2339->690
                  LINES: 21->2|26->3|27->4|27->4|27->4|29->6|31->8|32->9|32->9|32->9|32->9|33->10|33->10|33->10|33->10|33->10|34->11|36->13|44->21|44->21|44->21|45->22|45->22|45->22|45->22|45->22|45->22|45->22|46->23|47->24|52->29|52->29|52->29|53->30|53->30|53->30|55->32
                  -- GENERATED --
              */
          