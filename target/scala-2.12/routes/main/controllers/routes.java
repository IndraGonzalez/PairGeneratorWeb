// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/indralw/Desktop/PairGeneratorWebApp/conf/routes
// @DATE:Mon Aug 20 12:01:44 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePairGeneratorController PairGeneratorController = new controllers.ReversePairGeneratorController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePairGeneratorController PairGeneratorController = new controllers.javascript.ReversePairGeneratorController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
