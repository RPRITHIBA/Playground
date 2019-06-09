import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int a,b,c=0;
    Scanner inp = new Scanner(System.in);
    a = inp.nextInt();
    while (a!=0)
    {
      b = a%10;
      c = (c*10)+b;
      a = a/10;
  }
    System.out.println(c);
}}