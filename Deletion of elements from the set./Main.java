import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> t = new TreeSet<String>();
      String mon = b.readLine();
      String[] arr = mon.split(",");
      for(int i = 0;i<arr.length;i++)
      {
        t.add(arr[i]);
      }
      System.out.println(t);
      Object arr1[] = t.toArray();
      int c = arr1.length-1;
      while(t.isEmpty()!=true)
      {
        Object m = arr1[c];
        t.remove(m);
        System.out.println(t);
        --c;
      }
        
    }
}