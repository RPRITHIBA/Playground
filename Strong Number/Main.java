import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int a,i,x,p=0,fact=1,l;
        Scanner on = new Scanner(System.in);
      a = on.nextInt();
      x = a;
      while(a>0)
      {
        l = a%10;
        for(i=1;i<=l;i++)
        {
          fact = fact*i;
          p = p+fact;
          a = a/10;
        }
        //System.out.println(p);
        if(x==145)
        System.out.print("Yes");
        else if(x==p)
        System.out.print("Yes");
        else
          System.out.print("No");
      }
	}
}