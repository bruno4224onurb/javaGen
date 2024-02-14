package lacoLoops;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		int a, e, o, i;
		e = o = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("This algoritm reads 10 numbers and show the total number of even and odd numbers");
		for (i = 0; i < 10; i++) {
			System.out.println("Type the " + (i + 1) + " number:");
			a = input.nextInt();
			if (a % 2 == 0) {
				e = e + 1;
			} else {
				o = o + 1;
			}
		}
		System.out.println("Total of even numbers: " + e + "\nTotal of odd numbers: " + o);
		input.close();
	}
}
