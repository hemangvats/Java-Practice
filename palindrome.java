import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
sc.close();
String reversed = new StringBuilder(str).reverse().toString(); 
if (str.equals(reversed)) {
    System.out.println("The string is a palindrome."); } 
else { 
    System.out.println("The string is not a palindrome.");
}}}

