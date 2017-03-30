/*
 * Brandon Plant
 * Assignment 5
 * IT 2660 Data Structures & Algorithms
 * CRN 13907
 * Due March 30th, 2017
 * Spring 2017
 * Chapter 5 exercise 40
 */

public class hash {
	// Array with prime number for the array size for calculating the index
	String[] primetickettable = new String[98009];
	int arrayItems = 0;
	// Array with prime number for the array size for calculating the index
	String[] primebuyertable = new String[98009];


public void hashInsert(String addTickets, String addBuyer){
	
		String newTicket = addTickets;
		int ticketIndex = Integer.parseInt(newTicket) % 98009;
		primetickettable[ticketIndex] = newTicket;
		primebuyertable[ticketIndex] = addBuyer;
	}
	public void hashFetch(String key) {
		int hashIndex = Integer.parseInt(key) % 98009;
		if (primetickettable[hashIndex] == null){
			System.out.println("Ticket not found!");			
		}else {
			System.out.println("Name: " + primebuyertable[hashIndex]);
			System.out.println("Ticket Number: " + primetickettable[hashIndex]);
		}		 
	}
	
	public void hashDelete(String key) {
		int hashIndex = Integer.parseInt(key) % 98009;
		if (primetickettable[hashIndex] == null){
			System.out.println("Ticket not found!");			
		}else {
			System.out.println("Name: " + primebuyertable[hashIndex] + " has been cancelled.");
			System.out.println("Ticket Number: " + primetickettable[hashIndex] + " has been cancelled.");
			primetickettable[hashIndex] = null;
			primebuyertable[hashIndex] = null;
		}		
	}
	public void hashUpdate(String buyerName, String ticketNumber) {
		int hashIndex = Integer.parseInt(ticketNumber) % 98009;
		if (primetickettable[hashIndex] == null){
			System.out.println("Ticket not found!");			
		}else {
			System.out.println("Name: " + primebuyertable[hashIndex] + " has been changed to " + buyerName);
			System.out.println("Ticket Number: " + primetickettable[hashIndex]);
			primetickettable[hashIndex] = ticketNumber;
			primebuyertable[hashIndex] = buyerName;
		}
	}
	public void showAll() {
		for (int i = 0; i < primetickettable.length; i++) {
			if(primetickettable[i] != null){
			System.out.println("Name: " +primebuyertable[i]);
			System.out.println("Ticket: " +primetickettable[i] + "/n");
			}
		}
	}
	
	
}