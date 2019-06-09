import java.util.Scanner;
class Main{
  public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n;
      n = in.nextInt();
     // a = prime(n);
      //System.out.println(a);
	
    int c,i,j,x=0;
    for(i=1;i<=n;i++)
    {c=0;
     for(j=1;j<=i;j++)
     {
      if(i%j==0)
      {c++;
      }
     }
      if(c==2)
      {
        x=i;
        System.out.println(x);
      }
    }
  // return 10;
   // System.out.println(x);
  }
}