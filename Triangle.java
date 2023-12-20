/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
//import java.util.Scanner;
/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Put your code here	
                //Scanner keyboard = new Scanner(System.in);
              
                    
     
                 

             

           /*  if (a+b>c && b+c>a && c+a>b){
                
                     System.out.print( c+"; true");
            }
            else{System.out.println(c+"; false");}*/
		  int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
		
        boolean result = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println(a + ", " + b + ", " + c + ": " + result);
	}
}

