import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int a,x,y,i,flag=0;
      Scanner in = new Scanner(System.in);
       a = in.nextInt();
      int arr[] = new int[a];
      for(i=0;i<a;i++)
      {
        arr[i]=in.nextInt();
      }
      x = in.nextInt();
      y = in.nextInt();
      for(i=0;i<a;i++)
      {
        if(arr[i]==x)
        {
          System.out.println(i);
        }
      }
      for(i=0;i<a;i++)
      {
        if(arr[i]==y)
        {flag=1;
         // System.out.println(i);
          //break;
        }}
      for(i=0;i<a;i++)
      {
      if(flag==1)
      {System.out.println("3");
        break;}
        else 
        {System.out.println("-1");
         break;}
      }
     
    }
}