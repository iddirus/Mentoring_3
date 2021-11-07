package polymorphism.methodoverloading;

public class Test {

    public static void main(String[] args) {
        Calculator.doMultiplication(12,10);
        Calculator.doMultiplication(2,5,45);
        Calculator calculator = new Calculator();
        calculator.employeeInfo();
        calculator.employeeInfo("James");
        calculator.employeeInfo("Iddir","Hadjal");
    }



}
