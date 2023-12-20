/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
//import java.util.Scanner;
/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
                //Scanner keyboard = new Scanner(System.in);
              
		    
		int x = Integer.parseInt(args[0]);
        int quarter = 25;
		 int  cent=1;
		
        int y = x / quarter;
        int z = x % quarter;

        System.out.println("Use " + y + " quarters and " + z + " cents");
	}
}
