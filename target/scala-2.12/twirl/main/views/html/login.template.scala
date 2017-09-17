
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<head>
    <link rel="stylesheet" href=""""),_display_(/*2.35*/routes/*2.41*/.Assets.versioned("stylesheets/bootstrap/css/bootstrap.css")),format.raw/*2.101*/("""">
    <style>
        .form-login"""),format.raw/*4.20*/("""{"""),format.raw/*4.21*/("""
          """),format.raw/*5.11*/("""margin-top: 50px;
        """),format.raw/*6.9*/("""}"""),format.raw/*6.10*/("""
    """),format.raw/*7.5*/("""</style>
</head>
<body>
    <div class="jumbotron text-center">
	    <h1>e-Diario Login</h2>
	    <p>Insira os credenciais de logn</p>
	</div>
    <div class="text-center">
        <img class="img-responsive center-block" src=""""),_display_(/*15.56*/routes/*15.62*/.Assets.versioned("images/user2.png")),format.raw/*15.99*/("""" alt="Avatar" class="avatar">
    </div>
<div class="container">
    <form>
        <div class="form-login text-center">
        <div><input type="text" placeholder="Digite o usuario" name="user" required></div>
        <div><input type="password" placeholder="Digite a senha" name="psw" required></div>
        <div><button class="btn btn-primary" type="submit">Login</button></div>
        </div
    </form>
</div>
</body>
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
                  DATE: Sun Sep 17 19:02:41 BRT 2017
                  SOURCE: /home/jonathan/Workspace/e-diario/app/views/login.scala.html
                  HASH: 35e15c6034c1cf5dc55c45abda60006f3c822aa9
                  MATRIX: 1030->0|1097->41|1111->47|1192->107|1253->141|1281->142|1319->153|1371->179|1399->180|1430->185|1685->413|1700->419|1758->456
                  LINES: 33->1|34->2|34->2|34->2|36->4|36->4|37->5|38->6|38->6|39->7|47->15|47->15|47->15
                  -- GENERATED --
              */
          