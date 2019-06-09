import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int len  = str.length();
      int end = len-1;
      int front = 0;
      boolean is_palind =true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          is_palind = false;
          break;
        }
        front++;
        end--;
      }
      if(is_palind==true)
      {
        System.out.println("Yes");
      }
      else
      {
       System.out.println("No");
      }
    } 
}