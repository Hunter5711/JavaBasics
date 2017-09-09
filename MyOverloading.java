public class MyOverloading {
	
	public int sub( int x , int y)
	{
	return (x-y);
	}
	public int sub (int x ,int y , int z){
		
		return (x-y-z);
		
	}
	public float sub( float x , float y) {
		
		return (x-y);
		
	}
	public double sub(double x, double y, double z ){
		return (x+y+z);
	}
	public static void main (String [] args ) {
		MyOverloading m = new MyOverloading();
		System.out.println(m.sub(5,2));
		System.out.println(m.sub(9,8,7));
		System.out.println(m.sub(30.0,9.0,8.0));
		System.out.println(m.sub( 150.0,40.0,70.0));
		
	}
}