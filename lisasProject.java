package controlflowproject;

import java.util.Scanner;
//always import when taking user input

import java.util.Random;
//generates random numbers

// public class AsciiChars {
//     public static void printNumbers() {
//         // print valid numeric input
//     }

//     public static void printLowerCase() {
//         // print valid lowercase alphabetic input
//     }

//     public static void printUpperCase() {
//         // print valid uppercase alphabetic input
//     }
// }

public class lisasProject {
    public static void main(String[] args) {

    private void playGame() {

        Scanner scanner = new Scanner(System.in);
        // setting variable to user (keyboard) input

        Random rand = new Random();
        // create instance of random

        int rand_int1 = rand.nextInt(75);
        int rand_int2 = rand.nextInt(65);
        int rand_int3 = rand.nextInt(65);
        // random integers with limits

        System.out.print("What is your name? ");

        String name = scanner.next();
        // setting keyboard input to usable variable

        System.out.printf("%s, would you like to complete a survey? (Y/N) ", name);

        char ansSurvey = scanner.next().charAt(0);

        String ans = "";
        switch (ansSurvey) {
            case 'Y':
            case 'y':
                ans = "Great! I will gather some info from you and in return, will generate your pontential winning Powerball numbers.";
                break;

            case 'N':
            case 'n':
                System.out.print("Please come back when you are ready to complete the survey.");
                scanner.close();
                return;
            // use return to exit program sequence here
        }

        System.out.printf("%s ", ans);

        System.out.printf("\n%s, do you have a red car? (Y/N) ", name);

        char ansCar = scanner.next().charAt(0);

        System.out.printf("%s, what is the name of your favorite pet? ", name);

        String petFav = scanner.next();

        System.out.printf("%s, what is the age of your favorite pet? ", name);

        int petAge = scanner.nextInt();

        System.out.printf("%s, what is your lucky number? ", name);

        int luckyNum = scanner.nextInt();

        System.out.printf("%s, do you have a favorite quarterback? (Y/N) ", name);

        char quarterB = scanner.next().charAt(0);

        switch (quarterB) {
            case 'Y':
            case 'y':
                System.out.print("Great! What is their jersey number? ");
                break;
            case 'N':
            case 'n':
                System.out.print("No worries!\nWhat is the two-digit model year of your car? ");
                break;
        }

        int ansQC = scanner.nextInt();
        // this only work because both questions have an integer answer

        System.out.printf("%s, what is the first name of your favorite actor/actress? ", name);

        String act = scanner.next();

        System.out.printf("%s, almost done!\nPick a number between 1 and 50. ", name);

        int randNum = scanner.nextInt();

        int magicBall = ansQC + rand_int1;

        if (magicBall > 75) {
            magicBall = magicBall - 75;
        }
        ;

        char favPet = petFav.charAt(2);
        int charPet = favPet;

        if (charPet > 65) {
            charPet = charPet - 65;
        }
        ;

        int randFifty = randNum + rand_int2;

        if (randFifty > 65) {
            randFifty = randFifty - 65;
        }
        ;

        char favAct = act.charAt(0);
        int charAct = favAct;

        if (charAct > 65) {
            charAct = charAct - 65;
        }
        ;

        int val = rand_int3;

        int petCarQB = petAge + ansQC;

        if (petCarQB > 65) {
            petCarQB = petCarQB - 65;
        }
        ;

        System.out.printf("Okay %s, I have your lottery numbers ready!", name);

        System.out.printf("\nLottery numbers: %s, %s, %s, %s, %s Magic ball: %s", charPet, randFifty, charAct, val,
                petCarQB, magicBall);

        System.out.printf("%s, would you like to play again? (Y/N) ");

        char ansPlayAgain = scanner.next().charAt(0);

        String playAgain = "";
        switch (ansPlayAgain) {
            case 'Y':
            case 'y':
                System.out.print("Great! Let's start at the top");
                break;

            case 'N':
            case 'n':
                System.out.print("Thank you for playing, please come again!");
                return;
            // use return to exit program sequence here
        }

        scanner.close();

    }

}