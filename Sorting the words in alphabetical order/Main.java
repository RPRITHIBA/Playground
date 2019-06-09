import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int s=in.nextInt();
    String[] words=new String [s];
    for(int i=0;i<s;i++)
    {
      words[i]=in.next();
    }
    int k=0;
    for(int i=0;i<s;i++)
    {
      int ch = words[i].charAt(0);
      if(ch>64 && ch<91)
      {
        String str = words[i];
        char[] c=str.toCharArray();
        ch=ch+32;
        c[0]=(char)ch;
        words[i]=new String(c);
      }
    }
    for(int i=0;i<s-1;i++)
    {
      for(int j=i+1;j<s;j++)
      {
        if(words[i].charAt(k)>words[j].charAt(k))
        {
          String x= words[i];
          words[i]=words[j];
          words[j]=x;
          k=0;
        }
      }
    }
    for(int i=0;i<s;i++)
    {
      System.out.println(words[i]);
    }

      
  }
}