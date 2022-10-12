package ObiektyJava;

//chcemy aby ta wartość, do której pętla się wykonuje była bardziej elastyczna
//będzie podawana przez uruchamiajacego metodę

public class MetodyParametr {
    //wewnątrz nawiasu podajmy wartość, najpierw typ danych a nastepnie nazwa
    //obiekt tworzymy w MetodyParamrtTest
    public void  policzWynikParam(int number) {
        System.out.println("Number ma wartość: " + number);
        System.out.println("zaraz policzę wynik");
        int result = 0;
        //teraz możemy użyć "number" w pętli for
        // ale "number "
        for (int i=0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Resultat to: " + result);
    }

    public void add(int firstNumber, int secondNumber) {
        //możemy zamiast i zmienić nazwy
        // i wypisujemy na ekranie
        System.out.println("Suma tych liczb to: " + (firstNumber+secondNumber));
    }
}
