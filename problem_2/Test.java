package problem_2;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	
	public static void main(String[] args) {
		
		//set favorite baseball player
		BaseballPlayer bp = new BaseballPlayer("John", "$3453845", 16, "Shortstop", 0.372f, 58, 156);
		bp.print();

		//set favorite tennis player
        TennisPlayer tp = new TennisPlayer("Mike", "$985732", 94, 920);
        tp.print();
        
		//set favorite hockey player
        HockeyPlayer hp = new HockeyPlayer("Mike", "$985732", 9, "Left wing", 28, 766);
        hp.print();
	}
}
