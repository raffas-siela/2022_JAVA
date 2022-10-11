package PodsatawyJava;
// pobieranie danych od użytkownika

import java.util.Scanner;

public class CustomScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");
    }
}
