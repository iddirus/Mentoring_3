package inheritance;

public class Android extends MobilePhone {

    public int androidPhonePrice=1200;
    public String androidPhoneColor="Silver";
    public String androidPhoneScreenResolution="900 pixel";

    private String androidPhoneRam;

    // methods
    public void touchControl(){
        System.out.println("android phone has a touch Control");
    }
    public void connectivity(){
        System.out.println("android phone has a connectivity feature");
    }
    public void storage(){
        System.out.println("android phone has storage feature");
    }

    // constructor


    public Android() {
    }

    public Android(int androidPhonePrice) {
        this.androidPhonePrice = androidPhonePrice;
    }

    public Android(int androidPhonePrice, String androidPhoneColor, String androidPhoneScreenResolution, String androidPhoneRam) {
        this.androidPhonePrice = androidPhonePrice;
        this.androidPhoneColor = androidPhoneColor;
        this.androidPhoneScreenResolution = androidPhoneScreenResolution;
        this.androidPhoneRam = androidPhoneRam;
    }

    // getter and setter

    public String getAndroidPhoneRam() {
        return androidPhoneRam;
    }

    public void setAndroidPhoneRam(String androidPhoneRam) {
        this.androidPhoneRam = androidPhoneRam;
    }
}
