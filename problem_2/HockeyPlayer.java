package problem_2;

public class HockeyPlayer extends TeamSportPlayer {
	
	public static final String sport = "Hockey";
	
	private int goalCount;
	private int penaltyMinuteCount;
	
	HockeyPlayer(String nam, String sal, int num, String pos, int gc, int pc) {
		super(nam, sal, num, pos);
		goalCount = gc;
		penaltyMinuteCount = pc;
	}
	
	public int getGoalCount() {
		return goalCount;
	}
	
	public int getPenaltyMinuteCount() {
		return penaltyMinuteCount;
	}
	
	public void print() {
		super.print();
		System.out.printf("Sport: %s\n", sport);
		System.out.printf("Goals: %d\n", goalCount);
		System.out.printf("Penalty minutes: %d\n", penaltyMinuteCount);
	}
}
