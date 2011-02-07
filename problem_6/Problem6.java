package problem_6;

import java.util.Collections;
import java.util.HashSet;
import java.util.HashSet;

public class Problem6 {

	public static void main(String[] args) {
		
		//declare two sets of strings
		HashSet<Object> set1 = new HashSet<Object>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		set1.add("e");
		set1.add("f");
		
		HashSet<Object> set2 = new HashSet<Object>();
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("g");
		set2.add("h");
		set2.add("i");
		
		//find symmetric difference
		HashSet<Object> sd = symmetricDiff(set1, set2);
		
		//print set1, set2, sd
		System.out.print("Set 1: ");
		System.out.print(set1);
		System.out.print("\n\nSet 2: ");
		System.out.print(set2);
		System.out.print("\n\nSymmetric Difference: ");
		System.out.print(sd);
		
		//example with integers
		HashSet<Object> set3 = new HashSet<Object>();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set3.add(5);
		set3.add(6);
		
		HashSet<Object> set4 = new HashSet<Object>();
		set4.add(1);
		set4.add(2);
		set4.add(3);
		set4.add(7);
		set4.add(8);
		set4.add(9);
		
		//find symmetric difference
		HashSet<Object> sd2 = symmetricDiff(set3, set4);
		
		//print set1, set2, sd
		System.out.print("\n\nSet 3: ");
		System.out.print(set3);
		System.out.print("\n\nSet 4: ");
		System.out.print(set4);
		System.out.print("\n\nSymmetric Difference: ");
		System.out.print(sd2);
	}
	
	@SuppressWarnings("unchecked")
	public static HashSet<Object> symmetricDiff(HashSet<Object> set1, HashSet<Object> set2) {
		
		//initialize symmetric diff to set1
		HashSet<Object> sd = (HashSet<Object>) set1.clone();
		
		//iterate through set2 - unset element from s1 if exists, add if not 
		for (Object element : set2) {
			if (sd.contains(element)) sd.remove(element);
			else sd.add(element);
		}
		
		return sd;
	}
}
