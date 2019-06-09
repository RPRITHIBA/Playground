import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      String s1  = in.nextLine();
      String s2 =  in.nextLine();
      StringBuilder sb1 = new StringBuilder(s1);
      StringBuilder sb2 = new StringBuilder(s2);
      StringBuilder temp = new StringBuilder("");
      int l1 = sb1.length();
      int l2 =  sb2.length();
      for(int i=0;i<=(l1-1);i++)
      {
        char ch = sb1.charAt(i);
        temp.append(ch);
      }
    for(int i=0;i<=(l1-1);i++)
        {
         char ch  =sb1.charAt(i);
        temp.append(ch);
      }
      int temp_len = temp.length();
      int indx = substring(temp,temp_len,sb2,l2);
      if(indx!=-1)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
  public static int substring(StringBuilder s1,int l1,StringBuilder s2,int l2)
  {
    int matching_idx = -1;
    for(int i=0;i<(l1-l2+1);i++)
    {
      boolean is_matching = true;
      for(int j=0;j<l2;j++)
      {
        if(s1.charAt(i+j)!=s2.charAt(j))
        {
          is_matching=false;
        }
      }
      if(is_matching==true)
      {
        matching_idx=i;
        break;
      }
    }
    return matching_idx;
    }
}