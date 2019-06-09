import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n1,a,b;
      Scanner input = new Scanner(System.in);
      n1 = input.nextInt();
      a = n1%10;
      b = a+(n1/10);
      System.out.println(b);
	}
}