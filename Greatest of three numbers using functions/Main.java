import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a,b,c;
      a = in.nextInt();
      b  = in.nextInt();
      c = in.nextInt();
     // System.out.println(gcd(a,b,c));
    //}
//  public static int gcd(int x,int y,int z)
  //{
    int min;
    if((a>b) && (a>c))
    {min=a;}
    else if((b>a) && (b>c))
    {min=b;}
    else
    { min=c;}
	
 // return min;
  System.out.print(min);
    }
}