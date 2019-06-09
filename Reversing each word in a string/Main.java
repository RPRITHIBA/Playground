import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in= new Scanner(System.in);
    String str=in.nextLine();
    reverse(str);
  }

public static void reverse(String str)
{
  String[] words=str.split(" ");
  String reversed="";
  for(int i=0;i<words.length;i++)
  {
    String word=words[i];
    String reverse ="";
    for(int j=word.length()-1;j>=0;j--)
    {
      reverse=reverse+word.charAt(j);
    }
    reversed=reversed+reverse+" ";
  }
  System.out.println(reversed);
}
}