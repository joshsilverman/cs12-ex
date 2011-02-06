package problem_1;

public class SequentialIncrementer implements Incrementable {

	private int integer = 0;
	
	@Override
	public int getValue() {
		return integer;
		
	}

	@Override
	public void increment() {
		integer++;
	}

}
