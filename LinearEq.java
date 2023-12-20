/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
//import java.util.Scanner;
/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */

public class LinearEq {
	// Put your code here
    public static void main(String[] args) {
		// Put your code here
              //  Scanner keyboard = new Scanner(System.in);
            
                 double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
	    
 if (a==0){System.out.println("error ");}
else{
              


	
        double result = (c - b) / a;
        System.out.println(a + " * x + " + b + " = " + c);
        System.out.println("x = " + result);
}
    }
}
