

public class OverloadTest{
	
	public int add(int x, int y ){
		return (x+y);
	}
	
	public int add(int x, int y, int z ){
		return (x+y+z);
	}
	
	public double add(double x, double y, double z ){
		return (x+y+z);
	}
	
	
	public static void main(String[] args){
		
		OverloadTest test= new OverloadTest();
		
		System.out.println("sum of 2 and 3 is "+test.add(2, 3));
		System.out.println(test.add(4, 5, 9));
		System.out.println(test.add(4.5, 5.3, 9.1));
	}


}