import java.util.Scanner;
class sumint{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integers separated by spaces:");
        String[]numbers=sc.nextLine().split(" ");
        sc.close();
        int sum=0;
        System.out.println("The integers are:");
        for (String num: numbers){
            int value=Integer.parseInt(num);
            System.out.println(value);
            sum+=value;
        }
        System.out.println("Sum of all integers:" +sum);
    }
}
