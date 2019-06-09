import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int len = sb.length();
      reverse(sb,0,len-1);
      int start = 0;
      for(int i=0;i<len;i++)
      {
        if(sb.charAt(i)==' ' )
        {
          reverse(sb,start,i-1);
          start = i+1;
        }
        else if(i==(len-1))
        {
          reverse(sb,start,i);
          start = i+1;
        }
      }
      System.out.print(sb);
    }
    // Function to reverse a string
    public static void reverse(StringBuilder sb, int start, int end)
    {
        // Type your code here
      int e = end;
      int f = start;
      while(f<e)
      {
        char temp = sb.charAt(f);
        sb.setCharAt(f,sb.charAt(e));
        sb.setCharAt(e,temp);
        f++;
        e--;
      }

    }
}