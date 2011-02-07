package problem_5;

import java.util.ArrayList;

public class problem_5 {

	public static void main(String[] args) {
		
		//define two lists
		ArrayList<Object> list1 = new ArrayList<Object>();
		ArrayList<Object> list2 = new ArrayList<Object>();
		for (int i = 1; i <= 5; i++) {
			list1.add(i);
		}
		for (int i = 1; i <= 10; i++) {
			list2.add(i);
		}
		
		//run alternate
		ArrayList<Object> alternatingLists = alternate(list1, list2);
		
		//print original lists and alternated list
		System.out.print(alternatingLists);
	}
	
	public static ArrayList<Object> alternate(ArrayList<Object> list1, ArrayList<Object> list2) {
		
		//determine larger/smaller lists
		ArrayList<Object> largerList;
		ArrayList<Object> smallerList;
		if (list1.size() >= list2.size()) {
			largerList = list1;
			smallerList = list2;
		}
		else {
			largerList = list2;
			smallerList = list1;			
		}
		
		//alternate lists
		ArrayList<Object> alternatingLists = new ArrayList<Object>();
		int smallerListSize = smallerList.size();
		for (int i = 0; i < largerList.size(); i++) {
			alternatingLists.add(largerList.get(i));
			if (i < smallerListSize) alternatingLists.add(smallerList.get(i));
		}
		
		return alternatingLists;
	}
}
