import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int arr[] = new int[s];
    int i;
    for(i=0;i<s;i++)
    {
      arr[i]=in.nextInt();
    }
    int freq[]=new int[s];
    System.out.print(fre(arr,s,freq));
  }
  public static int fre(int arr[],int s,int freq[])
    
  {
    int max=0,count=1,i,j;
    for(i=0;i<s;i++)
    {
      for(j=i+1;j<s;j++)
      {
        if(arr[i]==arr[j])
        {
          count++;
        }
        freq[i]=count;
        count=1;
      }
    }      for(i=0;i<s;i++)
      {
        if(freq[i]>freq[max])
          max=i;
      }
      return arr[max];
  }
  }