/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SANIHIT
 */
import java.util.Scanner;
public class RPS {

// Adding a list zest to this programming assignment! 
    public static void superHeader() {

        // This ASCII art came from http://www.ascii-art.de/ascii/def/finger.txt
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Let's play a game of...");
        System.out.println();
        System.out.println("ROCK                    PAPER                           SCISSORS!!");
        System.out.println("    _______                 _______                    _______");
        System.out.println("---'   ____)            ---'   ____)____           ---'   ____)____");
        System.out.println("      (_____)                     ______)                    ______)");
        System.out.println("      (_____)                     _______)                __________)");
        System.out.println("      (____)                    _______)                 (____)");
        System.out.println("---.__(___)             ---.__________)            ---.__(___)");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("You're playing against the computer, pick one: \n\nScissor (0) \n\nRock (1) \n\nPaper (2)");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("0, 1, or 2? ");

    } // End superHeader function 

    public static void main(String[] args) {

        // Declaring constants for gesture that can be chosen 
        int SCISSOR_VALUE = 0;

        int ROCK_VALUE = 1;

        int PAPER_VALUE = 2;

        Scanner input = new Scanner(System.in);

        // Display welcome message for players
        RPS.superHeader();

        // Getting the Player 1 input
        int player1 = input.nextInt();

        // Generating a random number that is between 0 and 2 for Player 2 since it is the computer
        int player2 = (int) (Math.random() * 3);


        /* The below is to create human friendly messages... */
        // Declaring empty strings for Player 1 and Player 2's response
        String player1Response = "";

        String player2Response = "";

        /*
         * Declaring the player1Response string and setting it to the gesture name that the player has chosen
         * We are doing this by using a switch statement and checking to see if they entered 0,1, or 2. 
         */
        switch (player1) {

            case 0:
                player1Response = "scissors";
                break;

            case 1:
                player1Response = "rock";
                break;

            case 2:
                player1Response = "paper";
                break;

            default:
            // No default

        }

        /*
         * Declaring the player2Response string and setting it to the gesture name that the player has chosen
         * We are doing this by using a switch statement and checkign to see if they entered 0,1, or 2. 
         */
        switch (player2) {

            case 0:
                player2Response = "scissors";
                break;

            case 1:
                player2Response = "rock";
                break;

            case 2:
                player2Response = "paper";
                break;

            default:
            // No default

        }

        /*
         * Combining geasture names based on what the player chosen with generic "You Win", "You Lose", etc messages
         */
        String outcomeString = "\nThe computer picked " + player2Response + ". You picked " + player1Response;

        // Lose Message
        String outcome1 = outcomeString + ". You lose!";

        // Win Message
        String outcome2 = outcomeString + ". You won!";

        // Invalid play message (if the user enters an invalid number) 
        String outcome3 = "\nInvalid number. Please try again.";

        // Message for when there's a draw
        String outcome4 = outcomeString + " too. " + "It's a Draw!!";

        // The following is the main logic that determines which player wins and which player loses
        if ((player1 == SCISSOR_VALUE & player2 == ROCK_VALUE) || (player1 == PAPER_VALUE & player2 == SCISSOR_VALUE) || (player1 == ROCK_VALUE & player2 == PAPER_VALUE)) {

            // Player lost
            System.out.println(outcome1);

        } else {
            if ((player1 == SCISSOR_VALUE & player2 == PAPER_VALUE) || (player1 == ROCK_VALUE & player2 == SCISSOR_VALUE) || (player1 == PAPER_VALUE & player2 == ROCK_VALUE)) {

                // Player won
                System.out.println(outcome2);

            } else {
                if (player1 > 2 || player1 < 0) {

                    // Player entered an invalid number that was greater than 2 and less than 0
                    System.out.println(outcome3);

                } else {

                    // Both players entered in the same number so it's a draw
                    System.out.println(outcome4);

                }
            }
        } // End logic for determining outcomes 

    } // End Main Function

} // End RockPaperScissors Class
