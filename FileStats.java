import java.io.*; 
import java.util.*; 
public class FileStats { 
public static void main(String[] args) { 
String filePath = "sample.txt"; 
int charCount = 0; 
int wordCount = 0; 
int lineCount = 0; 
try 
{File file = new File(filePath); 
Scanner scanner = new Scanner(file); 
while (scanner.hasNextLine()) { 
String line = scanner.nextLine(); 
lineCount++; 
charCount += line.length();                
String[] words = line.trim().split("\\s+"); 
if (!line.trim().isEmpty()) { 
wordCount += words.length; } 
} 
scanner.close(); 
System.out.println("File: " + filePath); 
System.out.println("Total Lines: " + lineCount); 
System.out.println("Total Words: " + wordCount); 
System.out.println("Total Characters: " + charCount);
}
catch (FileNotFoundException e) { 
    System.out.println("File not found: " + filePath); 
    } 
} 
}
