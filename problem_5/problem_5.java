package problem_5;

import java.util.ArrayList;

public class problem_5 {

	public static void main(String[] args) {
		
		//define two lists
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			list1.add(i);
		}
		for (int i = 1; i <= 10; i++) {
			list2.add(i);
		}
		
		//run alternate
		ArrayList<Integer> alternatingLists = alternate(list1, list2);
		
		//print original lists and alternated list
		System.out.print(alternatingLists);
	}
	
	public static ArrayList<Integer> alternate(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		//determine larger/smaller lists
		ArrayList<Integer> largerList;
		ArrayList<Integer> smallerList;
		if (list1.size() >= list2.size()) {
			largerList = list1;
			smallerList = list2;
		}
		else {
			largerList = list2;
			smallerList = list1;			
		}
		
		//alternate lists
		ArrayList<Integer> alternatingLists = new ArrayList<Integer>();
		int smallerListSize = smallerList.size();
		for (int i = 0; i < largerList.size(); i++) {
			alternatingLists.add(largerList.get(i));
			if (i < smallerListSize) alternatingLists.add(smallerList.get(i));
		}
		
		return alternatingLists;
	}
}
