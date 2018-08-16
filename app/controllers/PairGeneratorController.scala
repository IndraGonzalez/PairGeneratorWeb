package controllers

import javax.inject.Inject
import models.TeamMember
import models.Team
import models.PairGenerator
import play.api.data._
import play.api.i18n._
import play.api.mvc._

class PairGeneratorController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  import TeamMemberForm._

  private val team = Team()
  private val pairGenerator = PairGenerator(team)
  private val postUrl = routes.PairGeneratorController.createTeam()

  def index = Action {
    Ok(views.html.index())
  }

  def listTeam = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.listTeam(team.members, form, postUrl))
  }

  def createTeam = Action { implicit request: MessagesRequest[AnyContent] =>

    val errorFunction = { formWithErrors: Form[Data] =>
      BadRequest(views.html.listTeam(team.members, formWithErrors, postUrl))
    }

    val successFunction = { data: Data =>
      val member = TeamMember(name = data.name)
      team.addTeamMember(member)
      Redirect(routes.PairGeneratorController.listTeam()).flashing("info" -> "Team member added!")
    }

    val formValidationResult = form.bindFromRequest
    formValidationResult.fold(errorFunction, successFunction)
  }

  def listPairs = Action { implicit request: MessagesRequest[AnyContent] =>
    val teamPairs = pairGenerator.getPairs
    println(teamPairs)
    Ok(views.html.listPairs(teamPairs))
  }

}
