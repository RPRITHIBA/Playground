import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int s=0;
    while(num!=0)
    {
      s=s+num;
      num--;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      int num;
      Scanner n = new Scanner(System.in);
      num = n.nextInt();
      int sod = sum(num);
      System.out.println(sod);
	}
}