import java.util.Scanner;
class Main{
	public static void main(String args[]) 
  	{ 
      // Type your code here  
      Scanner in = new Scanner(System.in);
      String s1  =in.nextLine();
      String s2 = in.nextLine();
      String s3 = in.nextLine();
      StringBuilder sb1 = new StringBuilder(s1);
      StringBuilder sb2 = new StringBuilder(s2);
      StringBuilder sb3 = new StringBuilder(s3);
      StringBuilder temp =new StringBuilder("");
      int l1 = sb1.length();
      int l2 = sb2.length();
      int l3 = sb3.length();
      int i,j;
      for(i=0;i<=(l1-1)-(l2-1);i++)
      {
        boolean is_match = true;
        for(j=0;j<l2;j++)
        {
          if(sb1.charAt(i+j)!=sb2.charAt(j))
          {
            is_match=false;
          }}
        if(is_match==true)
        {
          String strng = sb3.substring(0,l3);
          temp.append(strng);
          i = i+(l2-1);
        }
        else
        {
          char ch = sb1.charAt(i);
          temp.append(ch);
        }
      }
      for(j=i;j<=(l1-1);j++)
      {
        char ch = sb1.charAt(j);
        temp.append(ch);
        
      }
      System.out.print(temp);
    
    }
}