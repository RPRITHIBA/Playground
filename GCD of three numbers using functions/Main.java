import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a,b,c,min;
      a = in.nextInt();
      b= in.nextInt();
      c = in.nextInt();
      min=Math.min(a,b);
      min=Math.min(min,c);
      for(int i=min;i>=1;i--)
      {
        if((a%i==0) && (b%i==0) && (c%i==0))
        {
          System.out.println(i);
          break;
        }
      }
	}
}