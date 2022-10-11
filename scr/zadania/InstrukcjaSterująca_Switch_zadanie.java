package zadania;// podaj 3 potrawy d owyboru
//poproś usera o podanie potrawy
// podaj cenę


import java.util.Scanner;

public class InstrukcjaSterująca_Switch_zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mamy do wyboru: pizza, frytki, bigos. co wybierasz?");
        String foodOrder = scanner.nextLine();

        String food = foodOrder;
        switch (food) {
            case "pizza":
                System.out.println("pizza kosztuje 22 zł");
                break;
            case "frytki":
                System.out.println("frytki kosztują 12 zł");
                break;
            case "bigos":
                System.out.println("bigos kosztuje 42 zł");
                break;
            default:
                System.out.println("nic innego nie ma");
        }
    }
}

// dodajemy break, bo inaczej sprawdzone byłyby wszystkie warunki