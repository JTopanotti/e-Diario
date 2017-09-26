
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Boolean,InfoUsuario,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, estaLogado: Boolean, infoUsuario : InfoUsuario)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

    </head>
    <body>
      <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
          <!--<div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">play-example-login</a>
          </div> -->
          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
              <li><a href=""""),_display_(/*24.29*/routes/*24.35*/.HomeController.login()),format.raw/*24.58*/("""">Login</a></li>
            </ul>
          </div>
        </div>
      </div>
      """),_display_(/*29.8*/content),format.raw/*29.15*/("""
      """),format.raw/*30.7*/("""<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,estaLogado:Boolean,infoUsuario:InfoUsuario,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,estaLogado,infoUsuario)(content)

  def f:((String,Boolean,InfoUsuario) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,estaLogado,infoUsuario) => (content) => apply(title,estaLogado,infoUsuario)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 25 21:17:46 BRT 2017
                  SOURCE: /home/jonathan/workspace/e-Diario/app/views/main.scala.html
                  HASH: d2650d70be0dcb61ce19e57b1880fce9c3b47bbc
                  MATRIX: 999->1|1172->79|1200->81|1286->141|1311->146|1478->287|1492->293|1554->334|1641->395|1655->401|1715->440|2487->1185|2502->1191|2546->1214|2659->1301|2687->1308|2721->1315
                  LINES: 29->1|34->1|36->3|39->6|39->6|41->8|41->8|41->8|42->9|42->9|42->9|57->24|57->24|57->24|62->29|62->29|63->30
                  -- GENERATED --
              */
          