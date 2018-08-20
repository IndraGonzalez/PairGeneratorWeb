// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/indralw/Desktop/PairGeneratorWebApp/conf/routes
// @DATE:Mon Aug 20 12:01:44 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReversePairGeneratorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def listPairs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PairGeneratorController.listPairs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pairgenerator"})
        }
      """
    )
  
    // @LINE:9
    def listTeam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PairGeneratorController.listTeam",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "team"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PairGeneratorController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def createTeam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PairGeneratorController.createTeam",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "team"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
