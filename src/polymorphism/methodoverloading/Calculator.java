package polymorphism.methodoverloading;

public class Calculator {

    // method
    public static void doMultiplication(int num1,int num2){
        int output = num1*num2;
        System.out.println("output is "+output);
    }

    public static void doMultiplication(int num1,int num2,int num3){
        int output = num1*num2*num3;
        System.out.println("output is "+output);
    }

    public void employeeInfo(){
        System.out.println("this is employee info no parameterized method");
    }
    public void employeeInfo(String firstName){
        System.out.println("employee first name is "+firstName);
    }
    public void employeeInfo(String firstName,String lastName){
        System.out.println("employee first name is "+firstName+ " "+ " employee last name is "+lastName);
    }






}
