import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int num1,num2,num3,a;
      Scanner input = new Scanner(System.in);
      num1 = input.nextInt();
      num2 = input.nextInt();
      num3 = input.nextInt();
      a = num1 + num2 + num3;
      a = a/3;
      System.out.println(a);
	}
}