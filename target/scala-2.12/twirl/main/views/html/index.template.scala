
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Boolean,InfoUsuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagina: String, estaLogado: Boolean, infoUsuario: InfoUsuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""

"""),_display_(/*3.2*/main(pagina, estaLogado, infoUsuario)/*3.39*/{_display_(Seq[Any](format.raw/*3.40*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to THE JUNGLE, WE'VE GOT FUN AND GAMES!</h1>
  <h2>SHA NA NA NA NA NA NEEE NEEE</h2>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(pagina:String,estaLogado:Boolean,infoUsuario:InfoUsuario): play.twirl.api.HtmlFormat.Appendable = apply(pagina,estaLogado,infoUsuario)

  def f:((String,Boolean,InfoUsuario) => play.twirl.api.HtmlFormat.Appendable) = (pagina,estaLogado,infoUsuario) => apply(pagina,estaLogado,infoUsuario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 25 20:57:07 BRT 2017
                  SOURCE: /home/jonathan/workspace/e-Diario/app/views/index.scala.html
                  HASH: 2133e9f79a99c8fbb6b70884d03b9198d3a36d46
                  MATRIX: 995->1|1153->64|1181->67|1226->104|1264->105|1293->108|1420->206
                  LINES: 29->1|34->1|36->3|36->3|36->3|37->4|39->6
                  -- GENERATED --
              */
          