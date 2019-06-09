import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     try
     {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       System.out.println(n);
     }
     catch(InputMismatchException ie)
     {
       System.out.println("Input Mismatch Exception occurred");
     }
   }
}