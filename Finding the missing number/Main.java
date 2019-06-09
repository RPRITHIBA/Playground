import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int s = in.nextInt();
      int arr[] = new int[s];
      for(int i =0;i<s;i++)
      {
        arr[i]= in.nextInt();
      }
      int val = 0;
      for(int z=1;z<=s;z++)
      {
        boolean found  = false;
        for(int i=0;i<s;i++)
        {if(arr[i]==z)
        { found = true;
          break;
        }
      }
      if(found==false)
      {
        val = z;
        break;
      }
    }
  System.out.print(val);
    }
}
