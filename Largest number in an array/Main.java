import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int a,b=0,i;
      a = in.nextInt();
      int arr[] = new int[a];
      for(i=0;i<a;i++)
      {
        arr[i]=in.nextInt();
      }
      //arr[] = new int(100);
      b=arr[0];
      for(i=0;i<a;i++)
      {
        if(arr[i]>b)
        {
         b = arr[i];
        }
      }
      System.out.print(b);
    }
}