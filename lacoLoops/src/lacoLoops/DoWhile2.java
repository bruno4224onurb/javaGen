package lacoLoops;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
		System.out.println("This algoritm returns the avarage of the inputed numbers\nthat are multiples of 3");
		Scanner input = new Scanner(System.in);
		int n = 1, a = 0;
		double sum = 0, avg;
		do {
			System.out.println("Type a number:");
			n = input.nextInt();
			if (mult3(n) && n!=0){
			sum = sum + n;
			a = a +1;
			}
			else {
				continue;
			}
		} while (n != 0);
		avg = sum / a;
		System.out.println("The avarage of the numbers that are multiple of 3 is: " + avg);

	}

	public static boolean mult3(int number) {
		return number % 3 == 0;
	}
}