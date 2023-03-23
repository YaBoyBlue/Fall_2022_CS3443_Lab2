/**
 * Lab2 is a Java class containing a main method to run your program when completed.
 * This class will not compile until you have completed the requirements outlined in 
 * the lab description.
 * 
 * @author Amanda Fernandez (abc123)
 * UTSA CS 3443 - Lab 2
 * Fall 2022
 */
public class Lab2 {
	
	public static void main( String[] args ) {

		// Reminder: include a try/catch statement around your code in loadContacts
		
		AddressBook familyBook = new AddressBook( "Family" );
		familyBook.loadContacts( "data/family.csv" );
		System.out.println( familyBook );
		
		AddressBook workBook = new AddressBook( "Work Contacts" );
		workBook.loadContacts( "data/work.csv" );
		System.out.println( workBook );
		
	}

}