import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder s  =new StringBuilder(str);
    int x = sc.nextInt();
    int len = s.length();
    for(int i=0;i<len;i++)
    {
      char ch = s.charAt(i);
      if(ch>='A' && ch<='Z')
      {
        ch = (char)(ch-x);
        if(ch<'A')
        {
          ch = (char)(ch+26);
        }
      }
      else if(ch>='a' && ch<='z')
      {
        ch = (char)(ch-x);
        if(ch<'a')
        {
          ch = (char)(ch+26);
        }
      }
      s.setCharAt(i,ch);
    }
    System.out.print(s);
  }
}