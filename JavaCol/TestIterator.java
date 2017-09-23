import java.io.*;
import java.util.*;
 
class TestIterator
{
    public static void main (String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
 
        // Iterator to traverse the list
        Iterator iterator = list.iterator();
 
        System.out.println("List elements : ");
 
        while (iterator.hasNext())
            System.out.print(iterator.next()+ " ");
 
        System.out.println();

        //Queue<int> q = new Queue<int>();
        //ListIterator’ in Java is an Iterator which allows users to traverse Collection in both direction

       /* ArrayList<integer>list1 = new ArrayList();  //Not Working <> , <integer>
        list1.add(11);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);*/
        ArrayList<String> list1 = new ArrayList<String>();
 
        list1.add("N");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        ListIterator litr = list1.listIterator();  
         //litr = ListIterator object(reference variablr)
         // Traversing the list in forward direction
        System.out.println("Displaying list elements in forward direction : ");
 
        while (litr.hasNext())
            System.out.print(litr.next()+ " ");
 
        System.out.println();
 
        // Traversing the list in backward direction
        System.out.println("Displaying list elements in backward direction : ");
        System.out.println("lets remove one element");
         litr.remove();
 
        while(litr.hasPrevious())
            System.out.print(litr.previous()+ " ");
 
        System.out.println();
            
        
        
       
       

    }
}