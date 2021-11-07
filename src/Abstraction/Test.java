package Abstraction;

public class Test {
    public static void main(String[] args) {
        GeneralElectric generalElectric =new GeneralElectric();
        generalElectric.planeCockOit();
        generalElectric.planeEngine();

        Airbus airbus = new Airbus();
        airbus.planeRudder();
        airbus.superSonic();

    }

}
