package ObiektyJava.Vehicles;

public class Truck implements Vehicle {
    @Override
    public void go(int speed) {
        System.out.println("jadę ciężarówką z prędkością" + speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuję ciężarówką");
    }

    @Override
    public String info() {
        return "ciężąrówka";
    }

    public void zatankuj(){
        System.out.println("aby mieć dużo siły musze zjeśc obiad");
    }
}
