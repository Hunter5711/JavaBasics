
import java.util.*;
public class ListDemo

{
    public static void main(String args[])
    {
        List l = new ArrayList();
        l.add(2);  // l.add(0,2) l.add(1,3)  index initialized auto.
        l.add(3);
        l.add(11);
        l.add(10);
        l.add(21);

        System.out.println(l);
    System.out.println("Remove element at index 2");   // 11 removed
    l.remove(2);
    System.out.println(l);
    System.out.println  ( "Element at index 3 is :"+   l.get(3));
    System.out.println("replace element at index 3 by 25"+ l.set(3,25));
    System.out.println(l);
    // Searching 
    
    System.out.println("Search element at index 2 is "+  l.indexOf(2));
   
    //System.out.println("Last element of List is "+ l.lastIndexOd(l));


        
    }
    

}