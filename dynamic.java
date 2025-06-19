class Student{
    void showDetails(){
        System.out.println("Student details");}}
class Engineeringstudent extends Student{
    void showDetails(){
        System.out.println("Engineering Major: Studies Physics, Mathematics and Computer Science");}}
class Humanitiesstudent extends Student{
    void showDetails(){
        System.out.println("Humanities Major: Studies Geography, Political Science, History.");}}
public class dynamic {
    public static void main(String[] args) {
        Student student;
        student=new Engineeringstudent();
        student.showDetails();
        student=new Humanitiesstudent();
        student.showDetails();}}
