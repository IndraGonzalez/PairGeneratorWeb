package models

case class PairGenerator(team : Team){

  def getPairs : Seq[(TeamMember,TeamMember)] = randomizePairs(getAllPairs(team.members, Seq.empty))

  private def getAllPairs(restOfteam: Seq[TeamMember], pairs: Seq[(TeamMember,TeamMember)]): Seq[(TeamMember,TeamMember)] = {
	  if(restOfteam.isEmpty) pairs
	  else getAllPairs(restOfteam.tail,findPair(restOfteam.head,team.members.toSeq,pairs))
	}

	private def findPair(member:TeamMember, team: Seq[TeamMember], pairs: Seq[(TeamMember,TeamMember)]): Seq[(TeamMember,TeamMember)] = {
	  if(team.isEmpty) pairs
	  else {
	    if (!pairs.contains((member,team.head)) && !pairs.contains((team.head,member)) && member != team.head) {
        val newPairs = pairs :+ (member,team.head)
	      findPair(member, team.tail, newPairs)
	    } else
	      findPair(member, team.tail, pairs)
	  }
	}

	private def randomizePairs(pairs: Seq[(TeamMember,TeamMember)]) : Seq[(TeamMember,TeamMember)] = {
    scala.util.Random.shuffle(pairs)
	}

}
