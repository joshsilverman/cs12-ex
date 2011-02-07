package problem_8;

import java.util.HashSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		//build sets - with odd, without odd, empty
		HashSet<Integer> setWithOdd = new HashSet<Integer>();
		setWithOdd.add(1);
		setWithOdd.add(2);
		setWithOdd.add(3);
		setWithOdd.add(4);
		HashSet<Integer> setWithoutOdd = new HashSet<Integer>();
		setWithoutOdd.add(0);
		setWithoutOdd.add(2);
		setWithoutOdd.add(4);
		HashSet<Integer> setEmpty = new HashSet<Integer>();
		
		//check/show results
		System.out.print("Set 1: ");
		System.out.print(setWithOdd);
		System.out.print("\n\nContains odd? ");
		try {
			System.out.print(hasOdd(setWithOdd));
		} catch (EmptySetException e) {
			System.out.printf("\n\nException Caught. Message: %s", e.getMessage());
		}
		
		System.out.print("\n\nSet 2: ");
		System.out.print(setWithoutOdd);
		System.out.print("\n\nContains odd? ");
		try {
			System.out.print(hasOdd(setWithoutOdd));
		} catch (EmptySetException e) {
			System.out.printf("\n\nException Caught. Message: %s", e.getMessage());
		}
		
		System.out.print("\n\nSet 3: ");
		System.out.print(setEmpty);
		System.out.print("\n\nContains odd? ");
		try {
			System.out.print(hasOdd(setEmpty));
		} catch (EmptySetException e) {
			System.out.printf("\n\nException Caught. Message: %s", e.getMessage());
		}
		
		//main method complete
		System.out.print("\n\nCalled hadOdd method");
	}
	
	static class EmptySetException extends Throwable {
		
		private static final long serialVersionUID = 1L;

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
