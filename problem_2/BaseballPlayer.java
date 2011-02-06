package problem_2;

public class BaseballPlayer extends TeamSportPlayer {

	public static final String sport = "Baseball";
	
	private float battingAve;
	private int homerunCount;
	private int rbiCount;
	
	BaseballPlayer(String nam, String sal, int num, String pos, float ba, int hc, int rc) {
		super(nam, sal, num, pos);
		battingAve = ba;
		homerunCount = hc;
		rbiCount = rc;
	}
	
	public float getBattingAve() {
		return battingAve;
	}
	
	public int getHomerunCount() {
		return homerunCount;
	}
	
	public int getRbiCount() {
		return rbiCount;
	}
	
	public void print() {
		super.print();
		System.out.printf("Sport: %s\n", sport);
		System.out.printf("Batting ave: %f\n", battingAve);
		System.out.printf("Homeruns: %d\n", homerunCount);
		System.out.printf("RBIs: %d\n", rbiCount);
	}
}
