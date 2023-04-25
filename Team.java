import java.util.ArrayList;

public class Team 
{
    private int teamWorth;
    private String name;
    private int teamSize;
    private int teamSizeCap;
    ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name)
    {
        this.name = name;
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
}