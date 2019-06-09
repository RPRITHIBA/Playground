import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in= new Scanner(System.in);
    int n,i,j,k;
    n = in.nextInt();
    int a[] = new int[n];
    for(i=0;i<n;i++)
    {
      a[i]= in.nextInt();
    }
    int sum[]=new int[3*n];
    for(i=0;i<n;i++)
    {
      k = a[i];
      for(j=i+1;j<n;j++)
      {
        if(a[j]>k)
          System.out.println(k+","+a[j]+" ");
      }
    }
  }
}