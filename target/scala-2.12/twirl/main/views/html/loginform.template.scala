
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object loginform extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Field,Field,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(campoUsuario: Field, campoSenha: Field):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" href=""""),_display_(/*3.31*/routes/*3.37*/.Assets.versioned("stylesheets/bootstrap/css/bootstrap.css")),format.raw/*3.97*/("""">

"""),_display_(/*5.2*/helper/*5.8*/.form(routes.HomeController.postLogin())/*5.48*/{_display_(Seq[Any](format.raw/*5.49*/("""
  """),format.raw/*6.3*/("""<fieldset>
    <div class="form-group """),_display_(/*7.29*/if(campoUsuario.hasErrors)/*7.55*/ {_display_(Seq[Any](format.raw/*7.57*/("""has-error""")))}),format.raw/*7.67*/("""" >
      <input id=""""),_display_(/*8.19*/campoUsuario/*8.31*/.id),format.raw/*8.34*/("""" name=""""),_display_(/*8.43*/campoUsuario/*8.55*/.name),format.raw/*8.60*/("""" value=""""),_display_(/*8.70*/campoUsuario/*8.82*/.value.getOrElse("")),format.raw/*8.102*/("""" class="form-control" placeholder="Usuario" type="text">
    </div>
    <div class="form-group """),_display_(/*10.29*/if(campoSenha.hasErrors)/*10.53*/ {_display_(Seq[Any](format.raw/*10.55*/("""has-error""")))}),format.raw/*10.65*/("""" >
      <input id=""""),_display_(/*11.19*/campoSenha/*11.29*/.id),format.raw/*11.32*/("""" name=""""),_display_(/*11.41*/campoSenha/*11.51*/.name),format.raw/*11.56*/("""" value=""""),_display_(/*11.66*/campoSenha/*11.76*/.value.getOrElse("")),format.raw/*11.96*/("""" class="form-control" placeholder="Senha" type="password">
    </div>
    <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
  </fieldset>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(campoUsuario:Field,campoSenha:Field): play.twirl.api.HtmlFormat.Appendable = apply(campoUsuario,campoSenha)

  def f:((Field,Field) => play.twirl.api.HtmlFormat.Appendable) = (campoUsuario,campoSenha) => apply(campoUsuario,campoSenha)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 24 18:27:14 BRT 2017
                  SOURCE: /home/jonathan/Workspace/e-Diario/app/views/loginform.scala.html
                  HASH: 2908b32ce97cfe12ded6739adaffd0da1419f697
                  MATRIX: 957->1|1092->41|1120->43|1176->73|1190->79|1270->139|1300->144|1313->150|1361->190|1399->191|1428->194|1493->233|1527->259|1566->261|1606->271|1654->293|1674->305|1697->308|1732->317|1752->329|1777->334|1813->344|1833->356|1874->376|1998->473|2031->497|2071->499|2112->509|2161->531|2180->541|2204->544|2240->553|2259->563|2285->568|2322->578|2341->588|2382->608|2579->775
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|37->5|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|43->11|47->15
                  -- GENERATED --
              */
          