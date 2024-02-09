package lacoLoops;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		int a, b, i;
		Scanner input = new Scanner(System.in);
		System.out.println(
				"This algoritm receives the first and the last number of an interval\nand returns the multiples of 3 and 5.");
		System.out.println("Type the first number of the interval:");
		a = input.nextInt();
		System.out.println("Type the last number of the interval:");
		b = input.nextInt();
		if (a >= b) {
			System.out.println("Invalid Interval, the first number must be less than the last.");
		} else {
			for (i = a; i <= b; i++) {
				if (isMultiple3(i) && isMultiple5(i)) {
					System.out.println(i + " is a multiple of 3 and 5.");
				} else {
					continue;
				}
			}
			System.out.println("These are the multiples of 3 and 5 in the interval: " + a + " to " + b);
		}
		input.close();
	}

	public static boolean isMultiple3(int number) {
		return number % 3 == 0;
	}

	public static boolean isMultiple5(int number) {
		return number % 5 == 0;
	}
}
