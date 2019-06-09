import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int s = in.nextInt();
      int arr[] = new int[s];
      for(int i=0;i<s;i++)
      {
        arr[i] = in.nextInt();
      }
      int left=0 ;
      int right = s-1;
      boolean palin = true;
      while(left<=right)
      {
        if(arr[left]!=arr[right])
        {
          palin  =false;
          break;
        }
        left++;
        right--;
      }
      if(palin == true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}