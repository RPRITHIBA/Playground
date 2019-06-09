import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int r,c,i,j;
      r = in.nextInt();
      c = in.nextInt();
      for(i = 1;i<=r;i++)
      {
        for(j = c;j>c-i;j--)
        {
          System.out.print(j);
        }
        for(j = 1;j<=c-i;j++)
        {
          System.out.print(r - i + 1);
        }
        System.out.println();
      }
    }
}