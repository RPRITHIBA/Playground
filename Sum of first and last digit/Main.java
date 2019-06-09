import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner io = new Scanner(System.in);
      int a,i,k,c;
      a = io.nextInt();
      k = a%10;
      while(a>10)
      {
        a = a/10;
      }
     // k = i%10;
      c = k + a;
      System.out.println(c);
	}
}