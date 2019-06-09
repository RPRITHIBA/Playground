import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int x,i,a,c=0;
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      x = a;
      while(a>0)
      {
        i = a%10;
        c+= i*i*i;
        a = a/10;
      }
      if(c==x)
        System.out.print("Armstrong Number");
      else
        System.out.print("Not a Armstrong Number");
	}
}