/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
           
		int c = a + (int)(Math.random() * (b - a));
            int k = a + (int)(Math.random() * (b - a));
            int f = a + (int)(Math.random() * (b - a));
              
			int min = Math.min(c, Math.min(k, f));
       
			System.out.println(c);
        System.out.println(k);
        System.out.println(f);

                System.out.println("The minimal generated number was " + min);
		
    }
}

