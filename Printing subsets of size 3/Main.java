import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int i,j,k,s;
      s = in.nextInt();
      int arr[] = new int[s];
      for(i=0;i<s;i++)
      {
        arr[i] = in.nextInt();
      }
      for(i=0;i<=(s-2);i++)
      {
        for(j=i+1;j<=(s-1);j++)
        {
          for(k=j+1;k<=(s-1);k++)
          {
            System.out.print("("+arr[i]+", " +arr[j]+", "+arr[k]+") ");
          }
        }
        System.out.print("\n");
      }
    }
}