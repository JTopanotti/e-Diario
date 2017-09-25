
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jonathan/Workspace/e-Diario/conf/routes
// @DATE:Sun Sep 24 22:32:11 BRT 2017


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
