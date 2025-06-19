import java.util.Scanner;
class Multiplication 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter rows of first matrix: ");
int r1=sc.nextInt();
System.out.print("Enter columns of first matrix / rows of second matrix: ");
int c1=sc.nextInt();
System.out.print("Enter columns of second matrix: ");
int c2=sc.nextInt();

int[][] A=new int[r1][c1];
int[][] B=new int[c1][c2];
int[][] Product=new int[r1][c2];

System.out.println("Enter first matrix values:");
for(int i=0; i<r1; i++) 
{
for(int j=0; j<c1; j++) 
{
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter second matrix values:");
for(int i=0; i<c1; i++) 
{
for(int j=0; j<c2; j++) 
{
B[i][j]=sc.nextInt();
}
}

for(int i=0; i<r1; i++) 
{
for(int j=0; j<c2; j++) 
{
Product[i][j]=0;
for(int k=0; k<c1; k++)
{
Product[i][j]+=A[i][k]*B[k][j];
}
}
}
System.out.println("Product of matrices A and B:");
for(int i=0; i<r1; i++) 
{
for(int j=0; j<c2; j++)
{
System.out.print(Product[i][j]+" ");
}
System.out.println();
}
}
}
