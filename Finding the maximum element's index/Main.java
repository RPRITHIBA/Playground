import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int i,k=0,max=0;
    int a = in.nextInt();
    int arr[] = new int[a];
    for(i=0;i<a;i++)
    {
      arr[i] = in.nextInt();
    }
    max=arr[0];
    for(i=0;i<a;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
        //j[k]=arr[i];
        k++;
      }}
   for(i=0;i<a;i++)
    {if(arr[i]==max)
      System.out.println(i);}
  // System.out.print(k);
  }
}