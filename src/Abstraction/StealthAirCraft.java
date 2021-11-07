package Abstraction;

public abstract class StealthAirCraft {

    // abstract class in not fully abstract unlike Interface
    // we can declare variable and declare variable and assign value
    // we can declare methods with and without body

    String stealthAirCrafType;
    String stealthAirCraftPrice="2000000101";

    // create method
    public abstract void highSpeed();
    public abstract void invisibilityToRadar();
    public abstract void survellianceCamera();
    public abstract void autoPilot();


    public void infrared(){
        System.out.println("StealthAirCraft has infrared feature");
    }




}
