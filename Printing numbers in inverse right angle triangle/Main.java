import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner re = new Scanner(System.in);
      int i,j,k,n;
      n = re.nextInt();
      k=n;
      for(i=1;i<=n;i++)
      {
        for(j=k;j>=1;j--)
        {
          System.out.print(j);
        }
        k--;
        System.out.print("\n");
	}
}}