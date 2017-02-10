/*
 * Brandon Plant
 * Assignment 2
 * IT 2660 Data Structures & Algorithms
 * CRN 13907
 * Due Feb. 9th, 2017
 * Spring 2017
 * Chapter 2 exercise 19
 */
import java.util.Scanner;

public class driver21 {
    public static void main(String[] args) {
    	System.out.println("Brandon Plant" + "\nAssignment 2" + "\nIT 2660 Data Structures & Algorithms"
    			+ "\nCRN 13907" + "\nDue Feb. 9th, 2017" + "\nSpring 2017" + "\nChapter 2 exercise 21"
    			+ "\n-----------------------------------");
    	//Set the options
    	int option;
    	int i = 0;
    	String studentName = "";
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("How big is the data set?: ");
    	//Sets the data set length
		int dataLength = userInput.nextInt();
		if (dataLength != 0)
		{
			System.out.println("How many students?: ");
			int students = userInput.nextInt();
			while (i < students)
			{
				System.out.println("Please enter the student's name");
				studentName = userInput.next();
				System.out.println("Please enter the student's ID");
				int ID = userInput.nextInt();
				System.out.println("Please enter the student's GPA");
				double GPA = userInput.nextDouble();
				StudentListings temp = new StudentListings(studentName, ID, GPA);
				i++;
			}
			//Creates new sort object with dataset length
			SortedArray sort = new SortedArray (dataLength); 
			do {
				System.out.println("Enter:");
				System.out.println("1 to insert a new student's information");
				System.out.println("2 to fetch and output a student's information");
				System.out.println("3 to delete a student's information");
				System.out.println("4 to update a student's information");
				System.out.println("5 to output all the student's information");
				System.out.println("6 to exit the program");
				option = userInput.nextInt();
				switch (option){
    		
					case 1:
						System.out.println("Please enter the student's name");
						studentName = userInput.next();
						System.out.println("Please enter the student's ID");
						int ID = userInput.nextInt();
						System.out.println("Please enter the student's GPA");
						double GPA = userInput.nextDouble();
						StudentListings temp = new StudentListings(studentName, ID, GPA);
						System.out.println(temp.output());
						break;
				
					case 2:
						System.out.println("Please enter the student's name");
						studentName = userInput.next();
						temp = sort.fetch("Bill");
						System.out.print(temp.output());
						break;
				
					case 3:
						break;
				
					case 4:
						break;
				
					case 5:
						break;
				
					case 6:
						break;
					default:
						System.out.println("You did not enter an appropriate option. Please try again!");
				
				}
			}while (option != 6);
		}
		else
		{
			System.out.println("You did not enter an acceptable date set length!");
		}
    }
}