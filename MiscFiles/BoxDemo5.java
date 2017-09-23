	public class Box{
		
		Box(){
		double width =10;
		double height =10;
		double depth =10;
		}
		double volume (){
		return width*height*depth;
		}
		}
		class BoxDemo5{
		public static void main(String [] args){
		Box mybox1 =new Box ();
		Box mybox2 =new Box();
		double vol;
		vol=mybox1.volume();
		System.out.println("Volume =" +vol);
		vol=mybox2.volume();
		System.out.println("vol=" +vol);
		}
		
		}