package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare
        Scanner keyboard;
        String PlayerChoice;
        Integer ComputerNumber;
        String ComputerChoice;
        String[] Options;
        boolean runAgain = false;


        //initialize
        keyboard = new Scanner(System.in);

        while (runAgain == false) {

            boolean win = false;
            int score = 0;


            System.out.println("Welcome to rock, paper, scissors! Try to reach 3 points!");
            while (win == false) {
                System.out.println("Go ahead and put your choice in. rock, paper, or scissors?");
                PlayerChoice = keyboard.nextLine();

                Options = new String[3];
                Options[0] = "rock";
                Options[1] = "paper";
                Options[2] = "scissors";

                ComputerChoice = Options[(int) (Math.random() * Options.length)];

                if (PlayerChoice.equals(ComputerChoice)) {
                    System.out.println("It's a tie!");
                } else if (PlayerChoice.equals("rock")) {
                    if (ComputerChoice.equals("scissors")) {
                        System.out.println("Rock beats scissors, You win!");
                        score++;
                    }
                    if (ComputerChoice.equals("paper"))
                        System.out.println("Paper beats rock, You lose.");
                } else if (PlayerChoice.equals("paper")) {
                    if (ComputerChoice.equals("scissors"))
                        System.out.println("Scissor beats paper, You lose.");
                    else if (ComputerChoice.equals("rock")) {
                        System.out.println("Paper beats rock, You win!");
                        score++;
                    }
                } else if (PlayerChoice.equals("scissors")) {
                    if (ComputerChoice.equals("paper")) {
                        System.out.println("Scissor beats paper, You win!");
                        score++;
                    } else if (ComputerChoice.equals("rock"))
                        System.out.println("Rock beats scissors, You lose.");
                } else
                    System.out.println("Invalid user input, try again.");
                System.out.println("Your score is " + score + ".");

                if (score == 3) {
                    win = true;
                    System.out.println("Congragulations! You've reached three points!");
                    System.out.println("Try to reach three points faster now!");
                }
            }

        }
    }


}



