import java.util.*;

public class CharConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char chr, chrLowerCase;
		int ascii, asciiLowerCase;

		System.out.print("Please enter an uppercase letter: ");
		chr = sc.next().charAt(0);

		ascii = (int) chr;
		asciiLowerCase = ascii + 32;
		chrLowerCase = (char) asciiLowerCase;

		System.out.println("The ASCII value of " + ascii + " is: " + ascii);
		System.out.println("The lowercase value of " + ascii + " is: " + chrLowerCase);
	}
}
