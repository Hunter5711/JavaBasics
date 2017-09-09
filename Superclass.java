	public class Superclass  
	{
	public void printMethod()
	{
	System.out.println("Can not be printed here");
	}

	}
	public class Subclass extends Superclass {
	public void printMethod ()
	{
	super.printMethod();
	System.out.println("Printed in Subclass");
	}
	public class Test {
	public static void main (String [] args) {

	Subclass s= new Subclass();
	s.printMethod();
	s.printMethod();
	}


	}