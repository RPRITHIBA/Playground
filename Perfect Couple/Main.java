import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int i,s,j;
      s = in.nextInt();
      int arr[]=new int[s];
      for(i=0;i<s;i++)
      {
        arr[i] = in.nextInt();
      }
      int search = in.nextInt();
      for(i=0;i<s;i++)
      {
        for(j=i+1;j<s;j++)
        {
          if((arr[i]+arr[j])==search)
          {
            System.out.println(arr[i] + "," + " " +arr[j]);
          }
        }
      }
    }
}