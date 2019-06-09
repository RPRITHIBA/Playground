import java.util.Scanner;
class Main{
 
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int x,y,i=1,n=0;
    x = in.nextInt();
    y = in.nextInt();
  //  int s = power(x,y);
   while(n!=y)
   {
     i = i*x;
     n++;
   }
    System.out.print(i);
  }}