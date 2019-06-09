import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();
    int j = sc.nextInt();
    StringBuilder str = new StringBuilder(string);
    int len  = str.length();
    spaces(str,len);
    len = str.length();
    int i = len/j;
    if((len%j)>0)
    {
      i++;
    }
    for(int y=0;y<j;y++)
    {
      for(int x=0;x<i;x++)
      {
        int curr=y+(x*j);
        if(x%2==1)
        {
          int char_idx=(j-1)+(x*j);
          curr=char_idx-y;
        }
        char ch;
        if(curr>=len)
        {
          ch='X';
        }
        else
        {
          ch= str.charAt(curr);
        }
        System.out.print(ch);
  }
}
  }
    public static void spaces(StringBuilder str,int len)
    {
      StringBuilder temp= new StringBuilder("");
      for(int i=0;i<len;i++){
        if(str.charAt(i)!=' ')
        {
          temp.append(str.charAt(i));
        }
      }
      str.setLength(0);
    int temp_len=temp.length();
      for(int i=0;i<temp_len;i++)
      {
        str.append(temp.charAt(i));
      }
    }
  }