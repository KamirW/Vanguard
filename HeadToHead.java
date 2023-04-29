import java.util.ArrayList;

public class HeadToHead {
	
	private Team winner = null;	
	
	public Team getMatchup(Team team1, Team team2) {
		
		if(team1.getTeamWorth() > team2.getTeamWorth()) {
			winner = team1;
			team1.addWin();
			team2.addLoss();
		} else {
			winner = team2;
			team2.addWin();
			team1.addLoss();
		}
		
		return winner;
	}
}
