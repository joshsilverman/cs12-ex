package problem_2;

public class TennisPlayer extends Player {

	public static final String sport = "Tennis";
	
	private int titleOpenERA;
	private int openERAMatchWins;
	
	TennisPlayer(String nam, String sal, int titles, int matchWins) {
		super(nam, sal);
		titleOpenERA = titles;
		openERAMatchWins = matchWins;
	}
	
	public int getTitleOpenERA() {
		return titleOpenERA;
	}
	
	public int getOpenERAMatchWins() {
		return openERAMatchWins;
	}
	
	public void print() {
		super.print();
		System.out.printf("Sport: %s\n", sport);
		System.out.printf("Titles in Open ERA: %d\n", titleOpenERA);
		System.out.printf("Open ERA Match Wins: %d\n", openERAMatchWins);
	}
	
}
