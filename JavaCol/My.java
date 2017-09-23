//import java.io.*;
import java.util.*;

 class CforEach
{

    public static void main(String args[])
    {
        List<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        
        List<Integer> l1 = new  LinkedList<Integer>();
        l1.add(4);
        l1.add(4);
        l1.add(4);
        l1.add(5);
        for(int i :l)
        {
            for(int j:l1)
            {
                if(i<j)
                
                    System.out.println("Elements :"+i);
                
            }
        }


    }
}