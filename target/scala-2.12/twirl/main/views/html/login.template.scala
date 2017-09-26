
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
                  DATE: Mon Sep 25 20:48:24 BRT 2017
                  SOURCE: /home/jonathan/workspace/e-Diario/app/views/login.scala.html
                  HASH: 6df31ecb602c9ee6aa39293e95e79da557f8ca9e
                  MATRIX: 998->1|1142->50|1170->52|1237->93|1251->99|1332->159|1393->193|1421->194|1459->205|1511->231|1539->232|1570->237|1827->467|1842->473|1900->510|2024->608|2108->671|2140->676
                  LINES: 29->1|34->1|36->3|37->4|37->4|37->4|39->6|39->6|40->7|41->8|41->8|42->9|50->17|50->17|50->17|53->20|53->20|54->21
                  -- GENERATED --
              */
          