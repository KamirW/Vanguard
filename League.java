import java.util.LinkedList;

public class League {
	private String name, manager;
	private int pointMax, wins, losses, ties;
	private LinkedList<String> teams;

	public League(String name, String manager, int pointMax, LinkedList teams) {
		this.name = name;
		this.pointMax = pointMax;
		this.teams = teams;
		wins = 0;
		losses = 0;
		ties = 0;
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

	public void removeTeam(String player) {
		teams.remove(player);
	}

	public void addTeam(String player) {
		teams.add(player);
	}

	private void setPointMax(int newMax) {
		pointMax = newMax;
	}

	public void addWin() { // set wins method team
		wins++;
	}

	public void addLoss() { // set losses method team
		losses++;
	}

	public void addTie() { // set ties method team
		ties++;
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

	public int getWins(String team) { // Change to get team.wins
		return wins;
	}

	public int getLosses() {// Change to get team.losses
		return losses;
	}

	public int getTies() {// Change to get team.ties
		return ties;
	}

	public LinkedList<String> getTeams() {
		return teams;
	}

	public void initiateHeadToHead(String team1, String team2) { // These scores are placeholders for what will be
																	// team1.getScore and team2.getScore
		int score1 = 1, score2 = 2;

		if (score1 > score2) {
			addWin(); // team1.addwins team2.addLoss
		}

		else if (score1 == score2) {
			addTie(); // team1.addTie, team2.addTie
		}

		else {
			addLoss(); // team2.addWin, team1.addLoss
		}

	}
}
