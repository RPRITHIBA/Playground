import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      String s2 = in.nextLine();
      int c = in.nextInt();
      String s3 = s1.replace(s1,s2);
      String flag[] = s3.split(" ",c);
      for(String a:flag)
        System.out.println(a);
    }
}