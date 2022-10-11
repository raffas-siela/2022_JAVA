import java.util.Scanner;

public class CustomScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("kwadrat tej liczby to: " + result);
// inny zapis
        //System.out.println("kwadrat tej liczny to: " + firstNumber*firstNumber);

    }
}
