package problem_2;

public class Player {

	String name;
	String salary;
	
	Player(String nam, String sal) {
		name = nam;
		salary = sal;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public void print() {
		System.out.printf("\nName: %s\n", name);
		System.out.printf("Salary: %s\n", salary);
	}
}
