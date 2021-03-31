import java.util.*;

public class CharConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Initializing Scanner and Variables
		char chr, chrLowerCase; 
		int ascii, asciiLowerCase;

		System.out.print("Please enter an uppercase letter: "); //Input Uppercase Character
		chr = sc.next().charAt(0); 

		ascii = (int) chr;    //Casting as Integer
		asciiLowerCase = ascii + 32; //Getting lower case int value
		chrLowerCase = (char) asciiLowerCase; //Casting lower case as char

		System.out.println("The ASCII value of " + ascii + " is: " + ascii); //Output ASCII Value
		System.out.println("The lowercase value of " + ascii + " is: " + chrLowerCase); //Out Lowercase Value
	}
}
