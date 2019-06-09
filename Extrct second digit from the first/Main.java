import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner io = new Scanner(System.in);
      int n,i;
      n = io.nextInt();
      while(n>=99)
      {
        n = n/10;
      }
      i = n%10;
      System.out.println(i);
    }
}
