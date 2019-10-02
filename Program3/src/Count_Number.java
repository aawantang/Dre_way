//import the required module
import java.util.Scanner;

//this is the class name
public class Count_Number
{

//this is the main method

public static void main(String args[])
{

//variable declaration
int num;

String name;

//create a Scanner object

Scanner in = new Scanner(System.in);

//accept the user name

System.out.print("Enter your name: ");

name = in.nextLine();

//start of do while loop
do

{

//ask the user to enter a number between 0 and 100

System.out.print("Enter a number between 0 and 100: ");

num = in.nextInt();

//if the input number is not between 0 and 100 then print a warning message
if(num<0 || num > 100)

{

System.out.println("Sorry! wrong input.");

}

//else print a thank you message along with the user name
else

{
System.out.println("Thank you for your input, "+name+"!");

}

}while(num<0 || num>100); //while condition is false until the user enter the correct number

//loop for the number of times as input provide by the user

for(int i = num; i>0; i--)

{

//display a message
System.out.println("I am too busy, will be back in "+i+" minuts.");

}

}
//end of the main method
}
//end of the class