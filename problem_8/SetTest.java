package problem_8;

import java.util.HashSet;

public class SetTest {
	
	static class EmptySetException extends Throwable {
		
		//fire parent method
		public EmptySetException(String m) {
			super(m);
		}
	}
	
	public static boolean hasOdd(HashSet<Integer> set) throws EmptySetException {
		
		//throw exception if set empty
		if (set.size() == 0) throw new EmptySetException("Set must contain at least one integer.");
		
		
		//iterate through integers, looking for odd
		boolean hasOdd = false;
		for (Integer integer : set) if (integer % 2 > 0) hasOdd = true;
		
		return hasOdd;
	}
}
