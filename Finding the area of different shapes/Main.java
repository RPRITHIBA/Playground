import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      switch(x)
      {
        case 1:
          int s = in.nextInt();
          int squ = s*s;
          System.out.print(squ);
          break;
        case 2:
          int l = in.nextInt();
          int b = in.nextInt();
          int rec = l*b;
          System.out.print(rec);
          break;
        case 3:
          int h = in.nextInt();
          int ba = in.nextInt();
          int tri = (h*ba)/2;
          System.out.print(tri);
          break;
        case 4:
          int r = in.nextInt();
          double cir = (3.14)*r*r;
          System.out.print(cir);
          break;
      }
    }
}