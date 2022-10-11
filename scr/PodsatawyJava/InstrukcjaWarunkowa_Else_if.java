package PodsatawyJava;// jest podobna do if else, ale pozwala sprawdzać kilka warunków

public class InstrukcjaWarunkowa_Else_if {
    public static void main(String[] args) {
        int number = 11;

        if(number == 0) {
            System.out.println("liczba równa zero");
        } else if (number > 0) {
            System.out.println("liczba dodatnia");
        } else if (number>10) {
            System.out.println("liczba większa od 10");
        } else if (number < -10) {
            System.out.println("liczba mniejsza od -10");
        } else {
            System.out.println("żaden warunek nie został spełniony ");
        }
    }
}

// jeśli jakiśwarunek zostanie spełniony, nie są sprawdzane pozostałe warunki
// np zadanie: podaj dzień tygodnia a program przywita cięw każdy dzień innym tekstem