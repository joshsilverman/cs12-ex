package problem_2;

public class TeamSportPlayer extends Player {

	int number;
	String position;
	
	TeamSportPlayer(String nam, String sal, int num, String pos) {
		super(nam, sal);
		number = num;
		position = pos;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void print() {
		super.print();
		System.out.printf("Number: %d\n", number);
		System.out.printf("Position: %s\n", position);
	}
	
}
