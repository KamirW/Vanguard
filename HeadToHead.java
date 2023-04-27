import java.util.ArrayList;

public class HeadToHead {
	
	ArrayList<Team> teams = new ArrayList<Team>();
	public Team winner = null;
	
	public Team getMatchup() {
		
		if(teams.get(0).getTeamWorth()>teams.get(1).getTeamWorth()) {
			winner = teams.get(0);
			teams.get(0).addWin();
			teams.get(1).addLoss();
		} else {
			winner = teams.get(1);
			teams.get(1).addWin();
			teams.get(0).addLoss();
		}
		
		return winner;
	}
	
}
