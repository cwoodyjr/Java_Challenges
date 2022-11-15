package DoubleOrNothing;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    private static int startPoints = 20;
    private int current = startPoints;

    private Scanner scanner = new Scanner(System.in);

    private Random random = new Random();
    private boolean isStillPlaying = true;

    public void playGame() {
        printWelcome();
        askUserToContinue();
        while (this.isStillPlaying){
            if (shouldDouble()){
                doubleCurrent();
                printWin();
                askUserToContinue();
            }else{
                youLost();
                return;

            }


        }
        walkAway();
    }

    private void walkAway() {
        System.out.println("Thanks for playing, your final score is "+this.current);
    }

    private void printWin() {
        System.out.println("Congrats, your new score is now " +this.current);
    }

    private void youLost() {
        System.out.println("you lost " +
                "no Points for you this time " +
                "thanks for playing!!");
    }

    private void doubleCurrent() {
        this.current = current * 2;
    }

    private boolean shouldDouble() {
        return this.random.nextInt(2)==0;
    }

    private void printWelcome() {
        System.out.println("Let's play Double or Nothing. " +
                "We'll start you off with " + startPoints +
                " points\n");
    }
    private void askUserToContinue() {
        System.out.println("Would you like to continue " +
                "and try to double your winnings? " +
                "Enter YES to continue");
        this.isStillPlaying = this.scanner.nextLine()
                .toUpperCase().equals("YES");
    }

}
