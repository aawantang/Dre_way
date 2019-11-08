
public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] numbers = {1,2,3,4},{5,6,7,8 },{9,10,11,12};
	//This will creat an array that looks like this 
	//1	2	3	4
	//5	6	7	8
	//9	10	11	12

//change the number 7 to 13
number [1][2] = 13;

//change the number 2 to 14
number [0][1] = 14;
//print the value in 0,3
Syetem.out.println("The value is 0,3 is " + number [0][3]);

//Creat a total
int total = number[1][1] + number [2][0];
total = 0;

// loop through each rwo
for  int row = 0; now<numbers.length;row++)

{
	total = 0;
	//loop through each column
	for (int col = 0; col<numbers[0]; length; col++) {
		System.out.print(numbers [row][col + "\t"]);
		total = total + numbers[row] [col];
	}
	System.out.println(total + "\n");
}


		
	}

}
