package encapsulation;

public class Test {

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.stId=100;
        System.out.println("student id is "+studentInfo.stId);
        studentInfo.setStName("James");
        System.out.println("student name is "+studentInfo.getStName());
        studentInfo.setStAddress("NJ");
        System.out.println("student address is "+studentInfo.getStAddress());
        studentInfo.setCourseFee(3500.50);
        System.out.println("student course fee is "+studentInfo.getCourseFee());


    }
}
