
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
import modelos.InfoUsuario

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
                  DATE: Mon Sep 25 20:48:24 BRT 2017
                  SOURCE: /home/jonathan/workspace/e-Diario/app/views/loginform.scala.html
                  HASH: 9bf54829726bb5993f6d4710a2a742160bd030f1
                  MATRIX: 984->1|1119->41|1147->43|1203->73|1217->79|1297->139|1327->144|1340->150|1388->190|1426->191|1455->194|1520->233|1554->259|1593->261|1633->271|1681->293|1701->305|1724->308|1759->317|1779->329|1804->334|1840->344|1860->356|1901->376|2025->473|2058->497|2098->499|2139->509|2188->531|2207->541|2231->544|2267->553|2286->563|2312->568|2349->578|2368->588|2409->608|2606->775
                  LINES: 29->1|34->1|36->3|36->3|36->3|36->3|38->5|38->5|38->5|38->5|39->6|40->7|40->7|40->7|40->7|41->8|41->8|41->8|41->8|41->8|41->8|41->8|41->8|41->8|43->10|43->10|43->10|43->10|44->11|44->11|44->11|44->11|44->11|44->11|44->11|44->11|44->11|48->15
                  -- GENERATED --
              */
          