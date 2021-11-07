package inheritance;

public class Test {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        System.out.println(mobilePhone.mobilePhoneColor);
        mobilePhone.camera();
        mobilePhone.clearDisplay();
        Android android = new Android();
        android.waterResistance();
        android.connectivity();
        android.touchControl();

        // object of samsung
        Samsung samsung = new Samsung();
        samsung.camera();
        samsung.storage();
        samsung.bluetooth();


        // sony object
        Sony sony = new Sony();
        sony.clearDisplay();
        sony.touchControl();
        sony.processor();
    }
}
