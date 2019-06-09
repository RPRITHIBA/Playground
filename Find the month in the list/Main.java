import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
      LinkedList<String> l =new LinkedList<String>();
      String mon =b.readLine();
      String[]  arr = mon.split(",");
      for(int i =0;i<arr.length;i++)
      {
        l.add(arr[i]);
      }
      System.out.println(l);
      System.out.println("Size of the linked list: "+l.size());
      System.out.println("Is LinkedList empty? "+l.isEmpty());
      String m =b.readLine();
      System.out.println("Does LinkedList contains "+m+"?");
      System.out.println(l.contains(m));
        
    }
}