/*
 * Brandon Plant
 * Assignment 1
 * IT 2660 Data Structures & Algorithms
 * CRN 13907
 * Due Feb. 23, 2017
 * Spring 2017
 * Chapter 3 exercise 21
 */
import java.util.*;
public class assign3 {
	public static void main(String[] args) {

		assignmentInfo();
		testing();
		input();
	}
	
	public static void assignmentInfo() {
		System.out.println("Brandon Plant" + "\nAssignment 1" + "\nIT 2660 Data Structures & Algorithms"
    			+ "\nCRN 13907" + "\nDue Jan. 26, 2017" + "\nSpring 2017" + "\nChapter 3 exercise 21"
    			+ "\n-----------------------------------");
	}
	public static void input() {
		Scanner userInput = new Scanner(System.in);
		String mathexpression;
		String thisToken;
		postFixedStack newStack = new postFixedStack();
		System.out.println("Enter an expression in the post-fixed notation: ");
		/*try {
			
		}*/
		mathexpression = userInput.nextLine();
		System.out.println(newStack.expressionParse(mathexpression));
		
		
	}
	
	public static void testing() {
		String mathexpression;
		String thisToken;
		postFixedStack newStack = new postFixedStack();
		// Testing the '*' operator
		mathexpression = "8 5 *";
		System.out.println("Calculating the following expression: " + mathexpression);
		System.out.println(newStack.expressionParse(mathexpression));
		// Testing the '/' operator
		mathexpression = "5 10 /";
		System.out.println("Calculating the following expression: " + mathexpression);
		System.out.println(newStack.expressionParse(mathexpression));
		// Testing the '+' operator
		mathexpression = "24 85 +";
		System.out.println("Calculating the following expression: " + mathexpression);
		System.out.println(newStack.expressionParse(mathexpression));
		// Testing the '-' operator
		mathexpression = "24 85 -";
		System.out.println("Calculating the following expression: " + mathexpression);
		System.out.println(newStack.expressionParse(mathexpression));
		
	}
	
}

