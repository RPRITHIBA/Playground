import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n,i,j,x;
    n = in.nextInt();
    int a[] = new int[n];
    for( i=0;i<n;i++)
    {
      a[i] = in.nextInt();
    }
    for(i=1;i<n/2;i++)
    {
       x=a[i];
      j=i-1;
      while((j>=0) && (a[j]>x))
      {
        a[j+1]=a[j];
        j--;
      }
      a[j+1]=x;
    }
    for(i=n/2;i<n;i++)
    {
      x=a[i];
      j=i-1;
      while((j>=n/2) && (a[j]<x))
      {
        a[j+1]=a[j];
        j--;
      }
      a[j+1]=x;
    }
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+ " ");
    }
  }
}