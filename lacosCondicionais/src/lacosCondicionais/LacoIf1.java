package lacosCondicionais;

import java.util.Scanner;

public class LacoIf1 {
	public static void main(String[] args) {
		int A, B, C, AB;
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Welcome! This application reads 3 numbers A,B and C and compares the sum of the fisrt two with the last one.");
		System.out.println("Type number A:");
		A = input.nextInt();
		System.out.println("Type number B:");
		B = input.nextInt();
		System.out.println("Type number C:");
		C = input.nextInt();
		AB = A + B;
		if (AB > C) {
			System.out.println("The sum of A+B is greater than C.");
		} else if (AB == C) {
			System.out.println("The sum of A+B is equal to C.");
		} else if (AB < C) {
			System.out.println("The sum of A+B is less than C.");
		}
		input.close();
	}
}
