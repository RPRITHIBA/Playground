import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int n1,n2,sum;
      Scanner inp = new Scanner(System.in);
      n1 = inp.nextInt();
      n2 = inp.nextInt();
    //  inp.close();
      sum = n1 * n2;
      System.out.println(sum);
	}
}