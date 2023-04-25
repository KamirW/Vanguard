import Team;
import League;
import java.util.ArrayList;

public class User
{
    Team team;
    ArrayList<League> leagues = new ArrayList<League>();

    public void createLeague(String name)
    {
        leagues.add(new League(name, this.team));
        return;
    }

    public void joinLeagueRequest()
    {
        // Don't really think I'm too clear on the functionality of this 
        return;
    }

}