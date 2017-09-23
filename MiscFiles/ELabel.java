public class ELabel
{
	public static void main(String args[])
	{
	
	int test =1000;
	loop1 :for (int i=0;i<10 ;i++)
	
loop2: for (int j=0;i<10 ;i++)
	
	loop3: for (int k=0;i<10 ;i++)
	{
		--test;
		if((i%10)==0)
		continue loop3;
	}
	
	
	System.out.println(test);
	}
}

