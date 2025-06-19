class customException extends Exception{ 
public customException(String message){ 
super(message); 
} 
} 
class ExceptionDemo{ 
static int divide(int a, int b) throws customException { 
if(b==0){ 
throw new customException("Cannot divide by zero!"); 
} 
return a/b; 
} 
public static void main(String[] args){ 
try{ 
int result = divide(10, 0); 
System.out.println("Result: "+ result); 
} 
catch (customException e){ 
System.out.println("Caught Exception: "+ e.getMessage()); 
} 
finally{ 
System.out.println("Execution completed."); 
} 
} 
}