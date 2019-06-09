import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> l = new  LinkedHashSet<String>();
      String mon = b.readLine();
      String[] arr = mon.split(",");
      for(int i = 0;i<arr.length;i++)
      {
        l.add(arr[i]);
      }
      System.out.println(l);
      System.out.print("Enter the value to be deleted: ");
      String q = b.readLine();
      System.out.println(q);
      l.remove(q);
      System.out.println(l);
      System.out.print("Enter the value to be added: ");
      String n = b.readLine();
      System.out.println(n);
      l.add(n);
      System.out.println(l);
   
    }
}