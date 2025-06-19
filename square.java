import java.lang.*;
import java.util.Scanner;
class square {
    public static void main(String args[])
    { 
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = S.nextInt();
        double b = Math.sqrt(a);
        System.out.println("The square root of the number is: " + b);
    }
}