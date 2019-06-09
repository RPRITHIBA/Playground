import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> t = new TreeSet<String>();
      String m = b.readLine();
      String[] arr = m.split(",");
      System.out.println("Duplicate Entry is: ");
      for(String str : arr)
      {
        if(!t.add(str))
        {
          System.out.println(str);
        }
      }
      System.out.println("TreeSet is : " +t);
    }
}