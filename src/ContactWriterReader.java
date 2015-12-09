import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;
/**
 * 
 */

/**
 * @author Ryley
 *
 */
public class ContactWriterReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {  // NOTE: handles IOException from PrintWriter!
		 File myFile = new File( "myOutputFile.txt" );
	     PrintWriter outputFile;
	     BufferedReader inputFile;
	     String inputString;
	     char option;
		 Scanner keybd = new Scanner(System.in);
		 
		 
		  while( myFile.exists() ) { // input validation needed stops damage
			 	
			 	inputFile =  new BufferedReader(new FileReader( myFile ));
			 	System.out.println("This is the information contained in this contact file:\n");
			 	String line = null;
			 	
			 	
			 	
	            System.out.print( myFile.getName() + " \n\nSince this file exists, would you like to make a new one. "
	            								+ "\nInput new file name: " );
	            
	            inputString = keybd.nextLine();
	            myFile = new File( inputString );
	        }
	        
		  outputFile = new PrintWriter( myFile );
		 
		 int numContacts = 25;
	     ContactTest[] contacts = new ContactTest[numContacts];
	     
	     for(int i = 1; i<numContacts; i++){
	    	 
	    	 System.out.println("Would you like to add another contact? \ny (for yes)\nn (for no)");
	    	 option = keybd.nextLine().charAt(0);
	    	 
	    	 if(option == 'n'){
	    		 
	    		outputFile.close();
	    	
	    	 } else if( option == 'y'){
	    		 
	    		 
	    		 contacts[i] = new ContactTest();
	    		 
	    		 ContactTest.Contact testContact = new ContactTest.Contact();
	    		 Scanner keyboard = new Scanner(System.in);
	    	        String input = null;
	    	        
	    	        System.out.print( "Enter the last name: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setLastName( input );
	    	        
	    	        System.out.print( "Enter the first name: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setFirstName(input);
	    	        
	    	        System.out.print( "Enter the middle name: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setMiddleName(input);
	    	        
	    	        System.out.print( "Enter your Title (Dr, proffessor, Mr, Mrs): " );
	    	        input = keyboard.nextLine();
	    	        testContact.setPrefix(input);
	    	        
	    	        System.out.print( "Enter occupation: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setOccupation(input);
	    	        
	    	        System.out.print( "Enter phone number: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setPhoneNumber(input);
	    	        
	    	        System.out.print( "Enter email: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setEmail(input);
	    	        
	    	        System.out.print( "Enter adress number (4 numbers): " );
	    	        input = keyboard.nextLine();
	    	        testContact.setStreetNumber(input);
	    	        
	    	        System.out.print( "Enter street name: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setStreetName(input);
	    	        
	    	        System.out.print( "Enter city name: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setCity(input);
	    	        
	    	        System.out.print( "Enter state name: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setStateAB(input);
	    	        
	    	        System.out.print( "Enter zip code: " );
	    	        input = keyboard.nextLine();
	    	        testContact.setZipCode(input);
	    	        
	    	        
	    	        
	    	        outputFile.println(testContact.getPrefix());
	    	        outputFile.println(testContact.getFirstName()); 
	    	        outputFile.println(testContact.getMiddleName());
	    	        outputFile.println(testContact.getLastName());
	    	        outputFile.println(testContact.getOccupation());
	    	        outputFile.println(testContact.getPhoneNumber());
	    	        outputFile.println(testContact.getEmail());
	    	        outputFile.println(testContact.getStreetNumber());
	    	        outputFile.println(testContact.getStreetName());
	    	        outputFile.println(testContact.getCity());
	    	        outputFile.println(testContact.getStateAB());
	    	        outputFile.println(testContact.getZipCode());
	    	        outputFile.println("                    ");
	    	        				
	    		 
	    	 } else {
	    		 
	    		 outputFile.close();
	    	 }
	     }
	     

	}

}





/*Your task is to complete a program that is capable of writing data from Contact class 
 * objects to a file on disk, and then reading them back when the program starts. 
 * To do this, you'll have to do the following:
 

Use your own Contact class from previous homework
Choose a filename, and check to see if the file exists.
If the file exists, read the contents and then display them to the user.
If the file does not exist, simply begin a loop to get new contact information from the user.
In your loop to get new contact information, you should use an array to store each
Contact object that the user creates, until the user says they are done.
When the user says they are done entering contacts, write them to disk at the file name you chose and then exit the program.
*/