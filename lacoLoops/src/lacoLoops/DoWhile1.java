package lacoLoops;

import java.util.Scanner;

public class DoWhile1 {
	public static void main(String[] args) {
		System.out.println("This algoritm reads different numbers and sum them.\nTo get the results type 0.");
		Scanner input = new Scanner(System.in);
		int a = 1, sum = 0;
		do {
			System.out.println("Type a number:");
			a = input.nextInt();
			if (a>0) {
			sum = sum + a;
			}
		} while (a != 0);
		System.out.println("The sum of the positive numbers is :"+sum);
		input.close();
	}
}
