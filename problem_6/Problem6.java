package problem_6;

import java.util.Collections;
import java.util.HashSet;
import java.util.HashSet;

public class Problem6 {

	public static void main(String[] args) {
		
		//declare two sets
		HashSet<String> set1 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		set1.add("e");
		set1.add("f");
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("g");
		set2.add("h");
		set2.add("i");
		
		//find symmetric difference
		HashSet<String> sd = symmetricDiff(set1, set2);
		
		//print set1, set2, sd
		System.out.print("Set 1: ");
		System.out.print(set1);
		System.out.print("\n\nSet 2: ");
		System.out.print(set2);
		System.out.print("\n\nSymmetric Differnce: ");
		System.out.print(sd);
	}
	
	public static HashSet<String> symmetricDiff(HashSet<String> set1, HashSet<String> set2) {
		
		//initialize symmetric diff to set1
		HashSet<String> sd = (HashSet<String>) set1.clone();
		
		//iterate through set2 - unset element from s1 if exists, add if not 
		for (String element : set2) {
			if (sd.contains(element)) sd.remove(element);
			else sd.add(element);
		}
		
		return sd;
	}
}
