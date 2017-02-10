/*
 * Brandon Plant
 * Assignment 2
 * IT 2660 Data Structures & Algorithms
 * CRN 13907
 * Due Feb. 9th, 2017
 * Spring 2017
 * Chapter 2 exercise 19
 */

public class driver19 {
    public static void main(String[] args) {
    	System.out.println("Brandon Plant" + "\nAssignment 2" + "\nIT 2660 Data Structures & Algorithms"
    			+ "\nCRN 13907" + "\nDue Feb. 9th, 2017" + "\nSpring 2017" + "\nChapter 2 exercise 19"
    			+ "\n-----------------------------------");
      //Testing the constructor
        StudentListings brandon = new StudentListings("Brandon", 1, 3.2);
        StudentListings crystal = new StudentListings("Crystal", 2, 3.8);
        StudentListings jim = new StudentListings("Jim", 3, 4.0);
      //Output should show the three students information
        System.out.println("****Testing the output of student information****");
        System.out.print(brandon.output());
        System.out.print(crystal.output());
        System.out.print(jim.output());
      //Testing the clone
        StudentListings brandonclone = brandon.deepCopy();
      //Output should show the exact information as "brandon"
        System.out.println("****Testing cloning 'brandon' to 'brandonclone'****");
        System.out.print(brandonclone.output());
      //Testing the compare tagetKey. Should be true then false
        System.out.println("****Testing compare targetKey****");
        if (brandon.compareTo("Brandon") == 0)
	    	 System.out.println("True");
	     else
	    	 System.out.println("False");
      //Second test for the comparison
        if (brandon.compareTo("Crystal") == 0)
	    	 System.out.println("True");
	     else
	    	 System.out.println("False");
    }
}