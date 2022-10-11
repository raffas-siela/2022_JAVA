
// inrementacja - zwiększenie wartości o 1
// dekrementacja - zmniejszenie wartości o 1


public class InkrementacjaDekrementacja {
    public static void main(String[] args) {

// INKREMENTACJA
        int a = 0;
        System.out.println("watośc a: " + a); //wartośc = 0
//postinkrementacja
        //najpierw następuje przypisaniue starej waertości czyli 0,
        int b = a++;
        System.out.println("postinkrementacja");
        System.out.println("wartość a: " + a); //wartośc a wzrośnie o 1
        System.out.println("wartość b: " + b); //wartośc b nie zmieni się w postinkrementacji i będze 0
        //bo najpierw przypisujemy zmiennej b wartość a, a potem dopiero przypisujemy a wartośc o 1 większą

// preinkrementacja
        //najpierw zwiększamy wartośc zmiennej a, potem przypisujemy wartośc a do wartości c
        int c = ++a;
        System.out.println("preinkrementacja");
        //postinkrtemetacja a = 1 plius preinkremetacja więc 2, i dopiero przypisanie do c, więc c = 2
        System.out.println("wartość c: " + c);
        //w tym momencie wartośc a jest równe 1 (postinkrementacja) do tego postinkrementacja, wiec a = 2
        System.out.println("wartość a: " + a);

// DEKREMENTACJA
        int d = 0;
        System.out.println("wartośc d: " + d);
// postdekrementacja
        int e = d--;
        System.out.println("predekrementacja");
        System.out.println("wartość d:" + d);
        System.out.println("wartość e: " + e);
//predekrementacja
        int f = --d;
        System.out.println("postdekrementacja");
        System.out.println("wartość d:" + d);
        System.out.println("wartość f: " + f);

    }
}
