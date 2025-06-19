import java.util.Scanner;
class Stack 
{
int[] arr;
int top;
int size;
public Stack(int len) 
{
size=len;
arr=new int[size];
top=-1; 
}

public void push(int value) 
{
if(isFull()) 
{
System.out.println("Stack Overflow!");
return;
}
top++;
arr[top]=value;
}

public int pop() 
{
if(isEmpty()) 
{
System.out.println("Stack Underflow!");
return -1; 
}
int popvalue=arr[top];
top--;
return popvalue;
}

public int peek() 
{
if(isEmpty()) 
{
System.out.println("Stack is empty!");
return -1; 
}
return arr[top];
}
public void display()
{
if(isEmpty()) 
{
System.out.println("Stack is empty!");
return;
}
System.out.println("Stack:");
for(int i=top; i>=0; i--)
{
System.out.println(arr[i]);
}
}

private boolean isEmpty() 
{
return top==-1;
}
private boolean isFull() 
{
return top==size-1;
}
public static void main(String[] args) 
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter stack size: ");
int len=scanner.nextInt();
Stack S=new Stack(len);

while(true) 
{
System.out.println("\nChoose:");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Peek");
System.out.println("4. Display");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
int choice=scanner.nextInt();
switch(choice) 
{
case 1:
System.out.print("Enter value to be pushed: ");
int value=scanner.nextInt();
S.push(value);
break;
case 2:
int pop_value=S.pop();
if (pop_value!=-1) 
{
System.out.println("Popped: "+pop_value);
}
break;
case 3:
int topvalue=S.peek();
if(topvalue!=-1)
{
System.out.println("Top element: "+topvalue);
}
break;
case 4:
S.display();
break;
case 5:
scanner.close();
return;
default:
System.out.println("Invalid choice");
}
}
}
}
