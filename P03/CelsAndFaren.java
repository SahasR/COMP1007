import java.util.*;

public class CelsAndFaren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	char typeTemp= ' ';
	double fahrenheit, celcius;
	boolean validation = false;
	
	while (validation == false) {   //VALIDATION
		
		System.out.print("What Temperature Scale are you converting from?: ");
		typeTemp = sc.next().charAt(0);
		if ((typeTemp == 'c') || (typeTemp == 'C') || (typeTemp == 'f') || (typeTemp == 'F')) {
		
			validation = true;
		}
		else 
		{
			System.out.println("Please enter either 'c' or 'C' for Celcius or 'f' or 'F' for Fahrenheit");
		}

	}

	if ((typeTemp == 'c') || (typeTemp == 'C')){
 	
		System.out.print("Please enter the Celcius Value: ");
        	celcius = sc.nextInt();
        
        	fahrenheit = (celcius* (9.0/5.0)) + 32.0;
        
       		System.out.println("The value of " + celcius + " in Fahrenheit is " + (int) fahrenheit);
	}
	else {
	
		System.out.print("Please enter the Fahrenheit Value: ");
		fahrenheit = sc.nextInt();
	
		celcius = (fahrenheit - 32.0) * (5.0/9.0);
	       	
		System.out.println("The value of " + fahrenheit + " in Celcius is " + celcius);

	}
        sc.close();
    }


}
