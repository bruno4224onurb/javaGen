package lacosCondicionais;

import java.util.Scanner;

public class LacoIf3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		boolean donation;
		String name;
		System.out.println("This application checks if a person is apt or not apt to donate blood.");
		System.out.println("Write the name of the potential donor: ");
		name = input.nextLine();
		System.out.println("Write the age of the potential donor: ");
		age = input.nextInt();
		System.out.println("It is this person's first donation? (please awsner with True or False)");
		donation = input.nextBoolean();
		if (18 <= age && age <= 69) {
			if (60 <= age && age <= 69) {
				if (!donation) {
					System.out.println(name + " is apt to donate blood!");
				} else {
					System.out.println(name + " is not apt to donate blood!");
				}
			} else {
				System.out.println(name + " is apt to donate blood!");
			}
		} else {
			System.out.println(name + " is not apt to donate blood!");
		}
		System.out.println(
				"Parameters for this decision:\n1)17<age<70 \n2)if 59<age<70 checks if it is the first donation.");
		input.close();
	}
}
