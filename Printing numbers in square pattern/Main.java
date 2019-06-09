import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a,r,c;
      a  = in.nextInt();
      for(r=1;r<=a;r++)
      {
        for(c=1;c<=a;c++)
        {
          System.out.print(r);
        }
        System.out.print("\n");
      }
	}
}