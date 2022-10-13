package ObiektyJava.Vehicles;

public class VehiclesTest {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.go(2);
        bike.stop();
        bike.info();

        Truck truck = new Truck();
        truck.go(30);
        truck.stop();
        truck.zatankuj();
    }
}
