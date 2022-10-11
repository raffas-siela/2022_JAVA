package PodsatawyJava;
//najpierw kod się wykonuje,
//a następnie przechodzi do pętli
//konsekwencja jest taka, że 1 raz zawsze się wykona

public class LoopDoWhile {
    public static void main(String[] args) {
        int number = 5;
        do {
            System.out.println("moja wartośc to: " + number + " i jestem mniejszy od 20");
        number++;
        }
        while (number <= 20);
        }
    }
