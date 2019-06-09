import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int n,i;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      for(i=1;i<=n;i++)
      {
        if(i%2==1)
          System.out.println(i );
	}
}
}