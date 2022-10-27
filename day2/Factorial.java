package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int n= 5;
		int i=1;
		int fact = 1;
		for(i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(("Factorial of n is :"+fact));
	}

}
