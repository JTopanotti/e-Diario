
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jonathan/workspace/e-Diario/conf/routes
// @DATE:Mon Sep 25 21:19:21 BRT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
