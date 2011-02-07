package problem_3;

import java.util.ArrayList;

public class Problem3 {

	public static void main(String[] args) {
		
		//build an ArrayList of integers
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = -2; i <= 10; i++) {
			intList.add(i);
		}
		
		//scale by k and print
		ArrayList<Integer> scaledIntList = scaleByK(intList);
		System.out.print(scaledIntList);
	}
	
	public static ArrayList<Integer> scaleByK(ArrayList<Integer> intList) {
		
		//scaled ints list
		ArrayList<Integer> scaledIntList = new ArrayList<Integer>();
		
	    for (int integer : intList) {
	    	//remove if less than 1
	    	if (integer < 1) continue; 
	    	for (int j = 0; j < integer; j++) scaledIntList.add(integer);
	    }
	    
		return scaledIntList;
	}
}
