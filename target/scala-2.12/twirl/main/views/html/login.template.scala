
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


Seq[Any](format.raw/*1.1*/("""<div class="container-fluid">
    <h2>e-Diario Login</h2>
    <div class="container-img">
        <img src=""""),_display_(/*4.20*/routes/*4.26*/.Assets.versioned("images/user.png")),format.raw/*4.62*/("""" alt="Avatar" class="avatar">
    </div>

    <form>
       <div class="container-fluid">
           <label><b>Usuario</b></label>
           <input type="text" placeholder="Digite o usuario" name="user" required>
           <label><b>Senha</b></label>
           <input type="password" placeholder="Digite a senha" name="psw" required>

           <button type="submit">Login</button>
       </div>
    </form>
</div>
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
                  DATE: Sun Sep 17 12:33:45 BRT 2017
                  SOURCE: /home/jonathan/Workspace/e-diario/app/views/login.scala.html
                  HASH: 98fa53dc593d9dd26c9da54eab1df0feca4e0447
                  MATRIX: 1030->0|1165->109|1179->115|1235->151
                  LINES: 33->1|36->4|36->4|36->4
                  -- GENERATED --
              */
          