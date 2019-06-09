import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      int s;
      char o;
      o = (char)(ch-key);
      if(o>=65 && o<=91)
      {
        System.out.print(o);
      }else
      {
      System.out.print("z");
    }}
}