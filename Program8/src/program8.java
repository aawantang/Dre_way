import java.io.*;
import java.util.Scanner;

public class program8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//create variables
		int numGrades = 0;
		double totalGrades = 0.0;
		double avgGrades = 0.0;
		
		//read from outside file
		//link to file
		File fr = new File ("/Users/andrewawantang/Desktop/grades.txt");
		//open file for use
		Scanner inputFile = new Scanner(fr);
		
		//loop through the input file (grades) with while loop 
		while(inputFile.hasNext())
			{
			totalGrades = inputFile.nextDouble() + totalGrades;
			numGrades = numGrades+1;
			}
		
		//output total grades, number of grades and average
		System.out.println("Grade Statistics");
		System.out.println("================");
		System.out.println("Total: " + totalGrades);
		System.out.println("Number of Grades: " + numGrades);
		avgGrades = totalGrades/numGrades;
		System.out.printf("Average:\t%.1f", avgGrades);	
		System.out.println("%");
		
		//close the input file
		inputFile.close();
		
		//open/create output file
		FileWriter tempFile = new FileWriter("/Users/andrewawantang/Desktop/report.txt");
		PrintWriter outputFile = new PrintWriter(tempFile);
		
		//output data to new file
		outputFile.println("Grade Statistics");
		outputFile.println("================");
		outputFile.println("Total: " + totalGrades);
		outputFile.println("Number of Grades: " + numGrades);
		outputFile.printf("Average:\t%.1f", avgGrades);	
		outputFile.println("%");
		
		//close output file
		outputFile.close();
		
	}

}
