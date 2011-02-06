package problem_8;

import java.util.HashSet;

import problem_8.SetTest.EmptySetException;

public class Test {

	public static void main(String[] args) {
		
		//instantiate a set test
		SetTest setTest = new SetTest();
		
		//build sets - with odd, without, empty
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
			System.out.print(setTest.hasOdd(setWithOdd));
		} catch (EmptySetException e) {
			System.out.printf("\n\nException Caught. Message: %s", e.getMessage());
		}
		
		System.out.print("\n\nSet 2: ");
		System.out.print(setWithoutOdd);
		System.out.print("\n\nContains odd? ");
		try {
			System.out.print(setTest.hasOdd(setWithoutOdd));
		} catch (EmptySetException e) {
			System.out.printf("\n\nException Caught. Message: %s", e.getMessage());
		}
		
		System.out.print("\n\nSet 3: ");
		System.out.print(setEmpty);
		System.out.print("\n\nContains odd? ");
		try {
			System.out.print(setTest.hasOdd(setEmpty));
		} catch (EmptySetException e) {
			System.out.printf("\n\nException Caught. Message: %s", e.getMessage());
		}
		
		//main method complete
		System.out.print("\n\nCalled hadOdd method");
	}
	
}
