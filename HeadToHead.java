import java.util.ArrayList;

public class HeadToHead {
	public static void main(String[] args) {
		
		
		ArrayList<Team> teams = new ArrayList<Team>();
		
		String winner = "";
		
		if (teams.get(0).getTeamWorth() > teams.get(1).getTeamWorth() ) {
			winner = teams.get(0).getName();
		} else {
			winner = teams.get(1).getName();
		}
		
		System.out.println("                WEEK 1 MATCHUP");
		System.out.println("\n\n\n");
		System.out.println("%10s vs %10s", teams.get(0).getName(), teams.get(1).getName());
		System.out.printf("%15s winner");
		
		

	}
}
