import java.util.Scanner;
 
public class program2 {

	public static void main(String[] args) {
//create new scanner
Scanner input = new Scanner(System.in);
//get user age weight and height

System.out.println("Enter weight in pounds, height in inches, and age" );
	double weight = input.nextDouble();
	double height = input.nextDouble();
	double age = input.nextDouble();
	
	//Calculate weight in kg, height in meters
	double wkg = weight * 0.45359237;
	double hmeters = height * 0.0254;
	
	//calculate BMI
	double bmi = wkg/ (hmeters * hmeters);
	
	//display the result
	System.out.println("Your bmi value is " + bmi);
	
	/*
	 * bmi < 18.5: under weight
	 * bmi < 25, bmi 185: normal
	 *bmi <30,  >=25: over weight
	 *bmi >=: obese
	 */
	
	if(bmi < 18.5) {
		System.out.println("underweight");
	}else if (bmi < 25 && bmi >= 18.5) {
		System.out.println("normal");
	} else if (bmi < 30 && bmi >= 25) {
		System.out.println("over weight");
	}else{
		 System.out.println("obese");
	}
	
		System.out.println();
	}

}
