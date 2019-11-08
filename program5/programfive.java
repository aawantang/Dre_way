
import java.util.Random;

import java.util.Scanner;

public class GuessGame {

   

   //the method that return the guess by computer

    //the guess will be less than 10

    public static int computerGuess()

    {

        Random rand = new Random();

            return rand.nextInt(10);

    }
    //the method to take the guess by the computer

    //and take the input from user to check win

    //return the win points

    public static int playuserGuess(int compGuess)

    {

        //scanner object to take input

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your guess: ");

        int userGuess=scan.nextInt();
        //if userguess and computer gues are same

        //return 100

        if(userGuess==compGuess)

            return 100;

       

        //if the difference is 1, return 50

        else if((userGuess-compGuess)==-1 ||(userGuess-compGuess)==1)

            return 50;

       

        //If the difference is greater than 1

        //return 0

        else

            return 0;

    }

    //the method to take the win points and disply it

    public static void printWishes(int score)

    {

        //if a winner

        if(score==100 || score ==50)

            System.out.println("Congratzz!!!!You Won "+score+ " points!!!!!");

        //If looser

        else

             System.out.println("You lost !!!!!");

    }
    //The entry point main

    public static void main(String[] args) {

        //call the methods and repeat forever

        while(true)

        {

            int gues=computerGuess();

            int s =playuserGuess(gues);

            printWishes(s);       

        }

    }

   

}