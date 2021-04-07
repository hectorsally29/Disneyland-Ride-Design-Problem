import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class disneyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput = 0;
		String input;

		Scanner name = new Scanner(System.in);

		// Check if you are VIP or not
		System.out.print("Welcome to our ride, are you normal or fast pass?" + "\nType 0 for normal or 1 for fast");
		userInput = name.nextInt();
		name.nextLine();
		System.out.print("Enter name of customer:");
		input = name.nextLine();

		Queue<String> Line1 = new LinkedList<>();
		Queue<String> Line2 = new LinkedList<>();
		Queue<String> fastLine = new LinkedList<>();

		// Line 1
		Line1.add("enri");
		Line1.add("arcy");
		Line1.add("obi");
		Line1.add("hey");

		// Line2
		Line2.add("dude");
		Line2.add("person");

		// Line 4
		fastLine.add("lol");
		
		//calling methods
		checkSmallestLine(Line1, Line2, input, userInput);
		fastLaneChecker(fastLine, input, userInput);
		errors(userInput);
	}
	
	public static void errors(int userInput) {
		// If the user types in wrong input than the system will close
        if (userInput != 1 && userInput != 0) {
            System.out.println("Error! Invalid input, program now closing");
            System.exit(0);
        }
	}

	public static void checkSmallestLine(Queue<String> Line1, Queue<String> Line2, String input, int userInput) {
		// check which line1 is shorter
		if (userInput == 0) {
			if (Line2.size() <= Line1.size()) {
				// do nothing
				Line2.add(input);
				System.out.println(Line2);

			}

			if (Line1.size() <= Line2.size()) {
				// do nothing
				System.out.println(Line1);

			}
		}

	}

	public static void fastLaneChecker(Queue<String> fastLine, String input, int userInput) {
		if (userInput == 1) {
			fastLine.add(input);
			System.out.println(fastLine);
		}
	}
	

}
