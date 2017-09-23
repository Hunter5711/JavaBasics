	public class Student1 extends Person1 
	{
		private int rollNo;
		private int age;
		private static int student1Count ;
		
		public Student1(String name)
		{
			super(name);
			System.out.println("Assigning value to Name Property");
			Student1.student1Count++;
		}
		public Student1(String name , int rollNo)
		{
			this(name);
			System.out.println("Assigning value to rollNo Property");
			this.rollNo=rollNo;
		}
		public int getRollNo(){
			return rollNo;
		}
		public void setRollNo(int rollNo){
			this.rollNo=rollNo;
		}	
			
		public static void main (String [] args){
			Student1 st1 = new Student1("Shailender ", 1);
			Student1 st2 =new Student1 ("Kumar" , 2);
			
			Student1 st3= new Student1("Raj");
			System.out.println("Student1getCreated.Student1Count()");
			
		}
		
		public static int getCreatedStudent1Count(){
			return Student1.student1Count;
		}
			
}