package week1.day2;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=0,j=0;
		int num=11;
		if(num==0 || num==1) {
			System.out.println(num + " is not a prime number");
		}
		else {
			for(i=2;i<=a;i++) {
				if(num%i ==0) {
					System.out.println(num + " is not a prime number");
					j=1;
					break;
				}
			}
			if(j==0) {
				System.out.println(num+ " is a primenumber");
			}
		}

	}

}

//a) Create a class by name: IsPrime
//b) Create a main method using shortcut
//c) Write a logic to find if the given number is prime or not
//d) Print if it is prime or not
//
//Hint: Iterate through all numbers from 2 to n-1 (input) and 
//for every number check if it divides n (input). 
//If we find any number that divides(1 or same number), print prime.
//If nothing divides, then print non-prime