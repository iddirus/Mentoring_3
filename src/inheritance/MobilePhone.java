package inheritance;

public class MobilePhone {
    // create variable / properties of mobile phone class

    public int mobilePhonePrice=1000;
    public String mobilePhoneColor="Black";
    public String mobilePhoneScreenResolution="1000 pixel";

    private String mobilePhoneRam;


    // methods
    public void camera(){
        System.out.println("mobile phone has a camera");
    }
    public void clearDisplay(){
        System.out.println("mobile phone has a clear Display feature");
    }
    public void waterResistance(){
        System.out.println("mobile phone has a water Resistance feature");
    }

    // constructor


    public MobilePhone() {
    }

    public MobilePhone(int mobilePhonePrice) {
        this.mobilePhonePrice = mobilePhonePrice;
    }

    public MobilePhone(int mobilePhonePrice, String mobilePhoneColor, String mobilePhoneScreenResolution, String mobilePhoneRam) {
        this.mobilePhonePrice = mobilePhonePrice;
        this.mobilePhoneColor = mobilePhoneColor;
        this.mobilePhoneScreenResolution = mobilePhoneScreenResolution;
        this.mobilePhoneRam = mobilePhoneRam;
    }

    // getter and setter methods


    public String getMobilePhoneRam() {
        return mobilePhoneRam;
    }

    public void setMobilePhoneRam(String mobilePhoneRam) {
        this.mobilePhoneRam = mobilePhoneRam;
    }
}
