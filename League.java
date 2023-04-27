import java.util.LinkedList;

public class League {
	private String name, manager;
	private int pointMax;
	private LinkedList<Team> teams;

	public League(String name, String manager, int pointMax, LinkedList teams) {
		this.name = name;
		this.pointMax = pointMax;
		this.teams = teams;
		this.manager = manager;
	}

	public League(String name, String manager, int pointMax) {
		this.name = name;
		this.manager = manager;
		this.pointMax = pointMax;
	}

	public League(String name, String manager, LinkedList teams) {
		this.name = name;
		this.manager = manager;
		this.teams = teams;
		pointMax = 200;
	}
	
	public League(String name, Team team) {
		this.name=name;
		teams.add(team);
		
	}

	public void removeTeam(String player) {
		teams.remove(player);
	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	private void setPointMax(int newMax) {
		pointMax = newMax;
	}

	

	public String getName() { // set Ties method
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPointMax() {
		return pointMax;
	}

	

	public LinkedList<Team> getTeams() {
		return teams;
	}

	public void initiateHeadToHead(Team team1, Team team2) { // These scores are placeholders for what will be
																	// team1.getScore and team2.getScore
		int score1 = 1, score2 = 2;

		if (score1 > score2) {
			team1.addWin();
			team2.addLoss();// team1.addwins team2.addLoss
		}

		else if (score1 == score2) {
			team1.addTie();// team1.addTie, team2.addTie
			team2.addTie();
		}

		else {
			team1.addLoss();
			team2.addWin();// team2.addWin, team1.addLoss
		}

	}
}
