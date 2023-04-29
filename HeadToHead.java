import java.util.ArrayList;

public class HeadToHead {
	
	ArrayList<Team> teams = new ArrayList<Team>();
	private Team winner = null;
	
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

/*
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
	*/
