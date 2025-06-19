class con {

    public con() {
        System.out.println("Default constructor");
    }
    public con(int a){
        System.out.println("Parametrized constructor");
    }
}
class constructors{
    public static void main(String[] args) {
        con object=new con();
        con object1=new con(4);
    }
}
