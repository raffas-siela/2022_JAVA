package ObiektyJava;

public class Auto {
    //definiujemy pola klasy
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    //tworzymy metodę
    public void jedz() {
        System.out.println("Jedź");
    }

    public void hamuj() {
        System.out.println("Hamuj");
    }

    public void info() {
        System.out.println("marka: " + marka);
        System.out.println("model: " + model);
        System.out.println("rok: " + rok);
        System.out.println("przebieg: " + przebieg);
    }
}
