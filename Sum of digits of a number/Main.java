import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int a, rem, rev = 0;
      Scanner ip = new Scanner(System.in);
      a = ip.nextInt();
      while(a>0)
      {
       rem = a%10;
       rev = rev + rem;
       a = a/10;
      }
      System.out.println(rev);
        
	}
}