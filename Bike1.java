class Vehicle{
	int speed =80;
	
	Vehicle(int speed){
		this.speed=speed;
	}
	
	Vehicle(){
		
	}
}

 class Bike1 extends Vehicle
 {	
	int speed=100;
	void display(){
		System.out.println(speed);
		System.out.println(super.speed);
	}
 
	public Bike1 ()
	{
		
	//super (speed);
	}
 
	public static void main (String [] args){
		Bike1 b= new Bike1();
		b.display();
	}
}