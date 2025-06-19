class Strings 
{
public static String convertToUpper(String text) 
{
return text.toUpperCase();
}
public static String convertToLower(String text) 
{
return text.toLowerCase();
}
public static String mergeStrings(String text1, String text2) 
{
return text1+" "+text2;
}
public static String reverse(String text) 
{
return new StringBuilder(text).reverse().toString();
}
public static int getTextLength(String text) 
{
return text.length();
}

public static void main(String[] args) 
{
String str1="Hemang";
String str2="Vats";

System.out.println("Uppercase: "+Strings.convertToUpper(str1));
System.out.println("Lowercase: "+Strings.convertToLower(str2));
System.out.println("Concatenation: "+Strings.mergeStrings(str2,str1));
System.out.println("Reverse: "+Strings.reverse(str2));
System.out.println("Length: "+Strings.getTextLength(str1));
}
}
