import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int i,p=0,q=0;
    int arr[] = new int[a];
    for(i=0;i<a;i++)
    {
      arr[i] = in.nextInt();
    //}
   // p=arr[0];
    //q=arr[0];
   // for(i=0;i<a;i++)
   //{
      p=(arr[0])+(arr[1])+(arr[2]);
    
      q=(arr[a-1])+(arr[a-2])+(arr[a-3]);
    }
    
    if(p==q)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
      
  }
}