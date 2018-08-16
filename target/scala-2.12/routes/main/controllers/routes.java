// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/indralw/Desktop/play-scala-forms-example/conf/routes
// @DATE:Wed Aug 08 15:07:45 CEST 2018

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
