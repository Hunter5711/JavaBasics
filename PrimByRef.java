
/**  @kumar */
// How to pass Primitive Data Types in Java Using Reference .
public class PrimByRef{

public static void increment(int[] array, int amount)
{
   array[0] = array[0] + amount;
}

public static void main(String args[])
{
   int[] myInt = { 1 };

   increment (myInt, 5);

   System.out.println ("Array contents : " + myInt[0]);
}
}
