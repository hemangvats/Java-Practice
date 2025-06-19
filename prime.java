import java.util.Scanner;
 class prime {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the limit till you want prime number to be displayed:");
    int n=s.nextInt();
    System.out.println("The prime numbers upto the limit are:");
    int f=0;
    for (int i=2;i<n;i++){
        for (int j=2;j<i;j++){
            if (i%j==0){
                f=1;
                break;
            }
            else{
                f=0;
                continue;
            }
        }
        if (f==0){
            System.out.println(i);
        }
        else{
            continue;
        }
    }
}
}
