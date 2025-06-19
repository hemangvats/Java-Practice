import java.util.Scanner;
class Queue 
{
int[] arr;
int front;
int rear;
int size;
int length;
public Queue(int len)
{
this.size=len;
this.arr=new int[size];
this.front=0;
this.rear=-1;
this.length=0;
}

public void enqueue(int value) 
{
if(isFull()) 
{
System.out.println("Queue Overflow!");
return;
}
rear=rear+1;
arr[rear]=value;
length++;
}

public int dequeue() 
{
if(isEmpty()) 
{
System.out.println("Queue Underflow!");
return -1;
}
int deleted=arr[front];
front=front+1;
length--;
return deleted;
}
public int peek() 
{
if(isEmpty()) 
{
System.out.println("Queue is empty");
return -1;
}
return arr[front];
}

public void display() 
{
if (isEmpty()) 
{
System.out.println("Queue is empty.");
return;
}
System.out.println("Queue: ");
for(int i=0; i<length; i++) 
{
System.out.print(arr[(front+i)%size]+" ");
}
System.out.println();
}

private boolean isEmpty() 
{
return length==0;
}
private boolean isFull() 
{
return length==size;
}
public static void main(String[] args) 
{
Scanner scanner=new Scanner(System.in);
System.out.print("Enter queue size: ");
int len=scanner.nextInt();
Queue Q=new Queue(len);

while(true) 
{
System.out.println("\nChoose:");
System.out.println("1. Enqueue");
System.out.println("2. Dequeue");
System.out.println("3. Peek");
System.out.println("4. Display");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
int choice=scanner.nextInt();
switch(choice) 
{
case 1:
System.out.print("Enter value to put: ");
int value=scanner.nextInt();
Q.enqueue(value);
break;
case 2:
int deleted=Q.dequeue();
if (deleted!=-1)
{
System.out.println("Dequeued: "+deleted);
}
break;
case 3:
int frontValue=Q.peek();
if(frontValue!=-1) 
{
System.out.println("Front element: "+frontValue);
}
break;
case 4:
Q.display();
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
