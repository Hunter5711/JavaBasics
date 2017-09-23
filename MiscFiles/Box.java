	class Box
	{
	 double width ;
	 double height;
	 double depth;
	 Box(Box ob)
	 {
	 width=ob.width;
	 height=ob.height;
	 depth=ob.depth;
	 }
	 Box (double w,double h, double d)
	 {
	 width=w;
	 height=h;
	 depth=d;
	 }
	 Box()
	 {
	 width=1;
	 height=2;
	 depth=3;
	 }
	 Box(double len){
		 width=height=depth=len;
	 }
	 double volume(){
	return width*height*depth;
		 
	 }
	}
	class BoxWeight  extends Box{
		double weight;
		
	 
	BoxWeight(double w,double h, double d, double m)
	{
		width=w;
	 height=h;
	 depth=d;
	 weight=m;
		
	}
	}
	class DemoBoxWeight{	
	public static void main ( String [] args ) {
		BoxWeight mybox1 = new BoxWeight(10,20,15,30.5);
		BoxWeight mybox2=  new BoxWeight(1,2,3,4.5);
		
		double vol;
		vol =mybox1.volume();
		System.out.println("Volume of mybox1 :" +vol);
		System.out.println("Weight of mybox1 :" +mybox1.weight);
		System.out.println();
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 :" +vol);
		System.out.println("weight of mybox2 :" +mybox2.weight);
		System.out.println();
		
	}
	}