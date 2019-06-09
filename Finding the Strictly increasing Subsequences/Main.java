import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int x,n,i,j,k,flag=1;
    n = in.nextInt();
    int a[] = new int[n];
    for(i=0;i<n;i++)
    {
      a[i]= in.nextInt();
    }
    int sum[] = new int[3*n];
    for(i=0;i<n;i++)
    {
      k=a[i];
      for(j=i+1;j<n;j++)
      {
        if(a[j]>k)
        {
          for(x=i;x<j;x++)
          {
            if(a[x]>a[j])
              flag=0;
          }
          if(flag==1)
            System.out.println(k+","+a[j]+" ");
        }
        flag=1;
      }
    }
  }
}