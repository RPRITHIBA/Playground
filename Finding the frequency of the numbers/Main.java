import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int a,k;
      a = in.nextInt();
      int arr[] = new int[a];
     k = in.nextInt();
      for(int i=0;i<a;i++)
      {
        arr[i] = in.nextInt();
      }
      int freq[]= new int[k];
      for(int i=0;i<k;i++)
      {
        freq[i] = 0;
      }
      for(int i=0;i<a;i++)
      {
        freq[arr[i]-1]++;
      }
      for(int i = 0;i<k;i++)
      {
        System.out.println((i+1)+" " +freq[i]);
      }
    }
}