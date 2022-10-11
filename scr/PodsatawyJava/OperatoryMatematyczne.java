package PodsatawyJava;

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
// dodajemy trzecią zmienną, bo mamy problem z wyniiem dzielnia. wynik dzielenia jest z przecinkiem
        float thirdNUmber = 4.0F;

        int addition = firstNumber + secondNumber; // 10
        int substaration = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; //24
// tu zmieniamy też zmienną
        float division = thirdNUmber/secondNumber; // 0,66
        int modulo = secondNumber%firstNumber; // 4 mieści się w 6 = 1,2

        System.out.println("wynik dodania = " + addition);
        System.out.println("wynik odejmowania = " + substaration);
        System.out.println("wynik mnożenia = " + multiplication);
// przy dzieleniu pojawia się problem, wynik zero. wynika to z bładne jzmiennej przypisdanej do tego działania.
        System.out.println("wynik dzielenia = " + division);
        System.out.println("wynik modulo = " + modulo);
    }
}
