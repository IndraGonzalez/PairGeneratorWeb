package models

case class Team(){

  private var teamMembers = scala.collection.mutable.Seq.empty[TeamMember]

  def addTeamMember(teamMember: TeamMember){
    teamMembers = teamMembers :+ teamMember
  }

  def members = teamMembers

}
