package myApss;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("Witaj na naszym stoisku. Na dzień dobry mamy dla Ciebie upominek." +
                "Wpisz poniżej cyfrę od 1 do 6 i naciśnij Enter: ");
        Scanner number = new Scanner(System.in);
        int gift = number.nextInt();

        if (gift >= 1 && gift <= 2) {
            System.out.println("Jako upominek wylosowałeś długopis :)");
        } else if (gift >= 3 && gift <= 4) {
            System.out.println("Jako upominek wylosowałeś brelok na klucze :)");
        } else if (gift >= 5 && gift <= 6) {
            System.out.println("Jako upominek wylosowałeś notes :)");
        } else  {
            System.out.println("Tej liczby nie mamy w loterii. Zacznij zabawę od nowa:)");
        }
    }
}
