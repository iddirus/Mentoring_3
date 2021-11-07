package polymorphism.methodoverriding;

public class Test {
    public static void main(String[] args) {
        Jet jet = new Jet();
        jet.superSonicSpeed();
        Boeing boeing = new Boeing();
        boeing.superSonicSpeed();
    }

}
