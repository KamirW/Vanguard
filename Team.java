import java.util.ArrayList;

public class Team 
{
    private int teamWorth;
    private String name;
    private int teamSize;
    private int teamSizeCap;
    private int wins, losses, ties;
    ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name)
    {
        this.name = name;
        wins=0;
        losses=0;
        ties=0;
    }

    public void addPlayer(Player player)
    {
        if (players.size() < this.teamSizeCap)
            players.add(player);
            
        return;
    }

    public void removePlayer(Player player)
    {
        players.remove(player);
        return;
    }

    public void tradePlayer(Player p1, Player p2, Team otherTeam)
    {
        players.remove(p1);
        players.add(p2);

        otherTeam.removePlayer(p2);
        otherTeam.addPlayer(p1);
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

    public int getTeamWorth()
    {
        return this.teamWorth;
    }

    public String getName()
    {
        return this.name;
    }

    public int getTeamSize()
    {
        return this.teamSize;
    }

	public int getTeamSizeCap() {
		return teamSizeCap;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getTies() {
		return ties;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public int getTeamWeeklyScore() {
		int teamWeeklyScore=0;
		for(Player player: players) {
			teamWeeklyScore+=player.getWeeklyPoints();
		}
		
		return teamWeeklyScore;
	}
	
	
    
    
}