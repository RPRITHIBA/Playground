import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int a,b,c=0,x=1;
      a = in.nextInt();
      b = in.nextInt();
      while(c<b)
      {
        x = x*a;
        c++;
      }
      System.out.println(x);
    }
}