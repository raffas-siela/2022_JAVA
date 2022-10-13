package ObiektyJava.Vehicles;

// aby wymusić aby klasa dostarczyła implementację do interfejsu uzywamy: implements nazwa_interface
// kod podkreśli się na czerwono, wtedy alt+ENTER

public class Bike implements Vehicle {
    @Override
    public void go(int speed) {
        System.out.println("jadę rowerem z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuję rowerem");
    }

    @Override
    public String info() {
        return "rower";
    }
}
