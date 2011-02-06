package problem_1;

public class RandomIncrementer implements Incrementable {

	private int integer;
	
	//initiate random integer
	RandomIncrementer() {
		integer = randInteger();
	}
	
	@Override
	public int getValue() {
		return integer;
	}

	@Override
	public void increment() {
		integer = randInteger();
	}
	
	private int randInteger() {
		return (int)(Math.random() * (Integer.MAX_VALUE));
	}

}
