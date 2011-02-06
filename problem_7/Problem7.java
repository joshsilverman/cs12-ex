package problem_7;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem7 {

	public static void main(String[] args) {
		
		//build lists of strings
		ArrayList<String> strs1 = new ArrayList<String>();
		strs1.add("a");
		strs1.add("b");
		strs1.add("c");
		strs1.add("a");
		strs1.add("b");
		strs1.add("d");
		strs1.add("e");
		strs1.add("f");
		strs1.add("b");
		strs1.add("a");
		
		ArrayList<String> strs2 = new ArrayList<String>();
		strs2.add("a");
		strs2.add("b");
		strs2.add("a");
		
		//str 1 contains 3?
		System.out.print("List 1: ");
		System.out.print(strs1);
		System.out.print("\n\nContains 3? ");
		System.out.print(contains3(strs1));
		
		//str 1 contains 3?
		System.out.print("\n\nList 2: ");
		System.out.print(strs2);
		System.out.print("\n\nContains 3? ");
		System.out.print(contains3(strs2));
	}
	
	public static boolean contains3(ArrayList<String> strs) {
		
		boolean contains3 = false;
		
		//occurence counts
		HashMap<String, Integer> occurenceCounts = new HashMap<String, Integer>();
		Object occurenceCount;
		Integer occurenceCountInt;
		for (String str : strs) {
			occurenceCount = occurenceCounts.get(str);
			if (occurenceCount == null) {
				occurenceCounts.put(str, new Integer(1));

			}
			else if (occurenceCount instanceof Integer) {
				occurenceCountInt = ((Integer) occurenceCount) + 1;
				occurenceCounts.put(str, occurenceCountInt);
				if (occurenceCountInt > 2) contains3 = true;
			}
			
		}
		
		return contains3;
	}
}
