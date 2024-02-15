package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
	public static void main(String[] args) {
		System.out.println(
				"This algoritm takes as input 5 colors and creates an Array List.\n++++++++++The output is the list and the sorted list.+++++++++++\n");
		ArrayList<String> arr = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Type in the " + (i + 1) + " color:");
			arr.add(input.nextLine());
		}
		System.out.println("The color Array List: " + arr);
		arr.sort(null);
		System.out.println("The sorted color Array List: " + arr);
		input.close();
	}
}
