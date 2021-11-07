package polymorphism.methodoverriding;

public class Boeing extends Concorde implements Plane{
    @Override
    public void superSonicSpeed(){
        System.out.println("Boeing has super sonic speed feature");
    }

    @Override
    public void planeCockOit() {

    }

    @Override
    public void planeRudder() {

    }

    @Override
    public void planeEngine() {

    }

    @Override
    public void planeFuselage() {

    }
}
