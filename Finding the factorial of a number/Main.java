import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x = f(n);
    System.out.print(x);
  }
  public static int f(int n)
  {
    if(n==0)
    {
      return 1;
    }
    else
    {
      return n*f(n-1);
    }
  }
}