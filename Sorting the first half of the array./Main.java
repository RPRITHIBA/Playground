import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n  = in.nextInt();
    int a[] = new int[n];
    for(int i = 0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    for(int i = 1;i<n/2;i++)
    {
      int x = a[i];
      int j = i-1;
      while((j>=0) && (a[j]>x))
      {
        a[j+1]=a[j];
        j--;
      }
        a[j+1]=x;
      }
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
      
  }
}