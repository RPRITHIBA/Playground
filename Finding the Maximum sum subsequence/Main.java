import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int s =in.nextInt();
    int arr[] = new int[s];
    int i;
    for(i=0;i<s;i++)
    {
      arr[i]=in.nextInt();
    }
    System.out.print(sum(arr,s));
  }
  public static int sum(int arr[],int s)
  {
    int x,max,i;
    x=arr[0];
    max=arr[0];
    for(i=1;i<s;i++)
    {
      if(arr[i]>arr[i-1])
      {
        x+=arr[i];
      }
      else
      {
        x=arr[i];
      }
      if(x>max)
      {
        max=x;
      }
    }
    return max;
  }
}