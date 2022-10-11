package zadania;

//odwrócić elementy w tablicy

public class Tablica_zadanie {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,3,5,7,9};

        for (int i=0; i<(numbers.length/2); i++) {
            //tworzymy zmienną tymczasową
            int temp = numbers[i]; //dla i=0
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        //pętla do wypisania tablicy
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
