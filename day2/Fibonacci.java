package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3, i, count = 11;
		System.out.print(num1 + " " + num2);

		for (i = 2; i < count; ++i)
		{
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
	
	}

//Print first number
//Iterate from 1 to the 11
//Add first and second number assign to sum
//Assign second number to the first number
//Assign sum to the second number
//Print sum