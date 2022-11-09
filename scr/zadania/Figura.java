package zadania;

public class Figura {
    public static void main(String[] args) {
        double poleTrapezuPierwszego = obliczPoleTrapezu(8,10, 5);
        System.out.println("pole trapezu pierwszego wynosi: " + poleTrapezuPierwszego);
        koniecTestu();
        zwróćKoniec();
        System.out.println("drukowany: " + zwróćKoniec());
    }
    static double obliczPoleTrapezu(double podstawaPiersza, double podstawaDruga, double wysokość){
        double poleTrapezu = ((podstawaPiersza + podstawaDruga) * wysokość)/2;
        return poleTrapezu;
    }
    static void koniecTestu(){
        System.out.println("koniec testu");
    }
    static String zwróćKoniec(){
        return "koniec z metody";
    }

}


