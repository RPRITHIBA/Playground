import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in  = new Scanner(System.in);
    int r =in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
    int matrix2[][] = new int[r][c];
    int sub[][] = new int[r][c];
    for(int i= 0 ;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix1[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix2[i][j]=in.nextInt();
        
      }
    }
    diff(matrix1,matrix2,sub);
    display(sub);
  }
  public static void diff(int matrix1[][],int matrix2[][],int sub[][])
  {
    for(int i=0;i<=sub.length-1;i++)
    {
      for(int j=0;j<=sub[i].length-1;j++)
      {
        sub[i][j]=matrix1[i][j]-matrix2[i][j];
      }
      
    }
  }
  public static void display(int matrix[][])
  {
    for(int i=0;i<=matrix.length-1;i++)
    {
      for(int j=0;j<=matrix[i].length-1;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
   
  }
}