import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
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
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException { // NOTE: handles
																// IOException
		//creates a new file																												//
		File myFile = new File("myOutputFile34.txt");

		//instantiates printwriter
		PrintWriter outputFile;
		//instantiates buffered reader
		BufferedReader inputFile;
		String inputString;
		String input;
		char option = 0;
		// new scanner object
		Scanner keyboard = new Scanner(System.in);
		int numContacts = 0;
		
		//printwritter object
		outputFile = new PrintWriter( new BufferedWriter(new FileWriter(myFile, true)));
		
		//creates contact array
		Contact[] contacts = new Contact[25];
		
		// if a the file exists
		if (myFile.exists()) { // input validation needed stops damage
			System.out.println("This is the information contained in this contact file:\n");
			String line = null;

			inputFile = new BufferedReader(new FileReader(myFile));
			
			
			// Prints out the contents of a file
			while (inputFile.ready()) {
				
				//new contact object
				
				line = inputFile.readLine();
				
				while(line!=null){
						System.out.println(line);
						line = inputFile.readLine();
					
				}
				
			
				do{
					
					if(numContacts == contacts.length ){
						
						Contact[] contactstemp = Arrays.copyOf(contacts, contacts.length + 5);
						contacts = contactstemp;
						System.out.println("array extended by 5");
					}
				
					contacts[numContacts] = new Contact();
				
					System.out.print("\nEnter the last name: ");
					input = keyboard.nextLine();
					contacts[numContacts].setLastName(input);
	
					System.out.print("Enter the first name: ");
					input = keyboard.nextLine();
					contacts[numContacts].setFirstName(input);
	
					System.out.print("Enter the middle name: ");
					input = keyboard.nextLine();
					contacts[numContacts].setMiddleName(input);
	
					System.out.print("Enter your Title (Dr, proffessor, Mr, Mrs): ");
					input = keyboard.nextLine();
					contacts[numContacts].setPrefix(input);
	
					System.out.print("Enter occupation: ");
					input = keyboard.nextLine();
					contacts[numContacts].setOccupation(input);
	
					System.out.print("Enter phone number: ");
					input = keyboard.nextLine();
					contacts[numContacts].setPhoneNumber(input);
	
					System.out.print("Enter email: ");
					input = keyboard.nextLine();
					contacts[numContacts].setEmail(input);
	
					System.out.print("Enter adress number (4 numbers): ");
					input = keyboard.nextLine();
					contacts[numContacts].setStreetNumber(input);
	
					System.out.print("Enter street name: ");
					input = keyboard.nextLine();
					contacts[numContacts].setStreetName(input);
	
					System.out.print("Enter city name: ");
					input = keyboard.nextLine();
					contacts[numContacts].setCity(input);
	
					System.out.print("Enter state name: ");
					input = keyboard.nextLine();
					contacts[numContacts].setStateAB(input);
	
					System.out.print("Enter zip code: ");
					input = keyboard.nextLine();
					contacts[numContacts].setZipCode(input);
	
					System.out.println("Would you like to add another contact? \ny (for yes)\nn (for no)");
					option = keyboard.nextLine().toLowerCase().charAt(0);
					
					numContacts++;
			} while (option == 'y');
			
			}
			//printwritter object
			outputFile = new PrintWriter( new BufferedWriter(new FileWriter(myFile, true)));

			
			//write to file
			for (int i = 0; i < numContacts; i++) {
				outputFile.println(contacts[i].getPrefix());
				outputFile.println(contacts[i].getFirstName());
				outputFile.println(contacts[i].getMiddleName());
				outputFile.println(contacts[i].getLastName());
				outputFile.println(contacts[i].getOccupation());
				outputFile.println(contacts[i].getPhoneNumber());
				outputFile.println(contacts[i].getEmail());
				outputFile.println(contacts[i].getStreetNumber());
				outputFile.println(contacts[i].getStreetName());
				outputFile.println(contacts[i].getCity());
				outputFile.println(contacts[i].getStateAB());
				outputFile.println(contacts[i].getZipCode());
				
			}
			
			//inputFile.close();
			outputFile.close(); 
			inputFile.close();

			
			
			
			
			
			
			System.exit(0);//end program
			
			}
			//if the file does not exist
		 else {
			
			// printwriter object
			outputFile = new PrintWriter(myFile);

			do {
				
				// recreates array if it gets too big
				if(numContacts == contacts.length ){
					
					Contact[] contactstemp = Arrays.copyOf(contacts, contacts.length + 5);
					contacts = contactstemp;
					System.out.println("array extended by 5");
				}
			
			
				contacts[numContacts] = new Contact();

				System.out.print("Enter the last name: ");
				input = keyboard.nextLine();
				contacts[numContacts].setLastName(input);

				System.out.print("Enter the first name: ");
				input = keyboard.nextLine();
				contacts[numContacts].setFirstName(input);

				System.out.print("Enter the middle name: ");
				input = keyboard.nextLine();
				contacts[numContacts].setMiddleName(input);

				System.out.print("Enter your Title (Dr, proffessor, Mr, Mrs): ");
				input = keyboard.nextLine();
				contacts[numContacts].setPrefix(input);

				System.out.print("Enter occupation: ");
				input = keyboard.nextLine();
				contacts[numContacts].setOccupation(input);

				System.out.print("Enter phone number: ");
				input = keyboard.nextLine();
				contacts[numContacts].setPhoneNumber(input);

				System.out.print("Enter email: ");
				input = keyboard.nextLine();
				contacts[numContacts].setEmail(input);

				System.out.print("Enter adress number (4 numbers): ");
				input = keyboard.nextLine();
				contacts[numContacts].setStreetNumber(input);

				System.out.print("Enter street name: ");
				input = keyboard.nextLine();
				contacts[numContacts].setStreetName(input);

				System.out.print("Enter city name: ");
				input = keyboard.nextLine();
				contacts[numContacts].setCity(input);

				System.out.print("Enter state name: ");
				input = keyboard.nextLine();
				contacts[numContacts].setStateAB(input);

				System.out.print("Enter zip code: ");
				input = keyboard.nextLine();
				contacts[numContacts].setZipCode(input);

				System.out.println("Would you like to add another contact? \ny (for yes)\nn (for no)");
				option = keyboard.nextLine().charAt(0);

				numContacts++;
			} while (option == 'y');
			
			//writes to file
			for (int i = 0; i < numContacts; i++) {
				outputFile.println(contacts[i].getPrefix());
				outputFile.println(contacts[i].getFirstName());
				outputFile.println(contacts[i].getMiddleName());
				outputFile.println(contacts[i].getLastName());
				outputFile.println(contacts[i].getOccupation());
				outputFile.println(contacts[i].getPhoneNumber());
				outputFile.println(contacts[i].getEmail());
				outputFile.println(contacts[i].getStreetNumber());
				outputFile.println(contacts[i].getStreetName());
				outputFile.println(contacts[i].getCity());
				outputFile.println(contacts[i].getStateAB());
				outputFile.println(contacts[i].getZipCode());
			}
			
		

			outputFile.close();
			
		}
			System.exit(0);// end program
		
	}
	

	public static class Contact {
		Contact() {
		}

		/**
		 * sets user last name
		 * 
		 * @param n
		 */
		public void setLastName(String n) {

			// I allow the character ' because the might be in one's last name
			// (example O'Riley)
			Scanner key = new Scanner(System.in);
			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					lName = n;
				}
			} else {
				lName = n;
			}
		}

		/**
		 * get user last name
		 * 
		 * @return 1Name
		 */
		public String getLastName() {
			return lName;
		}

		/**
		 * set user first name
		 * 
		 * @param n
		 */
		public void setFirstName(String n) {
			Scanner key = new Scanner(System.in);

			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					fName = n;
				}
			} else {
				fName = n;
			}
		}

		/**
		 * get user first name
		 * 
		 * @return fName
		 */
		public String getFirstName() {
			return fName;
		}

		/**
		 * set user middle name
		 * 
		 * @param n
		 */
		public void setMiddleName(String n) {
			Scanner key = new Scanner(System.in);
			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					mName = n;
				}
			} else {
				mName = n;
			}
		}

		/**
		 * get user middle name
		 * 
		 * @return mName
		 */
		public String getMiddleName() {
			return mName;
		}

		/**
		 * set user prefix
		 * 
		 * @param n
		 */
		public void setPrefix(String n) {
			Scanner key = new Scanner(System.in);

			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					prefix = n;
				}
			} else {
				prefix = n;
			}
		}

		/**
		 * get user prefix
		 * 
		 * @return prefix
		 */
		public String getPrefix() {
			return prefix;
		}

		/**
		 * set user occupation
		 * 
		 * @param n
		 */
		public void setOccupation(String n) {
			Scanner key = new Scanner(System.in);

			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					occupation = n;
				}
			} else {
				occupation = n;
			}
		}

		/**
		 * get user occupation
		 * 
		 * @return occupation
		 */
		public String getOccupation() {
			return occupation;
		}

		/**
		 * set user city
		 * 
		 * @param n
		 */
		public void setCity(String n) {
			Scanner key = new Scanner(System.in);

			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					city = n;
				}
			} else {
				city = n;
			}

		}

		/**
		 * get user city
		 * 
		 * @return city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * set user street name
		 * 
		 * @param n
		 */
		public void setStreetName(String n) {
			Scanner key = new Scanner(System.in);
			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					street1 = n;
				}
			} else {
				street1 = n;
			}
		}

		/**
		 * get user street name
		 * 
		 * @return street1
		 */
		public String getStreetName() {
			return street1;
		}

		/**
		 * set user state name
		 * 
		 * @param n
		 */
		public void setStateAB(String n) {
			Scanner key = new Scanner(System.in);
			nameIsValid(n);

			if (nameIsValid(n)) {
				while ((nameIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					state = n;
				}
			} else {
				state = n;
			}
		}

		/**
		 * get user state name
		 * 
		 * @return state
		 */
		public String getStateAB() {
			return state;
		}

		/**
		 * set user street number
		 * 
		 * @param n
		 */
		public void setStreetNumber(String n) {
			Scanner key = new Scanner(System.in);

			if (!n.matches("^[0-9]{0,4}")) {
				while (!n.matches("^[0-9]{0,4}") == true) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					street2 = n;
				}
			} else {
				street2 = n;
			}
		}

		/**
		 * get user street number
		 * 
		 * @return street2
		 */
		public String getStreetNumber() {
			return street2;
		}

		/**
		 * set user phone number
		 * 
		 * @param n
		 */
		public void setPhoneNumber(String n) {
			Scanner key = new Scanner(System.in);
			phoneIsValid(n);

			if (phoneIsValid(n)) {
				while (phoneIsValid(n) == true) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					phone = n;
				}
			} else {
				phone = n;
			}
		}

		/**
		 * get user phone number
		 * 
		 * @return phone
		 */
		public String getPhoneNumber() {
			return phone;
		}

		/**
		 * set user zip code
		 * 
		 * @param n
		 */
		public void setZipCode(String n) {
			Scanner key = new Scanner(System.in);

			if (!n.matches("^[0-9]{0,5}")) {
				while (!n.matches("^[0-9]{0,5}") == true) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					zip = n;
				}
			} else {
				zip = n;
			}
		}

		/**
		 * get user zip code
		 * 
		 * @return zip
		 */
		public String getZipCode() {
			return zip;
		}

		/**
		 * set user email
		 * 
		 * @param n
		 */
		public void setEmail(String n) {
			Scanner key = new Scanner(System.in);
			emailIsValid(n);

			if (emailIsValid(n)) {
				while ((emailIsValid(n) == true)) {
					System.out.println("Invalid characters");
					System.out.println("Correctly:");
					n = key.nextLine();
					email = n;
				}
			} else {
				email = n;
			}
		}

		/**
		 * get user email
		 * 
		 * @return email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * Input validation for alphabetic strings
		 * 
		 * @param n
		 * @return true/false
		 */
		public static boolean nameIsValid(String n) {
			if (!n.matches("^[a-zA-z]+$")) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Input validation for phone number
		 * 
		 * @param n
		 * @return true/false
		 */
		public static boolean phoneIsValid(String n) {
			if (!n.matches("^[0-9]{0,13}")) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Input validation for email
		 * 
		 * @param n
		 * @return true/false
		 */
		public static boolean emailIsValid(String n) {
			if (!n.matches("^[0-9a-zA-Z @ .]+$")) {
				return true;
			} else {
				return false;
			}
		}

		/*
		 * Name (first, last, middle) Prefix Phone number email address (street,
		 * city, state, zip) occupation
		 */
		private String lName, fName, mName;
		private String prefix;
		private String phone;
		private String email;
		private String street1, street2, city, state, zip;
		private String occupation;

	}

}

/*
 * Your task is to complete a program that is capable of writing data from
 * Contact class objects to a file on disk, and then reading them back when the
 * program starts. To do this, you'll have to do the following:
 * 
 * 
 * Use your own Contact class from previous homework Choose a filename, and
 * check to see if the file exists. If the file exists, read the contents and
 * then display them to the user. If the file does not exist, simply begin a
 * loop to get new contact information from the user. In your loop to get new
 * contact information, you should use an array to store each Contact object
 * that the user creates, until the user says they are done. When the user says
 * they are done entering contacts, write them to disk at the file name you
 * chose and then exit the program.
 */