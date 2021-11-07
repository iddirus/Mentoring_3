package encapsulation;

public class StudentInfo {
    // declare variable
    public int stId;

    private String stName;
    private String StAddress;
    private int phoneNumber;
    private double courseFee;

    // create constructor
    public StudentInfo(){// default

    }

    public StudentInfo(int stId) {
        this.stId = stId;
    }

    public StudentInfo(int stId, String stName) {
        this.stId = stId;
        this.stName = stName;
    }

    public StudentInfo(int stId, String stName, String stAddress, int phoneNumber, double courseFee) {
        this.stId = stId;
        this.stName = stName;
        StAddress = stAddress;
        this.phoneNumber = phoneNumber;
        this.courseFee = courseFee;
    }

    // getter and setter methods

    // 1. getter method: return type used to get the value
    public String getStName(){
        return stName;
    }
    // 2. setter method: non return type used to set the value
    public void setStName(String stName){
        this.stName=stName;
    }

    public String getStAddress() {
        return StAddress;
    }

    public void setStAddress(String stAddress) {
        StAddress = stAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
}
