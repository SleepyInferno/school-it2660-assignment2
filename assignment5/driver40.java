/*
 * Brandon Plant
 * Assignment 5
 * IT 2660 Data Structures & Algorithms
 * CRN 13907
 * Due March 30th, 2017
 * Spring 2017
 * Chapter 5 exercise 40
 */
import java.util.Scanner;

public class driver40 {
	public static void main(String[] args) {
		assignmentInfo();
		test();
	}
	
	public static void test() {
		int switchCase = 0;
		String userTicketNumber;
		String buyerName;
		int ticketNumber;
		hash hash = new hash();
		do{
		menu();
		Scanner userInput = new Scanner(System.in);
		switchCase = userInput.nextInt();
		switch (switchCase) {
		case 1:
			System.out.println("Enter the ticket number:" + userInput.nextLine());
			userTicketNumber = userInput.nextLine();
			ticketNumber = Integer.parseInt(userTicketNumber);
			if (ticketNumber >= 2000 && ticketNumber <= 100000)
			{
				System.out.println("Enter purchaser's name: ");
				buyerName = userInput.nextLine();
			 	hash.hashInsert(userTicketNumber, buyerName);
			}else {
				System.out.println("Invalid ticket number.\n");
				break;
			}
			break;
		case 2:
			System.out.println("Enter the ticket number:" + userInput.nextLine());
			userTicketNumber = userInput.nextLine();
			ticketNumber = Integer.parseInt(userTicketNumber);
			if (ticketNumber >= 2000 && ticketNumber <= 100000)
			{
				hash.hashFetch(userTicketNumber);
			}else {
				System.out.println("Invalid ticket number.\n");
			}

			break;
		case 3:
			System.out.println("Enter the ticket number you wish to cancel: " + userInput.nextLine());
			userTicketNumber = userInput.nextLine();
			ticketNumber = Integer.parseInt(userTicketNumber);
			if (ticketNumber >= 2000 && ticketNumber <= 100000)
			{
				hash.hashDelete(userTicketNumber);
			}else {
				System.out.println("Invalid ticket number.\n");
			}
			break;
		case 4:
			System.out.println("Enter the ticket number you wish to update: " + userInput.nextLine());
			userTicketNumber = userInput.nextLine();
			ticketNumber = Integer.parseInt(userTicketNumber);
			if (ticketNumber >= 2000 && ticketNumber <= 100000)
			{
				System.out.println("Original: ");
				hash.hashFetch(userTicketNumber);
			}else {
				System.out.println("Invalid ticket number.\n");
			}
			System.out.println("Enter new purchaser's name: ");
			buyerName = userInput.nextLine();
			hash.hashUpdate(buyerName, userTicketNumber);
			break;
		case 5:
			hash.showAll();
			break;
	}
	}while (switchCase !=6);
	}
	
	public static void menu () {
		System.out.println("-----------------------------------");
		System.out.println("Choose from the following options: ");
		System.out.println("1 : Enter new ticket sale");
		System.out.println("2 : Fetch a ticket");
		System.out.println("3 : Cancel a ticket purchase");
		System.out.println("4 : Update ticket information");
		System.out.println("5 : Output all tickets");
		System.out.println("6 : Exit Program");
	}
	
	public static void assignmentInfo() {
		System.out.println("Brandon Plant" + "\nAssignment 5" + "\nIT 2660 Data Structures & Algorithms"
    			+ "\nCRN 13907" + "\nDue March. 30th, 2017" + "\nSpring 2017" + "\nChapter 5 exercise 40"
    			+ "\n-----------------------------------");
	}
}