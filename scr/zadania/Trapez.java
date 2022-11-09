package zadania;

public class Trapez {
    public static void main(String[] args) {
        double poleTrapezuPierwszego = obliczPoleTrapezu(6, 8, 10);
        double poleTrapezuDrugiego = obliczPoleTrapezu (2, 4, 6);
        double poleTrapezuTrzeciego = obliczPoleTrapezu(3, 6, 9);
        String wynbik = "pola trapezów to: " + poleTrapezuPierwszego + poleTrapezuDrugiego + poleTrapezuTrzeciego;
        wypiszKoniec();

    }

    static double obliczPoleTrapezu(double pierwszaPodstawa, double drugaPodsatwa, double wysokość) {
        double poleTrapezu = ((pierwszaPodstawa + drugaPodsatwa) * wysokość) / 2;
        return poleTrapezu;
    }

    static void wypiszKoniec() {
        System.out.println("koniec");
    }
}