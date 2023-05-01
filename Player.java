
public class Player
{
    private Team team;
    private double points;
    private String name;
    private String position;
    private int weeklyPoints;

    public Player(String name, String position, double points)
    {
        this.name = name;
        this.position = position;
        this.points = points;
    }

    public void updatePoints()
    {
        // This method will probably be deprecated because we are manually inputting values
        return;
    }

    public void setWeeklyPoints(int points)
    {
        this.weeklyPoints = points;
        return;
    }

    public void setTeam(Team team)
    {
        this.team = team;
        return;
    }

    public Team getTeam()
    {
        if (this.team == null)
            return null;

        return this.team;
    }

    public int getWeeklyPoints()
    {
        return this.weeklyPoints;
    }

    public double getPoints()
    {
        return this.points;
    }

    public String getPosition()
    {
        return this.position;
    }

    public String getName()
    {
        return this.name;
    }
    
    public String toString() {
    	return name + ", " + position + ", " + points;
    }


}
