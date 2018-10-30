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



       //initialize
        keyboard = new Scanner(System.in);

        System.out.println("Welcome to rock, paper, scissors!");
        System.out.println("Go ahead and put your choice in. rock, paper, or scissors?");
        PlayerChoice = keyboard.nextLine();

        Options = new String[3];
        Options[0] = "rock";
        Options[1] = "paper";
        Options[2] = "scissors";

        ComputerChoice = Options[(int) (Math.random() * Options.length)];

        if (PlayerChoice.equals(ComputerChoice)) {
            System.out.println("It's a tie!");
        }
        else if (PlayerChoice.equals("rock")) {
            if (ComputerChoice.equals("scissors"))
                System.out.println("Rock beats scissors, You win!");
            else if (ComputerChoice.equals("paper"))
                System.out.println("Paper beats rock, You lose.");
        }
        else if (PlayerChoice.equals("paper")) {
            if (ComputerChoice.equals("scissors"))
                System.out.println("Scissor beats paper, You lose.");
            else if (ComputerChoice.equals("rock"))
                System.out.println("Paper beats rock, You win!");
        }
        else if (PlayerChoice.equals("scissors")) {
            if (ComputerChoice.equals("paper"))
                System.out.println("Scissor beats paper, You win!");
            else if (ComputerChoice.equals("rock"))
                System.out.println("Rock beats scissors, You lose.");
        }
        else
            System.out.println("Invalid user input, try again.");



    }
}
