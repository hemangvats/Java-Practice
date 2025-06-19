import java.util.Scanner;

class grading {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n=s.nextInt();
        float sumup=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter marks outoff 100:");
            float a=s.nextFloat();
            sumup=sumup+a;
        }
        System.out.println("The sum of marks is:"+sumup);
        float average=sumup/n;
        System.out.println("Average marks of student:"+average);
        System.out.println("Percentage of student:"+average+"%");
        if(average>74){
            System.out.println("The garde obtained by the student is A");
        }
        else if((average>64) && (average<75)){
            System.out.println("The garde obtained by the student is B");
        }
        else if((average>54) && (average<65)){
            System.out.println("The garde obtained by the student is C");
        }
        else if((average>40) && (average<55)){
            System.out.println("The garde obtained by the student is D");
        }
        else{
            System.out.println("The garde obtained by the student is FAIL");
        }
    }
}
