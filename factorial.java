import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to display:");
        int n=s.nextInt();
        int fact=1;
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("The factorial of "+n +" is "+fact);
    }
}

