package myApss;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Wpisz poniżej dowolną liczbę całkowitą i naciśnij Enter:");
        Scanner number = new Scanner(System.in);
        int evenNum = number.nextInt();

        if (evenNum % 2 == 0) {
            System.out.println("Podana przez Ciebie liczba " + evenNum + " jest parzysta.");
        } else {
            System.out.println("Podana przez Ciebie liczba " + evenNum + " jest nieparzysta.");

            number.close();
        }
    }
}
