
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""import modelos.InfoUsuario._
"""),_display_(/*2.2*/(pagina : String, estaLogado : Boolean, infoUsuario: InfoUsuario)),format.raw/*2.67*/("""

"""),_display_(/*4.2*/main(pagina, estaLogado, infoUsuario)/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
  """),format.raw/*5.3*/("""<h1>Welcome to Play!</h1>
""")))}),format.raw/*6.2*/("""
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
                  DATE: Sun Sep 24 22:32:10 BRT 2017
                  SOURCE: /home/jonathan/Workspace/e-Diario/app/views/index.scala.html
                  HASH: 7c419611b545e9b4d6a38c5a9b304008bf89d4fb
                  MATRIX: 1030->0|1085->30|1170->95|1198->98|1243->135|1282->137|1311->140|1367->167
                  LINES: 33->1|34->2|34->2|36->4|36->4|36->4|37->5|38->6
                  -- GENERATED --
              */
          