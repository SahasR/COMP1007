import java.util.*;

public class CelsToFaren {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celcius;
        double fahrenheit;
    
        System.out.print("Please enter the Celcius Value: ");
        celcius = sc.nextInt();
        
        fahrenheit = ( (double) celcius*9/5) + 32;
        
        System.out.println("The value of " + celcius + " in Fahrenheit is " + (int) fahrenheit);
        sc.close();
    }


}
