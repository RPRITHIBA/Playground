import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int n,i,a=0;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for(i=1;i<=n;i++)
      {
        a = a+i;
      }
      System.out.println(a);
	}
}