
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[modelos.FormularioLogin],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formularioLogin : Form[modelos.FormularioLogin]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<head>
    <link rel="stylesheet" href=""""),_display_(/*4.35*/routes/*4.41*/.Assets.versioned("stylesheets/bootstrap/css/bootstrap.css")),format.raw/*4.101*/("""">
    <style>
        .form-login"""),format.raw/*6.20*/("""{"""),format.raw/*6.21*/("""
          """),format.raw/*7.11*/("""margin-top: 50px;
        """),format.raw/*8.9*/("""}"""),format.raw/*8.10*/("""
    """),format.raw/*9.5*/("""</style>
</head>
<body>
    <div class="jumbotron text-center">
	    <h1>e-Diario Login</h2>
	    <p>Insira os credenciais de logn</p>
	  </div>
    <div class="text-center">
        <img class="img-responsive center-block" src=""""),_display_(/*17.56*/routes/*17.62*/.Assets.versioned("images/user2.png")),format.raw/*17.99*/("""" alt="Avatar" class="avatar">
    </div>
    <div class="container form-login text-center">
    """),_display_(/*20.6*/loginform(formularioLogin("usuario"), formularioLogin("senha"))),format.raw/*20.69*/("""
    """),format.raw/*21.5*/("""</div>
<!--<div class="container form-login text-center">
    <form>
        <div class="form-login text-center">
        <div><input type="text" placeholder="Digite o usuario" name="user" required></div>
        <div><input type="password" placeholder="Digite a senha" name="psw" required></div>
        <div><button class="btn btn-primary" type="submit">Login</button></div>
      </div>
    </form>
</div> -->
</body>
"""))
      }
    }
  }

  def render(formularioLogin:Form[modelos.FormularioLogin]): play.twirl.api.HtmlFormat.Appendable = apply(formularioLogin)

  def f:((Form[modelos.FormularioLogin]) => play.twirl.api.HtmlFormat.Appendable) = (formularioLogin) => apply(formularioLogin)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 24 14:23:33 BRT 2017
                  SOURCE: /home/jonathan/Workspace/e-Diario/app/views/login.scala.html
                  HASH: a2613b7ecf5514f4f64a04e87414363af6b4c78f
                  MATRIX: 971->1|1115->50|1143->52|1210->93|1224->99|1305->159|1366->193|1394->194|1432->205|1484->231|1512->232|1543->237|1800->467|1815->473|1873->510|1997->608|2081->671|2113->676
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|38->6|38->6|39->7|40->8|40->8|41->9|49->17|49->17|49->17|52->20|52->20|53->21
                  -- GENERATED --
              */
          