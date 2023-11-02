package miniProject;

import java.util.Scanner;

public class Guessno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100);
        int guess = 0, attempt = 0;
        while (num >= 0) {
            System.out.println("Guess my number");
            guess = sc.nextInt();

            if (num == guess) {
                ++attempt;

                break;
            } else if (num > guess) {
                System.out.println("Your number is bigger than " + guess);
                ++attempt;

            } else {
                System.out.println("Your number is smaller than " + guess);
                ++attempt;
            }
        }
        System.out.println("My number was " + num);
        System.out.println("Your number is " + guess);
        System.out.println("You have guessed correctly and in " + attempt + "th attempt");

    }

}
