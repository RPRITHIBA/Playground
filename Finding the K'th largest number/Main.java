import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int a,k;
      a = in.nextInt();
      int arr[] = new int[a];
      for(int i =0;i<a;i++)
      {
        arr[i] = in.nextInt();
      }
      k = in.nextInt();
      selection(a,arr);
      System.out.print(arr[a-k]);
    }
  public static void selection(int a,int arr[])
  {
    for(int i= 0;i<=a-2;i++)
    {
      int mid  = find(i,arr,a-1);
      swap(i,mid,arr);
    }
  }
  public static void swap(int i,int mid,int arr[])
  {
    int temp = arr[i];
    arr[i] = arr[mid];
    arr[mid]=temp;
  }
  public static int find(int i,int arr[],int j)
  {
    int mid = 0;
    if(arr[i]<arr[i+1])
    {
      mid = i;
    }
    else
    {
      mid = i+1;
    }
    for(int k = i+2;k<=j;k++)
    {
      if(arr[mid]>arr[k])
      {
        mid = k;
      }
    }
    return mid;
    }   
}