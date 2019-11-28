import java.util.Random;

import java.util.Scanner;

public class MySport {

public static void main(String[] args) {

System.out.println("Welcome User. My sport for the day is MYCRICKET. MYCRICKET is played between two players.\n"

+ "The maximum number of innings that can be played at once in MYCRICKET is 1000\n. Each innings is played for 10 points. A player who scores atleast 6"

+ "out of 10 points is the winner for that innings.\n"

+ " The final winner of the game is the won who won most innings");

System.out.println(

"Please choose the number of innings the two players are going to play. This number should be between 1 and 1000");

Scanner scanner = new Scanner(System.in);

int numOfInnings = scanner.nextInt();

if (numOfInnings < 1 || numOfInnings > 1000) {

System.out.print("This program expects the number of innings to be between 1 and 1000");

}

scanner.close();

int[][] scoreCardArray = new int[numOfInnings][2];

Random random = new Random(System.currentTimeMillis());

// loop 1

for (int i = 0; i < numOfInnings; i++) {

scoreCardArray[i][0] = 1 + random.nextInt(10);

scoreCardArray[i][1] = 10 - scoreCardArray[i][0];

}

// loop 2

int finalScoreA = 0;

int finalScoreB = 0;

System.out.println("---------------------------------------------------------");

for (int i = 0; i < numOfInnings; i++) {

System.out.println("Innings: " + (i + 1));

System.out.println("Score:");

System.out.println("player A: " + scoreCardArray[i][0]);

System.out.println("player B: " + scoreCardArray[i][1]);

System.out.println();

System.out.println("---------------------------------------------------------");

if (scoreCardArray[i][0] > 5) {

finalScoreA += 1;

}

if (scoreCardArray[i][1] > 5) {

finalScoreB += 1;

}

}

if (finalScoreA > finalScoreB) {

System.out.println("player A won the match as they won " + finalScoreA + " innings");

} else if (finalScoreB > finalScoreA) {

System.out.println("player B won the match as they won " + finalScoreB + " innings");

} else if (finalScoreA == finalScoreB) {

System.out.println("The match is a tie as both players have the same score");

}

}

}