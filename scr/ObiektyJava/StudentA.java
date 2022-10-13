package ObiektyJava;

public class StudentA {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int nrIndeksu;
    public static String nazwaUczelni = "AGH";

    public void przedstawSie() {
        System.out.println("nazywam się: " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("loguję sięza pomocą: " + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("mój numer indeksu to: " + nrIndeksu);
    }

    public void podajEmail() {
        System.out.println("mój email to: " + email);
    }
}
