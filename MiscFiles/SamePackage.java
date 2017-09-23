package p1;

public class SamePackage 
{
	SamePackage(){
		Protection p= new Protection();
		System.out.println("same package constructor");
		System.out.println("n=" +p.n);
		// class only
		// System.out.println("npri =" +p.npri);
		System.out.println("npro=" +p.npro);
		System.out.println("npub=" +p.npub);
		System.out.println("Nothing");
	}

}