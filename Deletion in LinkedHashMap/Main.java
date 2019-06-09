import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashMap<String,Integer> m = new LinkedHashMap<String,Integer>();
      String n;
      int mark;
      System.out.print("Enter the number of values to be inserted in map:");
      int j = Integer.parseInt(b.readLine());
      System.out.println(j);
      for(int i = 0;i<j;i++)
      {
        n = b.readLine();
       mark= Integer.parseInt(b.readLine());
        m.put(n,mark);
      }
      System.out.println(m);
      System.out.print("Enter the index to be removed:");
      String e = b.readLine();
      System.out.println(e);
      m.remove(e);
      System.out.println(m);
      System.out.println("Size of map is : "+m.size());
    
                           
    }
}