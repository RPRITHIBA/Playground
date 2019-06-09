import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      int i,j,k,n;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
          if(i==j || i+j==n-1)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }}
        System.out.print("\n");
      }
        
	}
}