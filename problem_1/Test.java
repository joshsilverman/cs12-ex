package problem_1;

public class Test {

	public static void main(String[] args) {
		
		/* sample invokation of SequentialIncrementer */
		SequentialIncrementer si = new SequentialIncrementer();
		System.out.printf("Value prior to sequential incrementation: %d\n", si.getValue());
		si.increment();
		System.out.printf("Value after sequential incrementation: %d", si.getValue());
		
		/* sample invokation of RandomIncrementer */
		RandomIncrementer ri = new RandomIncrementer();
		System.out.printf("\n\nValue prior to random incrementation: %d\n", ri.getValue());
		ri.increment();
		System.out.printf("Value after random incrementation: %d", ri.getValue());
	}
	
}
