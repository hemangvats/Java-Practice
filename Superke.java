class Vehicle 
{
int max_speed=120;
}
class Car extends Vehicle 
{
int max_speed=180;
void display() 
{
System.out.println("Maximum Speed: "+super.max_speed);
}
}
public class Superke {
    public static void main(String[] args) 
{
Car c1=new Car();
c1.display();
}
}

