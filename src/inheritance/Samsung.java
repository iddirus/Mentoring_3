package inheritance;

public class Samsung extends Android{

    public int samsungPhonePrice=1500;
    public String samsungPhoneColor="White";
    public String samsungPhoneScreenResolution="1500 pixel";

    private String samsungPhoneRam;

    // methods

    public void bluetooth(){
        System.out.println("samsung phone has a bluetooth");
    }
    public void fingerPrintLock(){
        System.out.println("samsung phone has a fingerPrintLock");
    }
    public void runAppsAtOnce(){
        System.out.println("samsung phone has runAppsAtOnce");
    }

    // constructor


    public Samsung() {
    }

    public Samsung(int samsungPhonePrice) {
        this.samsungPhonePrice = samsungPhonePrice;
    }

    public Samsung(int samsungPhonePrice, String samsungPhoneColor, String samsungPhoneScreenResolution, String samsungPhoneRam) {
        this.samsungPhonePrice = samsungPhonePrice;
        this.samsungPhoneColor = samsungPhoneColor;
        this.samsungPhoneScreenResolution = samsungPhoneScreenResolution;
        this.samsungPhoneRam = samsungPhoneRam;
    }

    // getter and setter

    public String getSamsungPhoneRam() {
        return samsungPhoneRam;
    }

    public void setSamsungPhoneRam(String samsungPhoneRam) {
        this.samsungPhoneRam = samsungPhoneRam;
    }

}
