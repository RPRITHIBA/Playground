import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code heres to be 
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      TreeMap<String,String> m = new TreeMap<String,String>();
      String n;
      String mark;
      System.out.print("Enter the number of values to be inserted in map:");
      int j = Integer.parseInt(b.readLine());
      System.out.println(j);
      for(int i=0;i<j;i++)
      {
        n=b.readLine();
        mark = b.readLine();
        m.put(n,mark);
      }
      System.out.println(m);
      System.out.print("Enter the index to be removed:");
      String k=b.readLine();
      System.out.println(k);
      m.remove(k);
      System.out.println(m);
      System.out.print("Enter the index to insert:");
      String name = b.readLine();
      System.out.println(name);
      System.out.print("Enter the value to be inserted:");
      String q = b.readLine();
      System.out.println(q);
      m.put(name,q);
      System.out.println(m);
    }
}