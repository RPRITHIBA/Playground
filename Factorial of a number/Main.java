import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int a,i,fact=1;
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      for(i=1;i<=a;i++)
      {
        fact= fact*i;
      }
      System.out.print(fact);
	}
}