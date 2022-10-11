public class OperatoryLogiczne {
    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

// operator logiczny "i"
// zwróci wartośc TRUE, gdy wyrażenia składowe są równe true
// wszystkie warunki muszą być prawdziwe, aby całe wyrażenie było prawdą
        System.out.println("&&");
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(secondValue && thirdValue);

// operator logiczny "lub"
// zwróci wartość TRUE gdy jedno wyrazenie składowe jest true
// Czyli wystarczy, aby choć jeden warunek był spełniony, aby całe wyrażenie było prawdą.
        System.out.println("||");
        System.out.println(firstValue || secondValue);
        System.out.println(firstValue || fourthValue);
        System.out.println(secondValue || thirdValue);

// opertor logiczny "negacja"
// zwraca wartość przeciwną, do wyrażenia przed którym się znajduje
// Operator negacji jest stosowany do zanegowania czyli „odwrócenia” wartości logicznej.
// Prosty przykład: stosując negację na prawdę otrzymujemy zawsze fałsz. I vice versa.
        System.out.println("!");
        System.out.println(!firstValue); // true;
        System.out.println(!secondValue); // false;
        System.out.println(!thirdValue); // false;
        System.out.println(!fourthValue); // true;
// możemy negację stosowac do operatorów
        System.out.println("&&");
        System.out.println(!(firstValue && secondValue));
        System.out.println(!(firstValue && fourthValue));
        System.out.println(!(secondValue && thirdValue));
    }
}
