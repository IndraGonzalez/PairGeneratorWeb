// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/indralw/Desktop/PairGeneratorWebApp/conf/routes
// @DATE:Mon Aug 20 12:01:44 CEST 2018


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
