package problem_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		try {
			//build nested arrays
			ArrayList<ArrayList<String>> lines = buildNestedArrays("src/problem_4/data.txt");
			
			//print original
			print(lines);
			
			//reverse
			reverse(lines);
			
			//print reversed
			System.out.print("\n\n*********************");
			print(lines);
			
		} catch (FileNotFoundException e) {
			System.out.print("Invalid path");
			e.printStackTrace();
		}
	}
	
	public static ArrayList<ArrayList<String>> buildNestedArrays(String path) throws FileNotFoundException {
	
		//get file
		File data  = new File(path);
        Scanner scanner = new Scanner(data);
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        while (scanner.hasNextLine()) {
        	List<String> wordsList = Arrays.asList(scanner.nextLine().split(" "));
        	ArrayList<String> wordsArrayList = new ArrayList<String>(wordsList);
            lines.add(wordsArrayList);
        }
        scanner.close();
        return lines;
	}
	
	public static void reverse(ArrayList<ArrayList<String>> lines) {
		
	    ListIterator<ArrayList<String>> itLines = lines.listIterator();
	    while(itLines.hasNext()) Collections.reverse(itLines.next());
	    Collections.reverse(lines);
	}
	
	public static void print(ArrayList<ArrayList<String>> lines) {
		
	    ListIterator<ArrayList<String>> itLines = lines.listIterator();
	    while(itLines.hasNext()) {
		    ListIterator<String> itWords = ((ArrayList<String>) itLines.next()).listIterator();
		    System.out.print("\n\n");
		    while(itWords.hasNext())
		      System.out.printf("%s ", itWords.next());
	    }
	}
}
