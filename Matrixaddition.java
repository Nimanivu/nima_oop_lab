import java.util.Scanner;

public class Matrixaddition{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of rows of first matrix: ");
 int m = sc.nextInt();
 System.out.println("Enter the number of coloumns of second matrix:");
 int n=sc.nextInt();
 System.out.println("Enter the number of rows of first matrix: ");
 int a = sc.nextInt();
 System.out.println("Enter the number of coloumns of second matrix:");
 int b=sc.nextInt();
 if(m==a && n==b)
 {
 int[][] m1 = new int[m][n];
 int[][] m2 = new int[a][b];
 int[][] sum = new int[m][n];
 
 System.out.println("Enter the values of first matrix:");
 for(int i=0;i<m;i++){

 for(int j=0;j<n;j++){
 m1[i][j]=sc.nextInt();
 }
 }
 System.out.println("Enter the values of second matrix:");
 for(int i=0;i<m;i++){

 for(int j=0;j<n;j++){
 m2[i][j]=sc.nextInt();
 }
 }

 for(int i=0;i<m;i++){
 for(int j=0;j<n;j++){
 sum[i][j]=m1[i][j]+m2[i][j];
 }
 }
 
 System.out.println("Sum of two matrices is");
 for(int i=0;i<m;i++){
 System.out.println();
 for(int j=0;j<n;j++){
 System.out.print(sum[i][j]+" ");
 }
 }
 }
 else
{
System.out.println("error");
}
 }
 }
