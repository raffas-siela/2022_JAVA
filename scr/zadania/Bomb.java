package zadania;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią. Następnie wyświetl na ekranie Odliczanie z tekstem "Bomba wybuchnie za ... "
        gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0. Napisz program w 3 wersjach przy użyciu różnych pętli.
*/


public class Bomb {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj czas do odliczania");
        int timeToDeath = scanner.nextInt();
        int clock;

        if (timeToDeath > 0) {
            System.out.println("zaczynamy odliczanie!!!! Run Forest!!! Run!!!!");
            for(clock=timeToDeath; clock>0; clock--) {
                System.out.println("pozostało czasu: " + clock);
            }
        } else {
            System.out.println("Podałeś złą liczbę. GAME OVER!!!");
        }
        System.out.println("The End!!! ");
    }
}*/

/*
    public static void main(String[] args){
        Scanner odczyt = new Scanner(System.in);
        int zegar;

        System.out.println("Podaj czas bomby: ");
        zegar = odczyt.nextInt();

        //wersja z while
        while(zegar>0){
            System.out.println("Bomba wybuchnie za "+zegar);
            zegar--;
        }
        System.out.println("BUM!");
    }
}*/


    public static void main(String[] args){
        Scanner odczyt = new Scanner(System.in);
        int zegar;

        System.out.println("Podaj czas bomby: ");
        zegar = odczyt.nextInt();

        //wersja z do...while
        do{
            System.out.println("Bomba wybuchnie za "+zegar);
            zegar--;
        }
        while(zegar>0);
        System.out.println("BUM!");
    }
}