import java.io.*;
import java.util.Scanner;

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
	public static void main(String[] args) throws IOException { // NOTE: handles IOException from PrintWriter!
		 File myFile = new File( "myOutputFile.txt" );
	     //PrintWriter outputFile;
	     BufferedReader inputFile;
		 Scanner keybd = new Scanner(System.in);
		 
		 while( !myFile.exists()){
	    	  
	         System.out.print( myFile.getName() + " File Does not exists. new Name: " );
	         inputString = keybd.nextLine();
	         myFile = new File( inputString );
	     }
	      
	     inputFile = new BufferedReader(new FileReader( myFile ));
	     
	     ContactTest [] contacts;
	     

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