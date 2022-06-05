package myApss;

import java.util.Scanner;

public class ContainsWord {
    //sprawdza czy w napisane zdanie zawiera wcześniej zdefiniowane słowo, w tym przypadku "kot".
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Napisz poniżej zdanie lub wyraz zawierający w sobie słowo 'kot', po czym naciśnij Enter");
        String giveWord = word.nextLine();

        if (giveWord.contains("kot")) {
            System.out.println("Tak:) w Twoim wyrażeniu zawiera się słowo 'kot'. ");
        } else {
            System.out.println("Nie:( w Twoim wyrażeniu zawiera się słowo 'kot'. ");

            word.close();
        }
    }
}
