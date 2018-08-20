// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/indralw/Desktop/PairGeneratorWebApp/conf/routes
// @DATE:Mon Aug 20 12:01:44 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReversePairGeneratorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def listPairs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pairgenerator")
    }
  
    // @LINE:9
    def listTeam(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "team")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def createTeam(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "team")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
