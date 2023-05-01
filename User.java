import java.util.ArrayList;

public class User
{
    private Team team;
    private ArrayList<League> leagues = new ArrayList<League>();
    private String name;
    
public User(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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