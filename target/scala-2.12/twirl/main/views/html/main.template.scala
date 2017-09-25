
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
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
    </head>
    <body>
      <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Indice</a>
          </div>
          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-left">
              """),_display_(/*29.16*/if(estaLogad)/*29.29*/{_display_(Seq[Any](format.raw/*29.30*/("""
                """),format.raw/*30.17*/("""<li class=""""),_display_(/*30.29*/("active".when(page == "Perfil"))),format.raw/*30.62*/(""""><a href=""""),_display_(/*30.74*/routes/*30.80*/.HomeController.perfil()),format.raw/*30.104*/("""">Perfil</a></li>
              """)))}),format.raw/*31.16*/("""
            """),format.raw/*32.13*/("""</ul>
            <ul class="nav navbar-nav navbar-right">
              """),_display_(/*34.16*/if(estaLogado)/*34.30*/{_display_(Seq[Any](format.raw/*34.31*/("""
                """),format.raw/*35.17*/("""<li><p class="navbar-text">"""),_display_(/*35.45*/infoUsuario/*35.56*/.getUsuario()),format.raw/*35.69*/("""</p></li>
                <li><a href=""""),_display_(/*36.31*/routes/*36.37*/.HomeController.logout()),format.raw/*36.61*/("""">Sair</a></li>
              """)))}/*37.17*/else/*37.22*/{_display_(Seq[Any](format.raw/*37.23*/("""
                """),format.raw/*38.17*/("""<li><a href=""""),_display_(/*38.31*/routes/*38.37*/.HomeController.login()),format.raw/*38.60*/("""">Entrar</a></li>
              """)))}),format.raw/*39.16*/("""
            """),format.raw/*40.13*/("""</ul>
          </div>
        </div>
      </div>
      """),_display_(/*44.8*/content),format.raw/*44.15*/("""
      """),format.raw/*45.7*/("""<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
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
                  DATE: Sun Sep 24 22:32:54 BRT 2017
                  SOURCE: /home/jonathan/Workspace/e-Diario/app/views/main.scala.html
                  HASH: c422ed65acf2b817ea15ce38987815d286017fa9
                  MATRIX: 972->1|1145->79|1173->81|1259->141|1284->146|1561->396|1576->402|1639->443|1727->504|1742->510|1803->549|2771->1490|2793->1503|2832->1504|2877->1521|2916->1533|2970->1566|3009->1578|3024->1584|3070->1608|3134->1641|3175->1654|3276->1728|3299->1742|3338->1743|3383->1760|3438->1788|3458->1799|3492->1812|3559->1852|3574->1858|3619->1882|3669->1914|3682->1919|3721->1920|3766->1937|3807->1951|3822->1957|3866->1980|3930->2013|3971->2026|4055->2084|4083->2091|4117->2098
                  LINES: 28->1|33->1|35->3|38->6|38->6|42->10|42->10|42->10|43->11|43->11|43->11|61->29|61->29|61->29|62->30|62->30|62->30|62->30|62->30|62->30|63->31|64->32|66->34|66->34|66->34|67->35|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|71->39|72->40|76->44|76->44|77->45
                  -- GENERATED --
              */
          