	import java.util.Scanner;



	public class TestMethod {
	public static void main (String [] args) {
		Strings  s;
		int  a;
		float b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String ");
		s= in.nextLine ();
		System.out.println ("You Entered a String" +s);
		System.out.println("Enter an integer");
		a=in.nextInt ();
		System.out.println("The entered integer is" +a);
		System.out.println ("Enter Float");
		b=in.nextFloat ();
		System.out.println ("The float vallue is");
		in.nextBoolean ();
		in.nextByte ();
		in.nextLong();
		
		
		

	}

	}