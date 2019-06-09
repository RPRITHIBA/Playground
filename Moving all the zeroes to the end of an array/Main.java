import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner uno = new Scanner(System.in);
      int s = uno.nextInt();
      int i;
      int arr[] = new int[s];
      for(i=0;i<=s-1;i++)
      {
        arr[i] = uno.nextInt();
      }
      a(s,arr);
      for(i=0;i<=s-1;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
  public static void a(int s,int arr[])
  {
    int count = 0;
    int i;
    for(i=0;i<=s-1;i++)
    {
      if(arr[i]!=0)
      {
        int t = arr[i];
        arr[i] = arr[count];
        arr[count] = t;
        count++;
      }
    }
}
}