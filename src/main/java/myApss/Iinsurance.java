package myApss;

import java.util.Scanner;

public class Iinsurance {
    public static void main(String[] args) {

        System.out.println("Witaj w naszej firmie ubezpieczeniowej. Wpisz poniżej imię i naciśnij Enter:");
        Scanner insure = new Scanner(System.in);
        String name = insure.nextLine();
        System.out.println("Witaj " + name + ". Sprawdźmy, czy możemy udzielić Ci zniżki na ubezpieczenie auta. " +
                "Napisz poniżej ile lat masz prawo jazdy i naciśnij Enter:");
        int age = insure.nextInt();
        if (age >= 0 && age < 4) {
            System.out.println(name + " przykro nam, nie możemy udzielić zniżki.");
        } else if (age >= 4 && age < 8) {
            System.out.println(name + " otrzymujesz 10% zniżki na ubezpieczenie. Zadzwoń 777-888-999");
        } else if (age >= 8 && age < 15) {
            System.out.println(name + " otrzymujesz 25% zniżki na ubezpieceznie. Zadzwoń 777-888-999");
        } else if (age >= 15 && age < 65) {
            System.out.println(name + " otrzymujesz 35% zniżki na ubezpieceznie. Zadzwoń 777-888-999");
        } else {
            System.out.println("Sprawdź czy podałeś poprawą wartość lub zadzwoń na naszą infolinie 777-888-999");

            insure.close();
        }

    }


}
