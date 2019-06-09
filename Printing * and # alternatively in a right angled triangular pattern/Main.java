import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int a = in.nextInt();
      int x = 0,r,c;
      for(r=1;r<=a;r++)
      {
        for(c=1;c<=r;c++)
        {
          if(x==0)
          {
            System.out.print("*");
            x=1;
          }
          else
          {
            System.out.print("#");
            x=0;
          }}
          System.out.print("\n");
        }
        in.close();
      
      
    }
}