public class OperatoryPorównania {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = firstNumber > secondNumber;
        System.out.println("czy pierwsza liczba jest większa od drugiej?");
        System.out.println(result);
// inny sposób
        System.out.println("czy pierwsza liczba jest większa od drugiej?");
        System.out.println(firstNumber>secondNumber);

// uproszczenie zapisu
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber); // większe bądź równe
        System.out.println(firstNumber <= secondNumber); // mniejsze bądź równe
        System.out.println(firstNumber == secondNumber); // równe
        System.out.println(firstNumber != secondNumber); // różne

    }
}
