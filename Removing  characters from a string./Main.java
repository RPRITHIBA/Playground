import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String sub_str = in.nextLine();
    System.out.println(remove(str,sub_str));
  }
  public static int[] count_arr(String str)
  {
    int count[] = new int[255];
    for(int i=0;i<str.length();i++)
    {
      count[str.charAt(i)]++;
    }
    return count;
  }
 public static String remove(String str,String sub_str)
 {
   int count[]=count_arr(sub_str);
   int ip=0,res=0;
   char arr[]=str.toCharArray();
   while(ip!=arr.length)
   {
     char temp=arr[ip];
     if(count[temp]==0)
     {
       arr[res]=arr[ip];
       res++;
     }
     ip++;
   }
   str=new String(arr);
   return str.substring(0,res);
}
}