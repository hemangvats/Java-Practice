abstract class Shape{
    abstract int numberofsides();}
class Trapezoid extends Shape{
    int numberodsides(){
        return 4;}}
class Triangle extends Shape{
    int numberodsides(){
        return 3;}}
class Rectangle extends Shape{
    int numberodsides(){
        return 4;}}
class Hexagon extends Shape{
    int numberodsides(){
        return 6;}}
class geometric{
    public static void main(String[] args) {
        Shape[]shapes={new Trapezoid(),new Triangle(),new Rectangle(),new Hexagon()};
        for(Shape shape:shapes){
            System.out.println(shape.getClass().getSimpleName()+" has "+shape.numberofsides()+" sides.");}}}