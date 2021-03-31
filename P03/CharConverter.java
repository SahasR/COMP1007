import java.util.*;

public class CharConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Initializing Scanner and Variables
		char chr, chrLowerCase, method, chrUpperCase; 
		int ascii, asciiLowerCase, asciiUpperCase = 0;
		boolean validation = false;

		chr = ' ';
		chrLowerCase = ' ';
		chrUpperCase = ' ';
		
		System.out.print("Would you like lowercase to uppercase? (A) or vice versa (B): "); //Ask the method
		method = sc.next().charAt(0);

		while (!validation)  //Validation
		{                          
			System.out.print("Please enter a character: "); //InputCharacter
			chr = sc.next().charAt(0);
			if (method == 'A') {
				if ( (int) chr < 123 &&  (int) chr > 96) {
					validation = true;
				}
			}
			else if (method == 'B') {
				if ( (int) chr < 91 &&  (int) chr > 40) {
					validation = true;
				}
			}
			if (validation == false) {
				System.out.println("There is a mismatch in the values you entered");
			}
		}
		

		switch(method) 
		{
			case 'A':
				

				ascii = (int) chr;    //Casting as Integer
				asciiUpperCase = ascii - 32; //Getting Upper case int value
				chrUpperCase = (char) asciiUpperCase; //Casting lower case as char

				System.out.println("The ASCII value of " + ascii + " is: " + ascii); //Output ASCII Value
				System.out.println("The lowercase value of " + ascii + " is: " + chrUpperCase); //Out Lowercase Value
				break;
			
			case 'B':
				

				ascii = (int) chr;    //Casting as Integer
				asciiLowerCase = ascii + 32; //Getting lower case int value
				chrLowerCase = (char) asciiLowerCase; //Casting lower case as char

				System.out.println("The ASCII value of " + ascii + " is: " + ascii); //Output ASCII Value
				System.out.println("The lowercase value of " + ascii + " is: " + chrLowerCase); //Out Lowercase Value
				break;
		}
	}
}
