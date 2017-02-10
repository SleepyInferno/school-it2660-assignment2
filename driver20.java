
import java.util.Scanner;

/*
 * Brandon Plant
 * Assignment 2
 * IT 2660 Data Structures & Algorithms
 * CRN 13907
 * Due Feb. 9th, 2017
 * Spring 2017
 * Chapter 2 exercise 20
 */

public class driver20 {
	

	 public static void main(String[] args) {
		 System.out.println("Brandon Plant" + "\nAssignment 2" + "\nIT 2660 Data Structures & Algorithms"
	    			+ "\nCRN 13907" + "\nDue Feb. 9th, 2017" + "\nSpring 2017" + "\nChapter 2 exercise 20"
	    			+ "\n-----------------------------------");
		 Scanner userInput = new Scanner(System.in);
/*		  int dataLength = 0;
	        int i = 1;
	        String name = "";
	        int ID = 0;
	        double GPA = 0.0;
	    	Scanner userInput = new Scanner(System.in);
	    	StudentListings student = new StudentListings();
	    	System.out.println("How big is the data set?: ");
	    	dataLength = userInput.nextInt();		
	    	do
	    	{
	    		System.out.println("What is the name of the student: ");
	    		name = userInput.next();
	    		System.out.println("What is the student's ID: ");
	    		ID = userInput.nextInt();
	    		System.out.println("What is student's GPA: ");
	    		GPA = userInput.nextDouble();
	    		student.inputStudentListings(name, ID, GPA);
	    		System.out.println(student.output());
	    		i++;
	    	} while (i < dataLength);
*/	    
		 System.out.println("How big is the data set?: ");
		 int dataLength = userInput.nextInt();
		 SortedArray sort = new SortedArray (dataLength);
		 StudentListings[] student = new StudentListings[3];
	     StudentListings brandon = new StudentListings("Brandon", 1, 3.2);
	     StudentListings crystal = new StudentListings("Crystal", 2, 3.8);
	     StudentListings jim = new StudentListings("Jim", 3, 4.0);
	     student[0] = brandon;
	     student[1] = crystal;
	     student[2] = jim;
	     System.out.println(sort.insert(jim));
	     
/*	     StudentListings brandonclone = brandon.deepCopy();
	     brandon.compareTo("Brandon");
	     while (i <= 2)
	     {
	    	 System.out.print(student[i].output());
	    	 i++;
	     }
	     if (brandon.compareTo("Brandon") == 0)
	    	 System.out.print("true");
	     else
	    	 System.out.print("False");
*/		 
		 
	 }
		 
	
}