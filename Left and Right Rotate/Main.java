import java.util.Scanner;
class Main 
{
  public static void left(int s,int arr[],int rotate)
  {
    int a = 1,b;
    if(s%2==0)
    {
      b = s-1;
    }
    else
    {
      b = s-2;
    }
    for(int r = 1;r<=rotate;r++)
    {int temp = arr[a];
     for(int i = 3;i<s;i=i+2)
     {
       arr[i-2] = arr[i];
     }
     arr[b]=temp;
    }
  }
   public static void right(int s,int arr[],int rotate)
   {
     int x = 0,y;
     if(s%2==1)
     {
       y = s-1;
     }
     else
     {
       y = s-2;
     }
     for(int r = 1; r<=rotate;r++)
     {
       int temp = arr[y];
       for(int i = (y-2) ; i>=0;i =i-2)
       {
         arr[i+2] = arr[i];
       }
       arr[x]=temp;
     }
   }
  
  public static void main(String args[])
    {
    	//Try your code here
    Scanner uno = new Scanner(System.in);
    int s = uno.nextInt();
    int arr[] = new int[s];
    for(int i=0;i<s;i++)
    {
      arr[i]= uno.nextInt();
    }
    int rotate = uno.nextInt();
    left(s,arr,rotate);
    right(s,arr,rotate);
    for(int i = 0;i<s;i++)
    {
      System.out.print(arr[i]+ " " );
    }
  	}
}