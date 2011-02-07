/* driver program to test problem 2 */

package problem_2;

public class Driver {
	
	public static void main(String[] args) {
		
		//set favorite baseball player
		BaseballPlayer bp = new BaseballPlayer("John", "$3453845", 16, "Shortstop", 0.372f, 58, 156);
		bp.print();

		//set favorite tennis player
        TennisPlayer tp = new TennisPlayer("Mike", "$985732", 94, 920);
        tp.print();
        
		//set favorite hockey player
        HockeyPlayer hp = new HockeyPlayer("Dan", "$985732", 9, "Left wing", 28, 766);
        hp.print();
	}
}
