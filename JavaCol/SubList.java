import java.util.*;
public class SubList
{
    public static void main(String args [])
    {
        //List<String>s = new ArrayList();  //Unsafe operation 

        List<String> s = new ArrayList<String>();  //  Okay
        s.add("Life");
        s.add("is");
        s.add("Series");
        s.add("of");
        s.add("Moments");
        System.out.println("The List is :");
        System.out.println(s);
       List<String> subL = new ArrayList<String>();
        subL = s.subList(2,5);
        System.out.println("The sublist From List is:");
        System.out.println(subL);

            

    }
}