import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      int i,k,j,n,me=1;
      Scanner op = new Scanner(System.in);
      n = op.nextInt();
      for(i=1;i<=n;i++)
      {
        for(k=1;k<=(n-i);k++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
          System.out.print(me+ " ");
          me++;
        }
        System.out.print("\n");
    }    
}}