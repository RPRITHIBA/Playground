import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int num,a,s;
      Scanner input = new Scanner(System.in);
      num = input.nextInt();
      a=num;
      num=num/100;
      a=a%10;
      s=num+a;
      System.out.println(s);
	}
}