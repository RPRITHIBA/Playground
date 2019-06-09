import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in = new Scanner(System.in);
      int s = in.nextInt();
      int arr[] = new int[s];
      int i,idx,max;
      for(i = 0;i < s;i++)
      {
        arr[i]=in.nextInt();
      }
      int freq[]=new int[s];
      idx = rep(arr,s,freq);
      max = m(freq,s,idx);
      System.out.print(max);
    }
  public static int rep(int arr[], int s,int freq[])
  {
    int i,count=0,f=0;
   for(i=0;i<s;i++)
   {
     if(arr[i]==1)
     {
       count++;
     }
     if((arr[i]==0) || (i==s-1))
     {
       freq[f]=count;
       count=0;
       f++;}
   }
    return f-1;
  }
  public static int m(int freq[],int s,int idx)
  {
    int no=0;
    if((freq[0]>freq[1]) || (idx==0))
    {
      no=freq[0];
    }
    else
    {
      no=freq[1];
    }
    for(int i=2;i<idx;i++)
    {
      if(no<freq[idx])
      {
        no=freq[idx];
      }
    }return no;
    }
}