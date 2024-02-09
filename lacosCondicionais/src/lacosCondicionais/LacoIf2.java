package lacosCondicionais;

import java.util.Scanner;

public class LacoIf2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A;
		System.out.println(
				"Welcome! This application reads a number and returns if it is even or odd, also it returns if the number is positive or negative.");
		System.out.println("Type a number: ");
		A = input.nextInt();
		if (A % 2 == 0 && A >= 0) {
			System.out.println("The number " + A + " is even and positive!");
		} else if (A % 2 == 0 && A < 0) {
			System.out.println("The number " + A + " is even and negative!");
		} else if (A % 2 != 0 && A >= 0) {
			System.out.println("The number " + A + " is odd and positive!");
		} else if (A % 2 != 0 && A < 0) {
			System.out.println("The number " + A + " is odd and negative!");
		}
		input.close();
	}
}
