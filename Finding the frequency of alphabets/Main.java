import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb  = new StringBuilder(str);
      int len = sb.length();
      int arr[]  =new int[75];
      for(int i = 0;i<75;i++)
      {
        arr[i] = 0;
      }
      for(int i=0;i<len;i++)
      {
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          int set  =sb.charAt(i)-'A';
          char ch  =(char)('a'+set);
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
        {
          arr[sb.charAt(i)-'a']++;
        }}
      for(int i =0;i<len;i++)
      {
        if(arr[sb.charAt(i)-'a']!=0)
               {
                 System.out.print(sb.charAt(i));
          System.out.print(arr[sb.charAt(i)-'a']+" ");
                 arr[sb.charAt(i)-'a']=0; 
               }
               }
               }
               }
   