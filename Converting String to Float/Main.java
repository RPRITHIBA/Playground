import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int len = s.length();
    double aft = 0;
    double bef = 0;
    int flag = 0;
    for(int i=0;i<len;i++)
    {
      if(s.charAt(i)=='.')
        flag = 1;
    }
    if(flag==1)
    {
      for(int i= len-1;s.charAt(i)!='.' && i>=0;i--)
      {
        aft  = aft/10 + (s.charAt(i)-'0');
      }
      aft = aft/10;
      for(int i=0;s.charAt(i)!='.';i++)
      {
        bef = bef*10+(s.charAt(i)-'0');
      }
    }
    else
    {
      for(int i=0;i<len;i++){
        bef = bef*10+(s.charAt(i)-'0');
      }
    }
    double sum = (aft+bef);
    System.out.printf("%.6f",sum);
  }
}