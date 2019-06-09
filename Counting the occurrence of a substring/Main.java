import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    String s2 = in.nextLine();
    int len1 = s1.length();
    int len2 = s2.length();
    int count = 0,i,j;
    for(i=0;i<(len1-len2+1);i++)
    {
    boolean is_match = true;
    for(j=0;j<(len2);j++)
    {
      if(s1.charAt(i+j)!=s2.charAt(j))
      {
        is_match = false;
        break;
      }
    }
    if(is_match == true)
    {count++;
    }
        }
      System.out.println(count);
    
  } 
}