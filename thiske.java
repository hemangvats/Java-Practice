public class thiske {
String name;
int roll_no;
thiske() 
{
this("Hemang",1);
}
thiske(String name,int roll_no) 
{
this.name=name;
this.roll_no=roll_no;
}

void display() 
{
System.out.println("Roll No.: "+this.roll_no+"\nName: "+this.name);
}
public static void main(String[] args) 
{
thiske s1=new thiske();
s1.display();
thiske s2=new thiske("Sahitya",2);
s2.display();
thiske s3 = new thiske("Manmeet",3);
s3.display();
}
}
