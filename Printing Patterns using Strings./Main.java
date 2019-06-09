import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int x=str.length();
    int z=x/2;
    for(int i=x-1;i>=0;i--)
    {
      int count=0;
      for(int s=0;s<i;s++)
      {
        System.out.print(" ");
        count++;
      }
      if(i>=x/2)
      {
        int j=x/2;
        while(count<x)
        {
          System.out.print(str.charAt(j++));
                           count++;
                           }
      }
      else
      {
        int j=x/2;
        while(count<=(x/2+i))
        {
          System.out.print(str.charAt(j++));
          count++;
        }
        j=0;
        while(count<x)
        {
          System.out.print(str.charAt(j++));
          count++;
        }
      }
      System.out.println();
    }
    
  }
}