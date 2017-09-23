import java.io.FileReader;
import java.io.IOException;

class Reader
{

public static void main(String args[])
{

	FileReader f = new FileReader("/home/shailender/ItsMe/life.txt");
	
	char [] a = new char[100];
	f.read(a);
	for (char c: a)
         
	System.out.println(a);
	throw new IOException();
}
}

