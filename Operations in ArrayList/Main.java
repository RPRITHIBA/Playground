import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> arr = new ArrayList<String>();
      int c = 1;
      while(c!=0)
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        int s = Integer.parseInt(b.readLine());
        switch(s)
        {
          case 1:String mon = b.readLine();
            String[] z = mon.split(",");
            for(int i=0;i<z.length;i++)
            {
              arr.add(z[i]);
            }
            break;
          case 2:System.out.print("Enter the index value to be deleted:");
            int p = Integer.parseInt(b.readLine());
            System.out.println(p);
            arr.remove(p);
            break;
          case 3: System.out.println(arr);
            break;
          case 4:c=0;break;
        }
      }   
    }
}