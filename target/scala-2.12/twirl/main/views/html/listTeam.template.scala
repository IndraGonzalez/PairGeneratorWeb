
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

object listTeam extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Set[TeamMember],Form[TeamMemberForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(members: Set[TeamMember], form: Form[TeamMemberForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
  """),_display_(/*4.4*/main("Pair Generator")/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""

    """),format.raw/*6.5*/("""<h1>Team Members</h1>

    """),format.raw/*8.40*/("""
    """),_display_(/*9.6*/request/*9.13*/.flash.data.map/*9.28*/{ case (name, value) =>_display_(Seq[Any](format.raw/*9.51*/("""
      """),format.raw/*10.7*/("""<div>"""),_display_(/*10.13*/name),format.raw/*10.17*/(""": """),_display_(/*10.20*/value),format.raw/*10.25*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<table>
      <thead>
        <tr><th>Name</th>
      </thead>
      <tbody>
      """),_display_(/*18.8*/for(member <- members) yield /*18.30*/ {_display_(Seq[Any](format.raw/*18.32*/("""
        """),format.raw/*19.9*/("""<tr><td>"""),_display_(/*19.18*/member/*19.24*/.name),format.raw/*19.29*/("""</td></tr>
      """)))}),format.raw/*20.8*/("""
      """),format.raw/*21.7*/("""</tbody>
    </table>

    <a href=""""),_display_(/*24.15*/routes/*24.21*/.PairGeneratorController.index),format.raw/*24.51*/("""">Done</a>

    <hr/>

    """),format.raw/*28.66*/("""
    """),_display_(/*29.6*/if(form.hasGlobalErrors)/*29.30*/ {_display_(Seq[Any](format.raw/*29.32*/("""
      """),_display_(/*30.8*/form/*30.12*/.globalErrors.map/*30.29*/ { error: FormError =>_display_(Seq[Any](format.raw/*30.51*/("""
        """),format.raw/*31.9*/("""<div>
          """),_display_(/*32.12*/error/*32.17*/.key),format.raw/*32.21*/(""": """),_display_(/*32.24*/error/*32.29*/.message),format.raw/*32.37*/("""
        """),format.raw/*33.9*/("""</div>
      """)))}),format.raw/*34.8*/("""
    """)))}),format.raw/*35.6*/("""

    """),_display_(/*37.6*/helper/*37.12*/.form(postUrl)/*37.26*/ {_display_(Seq[Any](format.raw/*37.28*/("""
      """),_display_(/*38.8*/helper/*38.14*/.CSRF.formField),format.raw/*38.29*/("""

      """),_display_(/*40.8*/helper/*40.14*/.inputText(form("name"))),format.raw/*40.38*/("""

      """),format.raw/*42.7*/("""<button>Add team member</button>
    """)))}),format.raw/*43.6*/("""

  """)))}),format.raw/*45.4*/("""
"""))
      }
    }
  }

  def render(members:Set[TeamMember],form:Form[TeamMemberForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(members,form,postUrl)(request)

  def f:((Set[TeamMember],Form[TeamMemberForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (members,form,postUrl) => (request) => apply(members,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 08 15:56:15 CEST 2018
                  SOURCE: /Users/indralw/Desktop/play-scala-forms-example/app/views/listTeam.scala.html
                  HASH: f0b6f3d21b054bb6e0d56c98a8f3084fccb46c02
                  MATRIX: 794->2|1003->118|1032->122|1062->144|1101->146|1133->152|1187->214|1218->220|1233->227|1256->242|1316->265|1350->272|1383->278|1408->282|1438->285|1464->290|1506->302|1539->308|1649->392|1687->414|1727->416|1763->425|1799->434|1814->440|1840->445|1888->463|1922->470|1986->507|2001->513|2052->543|2107->631|2139->637|2172->661|2212->663|2246->671|2259->675|2285->692|2345->714|2381->723|2425->740|2439->745|2464->749|2494->752|2508->757|2537->765|2573->774|2617->788|2653->794|2686->801|2701->807|2724->821|2764->823|2798->831|2813->837|2849->852|2884->861|2899->867|2944->891|2979->899|3047->937|3082->942
                  LINES: 21->2|26->3|27->4|27->4|27->4|29->6|31->8|32->9|32->9|32->9|32->9|33->10|33->10|33->10|33->10|33->10|34->11|36->13|41->18|41->18|41->18|42->19|42->19|42->19|42->19|43->20|44->21|47->24|47->24|47->24|51->28|52->29|52->29|52->29|53->30|53->30|53->30|53->30|54->31|55->32|55->32|55->32|55->32|55->32|55->32|56->33|57->34|58->35|60->37|60->37|60->37|60->37|61->38|61->38|61->38|63->40|63->40|63->40|65->42|66->43|68->45
                  -- GENERATED --
              */
          