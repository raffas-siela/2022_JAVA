package ObiektyJava;

public class Uczniowie {
    public String imie;
    public String nazwisko;
    public int wiek;



    public void przedstawSie(){
        System.out.println("mam na imię " + imie + " nazywam się " + nazwisko);
    }
    public void ileLat(){
        System.out.println("mam " + wiek + " lat");
    }
    public void zajecie(){
        System.out.println("jadę na motorze");
    }
}
