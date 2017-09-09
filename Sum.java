	public class Sum {
	public static void main(String [] args)
	
	{
		int num=0, rem =0, rev=0;
		char ch;
		try{
		ch=(char) System.in.read();
		num = Character.getNumericValue(ch);
		}
		catch (Exception e)
		{
		
		System.out.println(e);
		}
		System.out.println("number =" +num);
		while(num>0)
		{
		 
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
		}
		System.out.println("reverse of number =" +rev);
		
	
	
	
	}
	}