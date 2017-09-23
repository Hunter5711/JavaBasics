	class Vehicle
	{
	int speed =80;
	}
	
	class Bike extends Vehicle{
	int speed=100;
	void display(){
	System.out.println(speed);
	}
	public static void main (String [] args){
	Bike b=new Bike();
	b.display();
	}
	}