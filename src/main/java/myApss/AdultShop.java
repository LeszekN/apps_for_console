package myApss;

import java.util.Scanner;

public class AdultShop {
    public static void main(String[] args) {

        System.out.println("Hello, this is our new shop. What is your name? Write down below:");
        Scanner newObj = new Scanner(System.in);
        String name = newObj.nextLine();
        System.out.println("Hello " + name + " :) How old are you?");
        int age = newObj.nextInt();
        if (age >= 18) {
            System.out.println(name + ", you are adult, so you can start shopping:)");
        } else {
            System.out.println(name + ", we are sorry, you are teenager, please come back to us, as adult:)");

            newObj.close();
        }
    }
}
