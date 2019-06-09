import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in = new Scanner(System.in);
   int flag= 0;
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix1[i][j]=in.nextInt();
      }
    }
  int matrix2[][] =new int[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++){
      matrix2[i][j]=in.nextInt();
    }
  }
 
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(matrix1[i][j]!=matrix2[i][j])
      {
        flag=1;
        break;
      }
    }
  }
  if(flag==0)
  System.out.print("Yes");
  else
  System.out.print("No");
}
}