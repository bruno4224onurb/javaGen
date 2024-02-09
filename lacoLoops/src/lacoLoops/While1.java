package lacoLoops;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		System.out.println(
				"This algoritm asks for an age number and returns \nthe total of minnors(<21yo) and elders(>50yo)."
				+ "\nTo stop the algoritm please write a negative number");
		Scanner input = new Scanner(System.in);
		int n = 1, j = 0, k = 0;
		while (n > 0) {
			System.out.println("Type an age of a person:");
			n = input.nextInt();
			if (n < 21 && n > 0) {
				j = j + 1;
			} else if (n > 50) {
				k = k + 1;
			}
		}
		System.out.println("Total people with less than 21 years of age: " + j
				+ "\nTotal people with more than 50 years of age: " + k);
		input.close();
	}
}
