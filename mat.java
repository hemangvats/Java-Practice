import java.util.*;
public class mat {
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter no. of rows: ");
int r=sc.nextInt();
System.out.print("Enter no. of columns: ");
int c=sc.nextInt();

int[][] A=new int[r][c];
int[][] B=new int[r][c];
int[][] Sum=new int[r][c];

System.out.println("Enter first matrix values:");
for(int i=0; i<r; i++) 
{
for(int j=0; j<c; j++) 
{
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter second matrix values:");
for(int i=0; i<r; i++) 
{
for(int j=0; j<c; j++) 
{
B[i][j]=sc.nextInt();
}
}

for(int i=0; i<r; i++) 
{
for(int j=0; j<c; j++) 
{
Sum[i][j]=A[i][j]+B[i][j];
}
}
System.out.println("Sum of matrices A and B:");
for(int i=0; i<r; i++) 
{
for(int j=0; j<c; j++) 
{
System.out.print(Sum[i][j]+" ");
}
System.out.println();
}
}
}

