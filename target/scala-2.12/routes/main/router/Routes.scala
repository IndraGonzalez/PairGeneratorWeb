// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/indralw/Desktop/play-scala-forms-example/conf/routes
// @DATE:Wed Aug 08 15:07:45 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  PairGeneratorController_1: controllers.PairGeneratorController,
  // @LINE:16
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PairGeneratorController_1: controllers.PairGeneratorController,
    // @LINE:16
    Assets_0: controllers.Assets
  ) = this(errorHandler, PairGeneratorController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PairGeneratorController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PairGeneratorController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """team""", """controllers.PairGeneratorController.listTeam"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """team""", """controllers.PairGeneratorController.createTeam"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pairgenerator""", """controllers.PairGeneratorController.listPairs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_PairGeneratorController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_PairGeneratorController_index0_invoker = createInvoker(
    PairGeneratorController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PairGeneratorController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PairGeneratorController_listTeam1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("team")))
  )
  private[this] lazy val controllers_PairGeneratorController_listTeam1_invoker = createInvoker(
    PairGeneratorController_1.listTeam,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PairGeneratorController",
      "listTeam",
      Nil,
      "GET",
      this.prefix + """team""",
      """ Team Members""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_PairGeneratorController_createTeam2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("team")))
  )
  private[this] lazy val controllers_PairGeneratorController_createTeam2_invoker = createInvoker(
    PairGeneratorController_1.createTeam,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PairGeneratorController",
      "createTeam",
      Nil,
      "POST",
      this.prefix + """team""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PairGeneratorController_listPairs3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pairgenerator")))
  )
  private[this] lazy val controllers_PairGeneratorController_listPairs3_invoker = createInvoker(
    PairGeneratorController_1.listPairs,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PairGeneratorController",
      "listPairs",
      Nil,
      "GET",
      this.prefix + """pairgenerator""",
      """ Pair Generator""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PairGeneratorController_index0_route(params@_) =>
      call { 
        controllers_PairGeneratorController_index0_invoker.call(PairGeneratorController_1.index)
      }
  
    // @LINE:9
    case controllers_PairGeneratorController_listTeam1_route(params@_) =>
      call { 
        controllers_PairGeneratorController_listTeam1_invoker.call(PairGeneratorController_1.listTeam)
      }
  
    // @LINE:10
    case controllers_PairGeneratorController_createTeam2_route(params@_) =>
      call { 
        controllers_PairGeneratorController_createTeam2_invoker.call(PairGeneratorController_1.createTeam)
      }
  
    // @LINE:13
    case controllers_PairGeneratorController_listPairs3_route(params@_) =>
      call { 
        controllers_PairGeneratorController_listPairs3_invoker.call(PairGeneratorController_1.listPairs)
      }
  
    // @LINE:16
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
