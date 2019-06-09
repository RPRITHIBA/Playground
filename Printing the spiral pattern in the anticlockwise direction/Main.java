import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in=new Scanner(System.in);
      int x=in.nextInt();
      int a[][]=new int[x][x];
      spiral(a,x);
      int i,j;
      for(i=0;i<x;i++)
      {
        for(j=0;j<x;j++)
        {
          System.out.print(a[i][j]+ " ");
        }
        System.out.println();
      }
    }
  public static void spiral(int a[][],int x)
  {
    int v=1,r1=0,r2=x-1,c1=0,c2=x-1;
    int i,j;
    while((r2>=r1) &&(c2>=c1))
    {
      for(i=c2;(i>=c1);i--)
      {
        a[r1][i]=v++;
      }
      for(i=r1+1;(i<=r2);i++)
      {
        a[i][c1]=v++;
      }
      for(i=c1+1;(i<=c2);i++)
      {
        a[r2][i]=v++;
      }
      for(i=r2-1;(i>=r1+1);i--)
      {
        a[i][c2]=v++;
      }
      r1++;
      c1++;
      r2--;
      c2--;
    }
    }
}