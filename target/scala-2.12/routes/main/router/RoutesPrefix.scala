// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/indralw/Desktop/play-scala-forms-example/conf/routes
// @DATE:Wed Aug 08 15:07:45 CEST 2018


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