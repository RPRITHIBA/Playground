import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n,i,j,k,s;
      n = in.nextInt();
      s=n-1;
      for(i=1;i<=n;i++)
      {
      if(i%2==1)
      {
        for(j=1;j<=s;j++)
        {
          System.out.print(i);
        }  System.out.println(i+1);
      }
     // System.out.print("\n");}
        else
        {System.out.print(i+1);
          for(j=1;j<=s;j++)
          {
            System.out.print(i);
          }
         System.out.println();
      }//System.out.print("\n");
}}}