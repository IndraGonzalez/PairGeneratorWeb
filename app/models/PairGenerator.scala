package models

case class PairGenerator(team : Team){

  def getPairs : Set[(TeamMember,TeamMember)] = randomizePairs(getAllPairs(team.members, team.members, Set.empty))

  private def getAllPairs(team: Set[TeamMember], teamInmutable: Set[TeamMember], pairs: Set[(TeamMember,TeamMember)]): Set[(TeamMember,TeamMember)] = {
	  if(team.isEmpty) pairs
	  else {
	    getAllPairs(team.tail,teamInmutable,findPair(team.head,teamInmutable,pairs))
	  }
	}

	private def findPair(member:TeamMember, team: Set[TeamMember], pairs: Set[(TeamMember,TeamMember)]): Set[(TeamMember,TeamMember)] = {
	  if(team.isEmpty) pairs
	  else {
	    if (!pairs.contains((member,team.head)) && !pairs.contains((team.head,member)) && member != team.head) {
	      val newPairs = pairs + (member -> team.head)
	      findPair(member, team.tail, newPairs)
	    } else
	      findPair(member, team.tail, pairs)
	  }
	}

	private def randomizePairs(pairs: Set[(TeamMember,TeamMember)]) : Set[(TeamMember,TeamMember)] = {
	  scala.util.Random.shuffle(pairs)
	}

}
