package inheritance;

public class Sony extends Android {

    public int sonyPhonePrice=900;
    public String sonyPhoneColor="blue";
    public String sonyPhoneScreenResolution="2000 pixel";

    private String sonyPhoneRam;

    public void battery(){
        System.out.println("sony phone has a battery");
    }
    public void processor(){
        System.out.println("sony phone has a processor");
    }

    public void largeDisplay(){
        System.out.println("sony phone has largeDisplay");

    }

    // constructor

    public Sony() {
    }

    public Sony(int sonyPhonePrice) {
        this.sonyPhonePrice = sonyPhonePrice;
    }

    public Sony(int sonyPhonePrice, String sonyPhoneColor, String sonyPhoneScreenResolution, String sonyPhoneRam) {
        this.sonyPhonePrice = sonyPhonePrice;
        this.sonyPhoneColor = sonyPhoneColor;
        this.sonyPhoneScreenResolution = sonyPhoneScreenResolution;
        this.sonyPhoneRam = sonyPhoneRam;
    }

    // getter and setter


    public String getSonyPhoneRam() {
        return sonyPhoneRam;
    }

    public void setSonyPhoneRam(String sonyPhoneRam) {
        this.sonyPhoneRam = sonyPhoneRam;
    }
}
