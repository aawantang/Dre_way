import java.io.*;
import java.util.Scanner;

public class program8 {

										// Don't forget to throw your exception.
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
        // Check if output file exists and either create it or append it
        FileWriter fw = new FileWriter("/Users/andrewawantang/Desktop/grades.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        
        // Create a file to read in from
        File fr = new File("/Users/andrewawantang/Desktop/report.txt");
        Scanner inputFile = new Scanner(fr);
        
        // Create total variables
        double total = 0.00;
        double NumberofGrades = 0.00;
        double Average = 0.00;
        
        
        while (inputFile.hasNext())
        {
            // Read line from input file
            char category = inputFile.next().charAt(0);
            double catAmount = inputFile.nextDouble();
            
            switch(category) 
            {
            	case 'A':
            		total+=catAmount;
            		break;
            	case 'B':
            		NumberofGrades+=catAmount;
            		break;
            	case 'C':
            		Average+=catAmount;
            		break;
            }
            
        }
        
        // Output results to file
        outputFile.println("Grade Statistics");
        outputFile.println("=======================");
        outputFile.printf("total :\t$%.2f\n", total);
        outputFile.printf("Number of Grades B:\t$%.2f\n", NumberofGrades);
        outputFile.printf("Average:\t$%.2f\n", Average);
        
        
        // Close the files
        outputFile.close();
        inputFile.close();

	}
	}