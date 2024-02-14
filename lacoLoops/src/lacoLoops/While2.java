package lacoLoops;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age, gender, dev, bend = 0, womenFront = 0, menMobile40 = 0, nonB30 = 0, totalAns = 0;
		double average = 0.00, sum = 0.00;
		String ans = "Y";
		System.out.println("Welcome to the internal survey of Generation Brasil!");
		while (!ans.equalsIgnoreCase("N")) {
					System.out.println("Please type the age:");
					age = input.nextInt();
					System.out.println(
							"Please type the gender according to our index:\n1 - Cis Woman\n2 - Cis Man\n3 - Non-Binary\n4 - Trans Woman\n5 - Trans Man\n6 - Other");
					gender = input.nextInt();
					System.out.println(
							"Please type the development field according to our index:\n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - Fullstack");
					dev = input.nextInt();
					if (dev == 1) {
						bend = bend + 1;
					}
					if ((gender == 1 || gender == 4) && dev == 2) {
						womenFront = womenFront + 1;
					}
					if (age > 40 && (gender == 2 || gender == 5) && dev == 3) {
						menMobile40 = menMobile40 + 1;
					} 
					if (age < 30 && gender == 3 && dev == 4) {
						nonB30 = nonB30 + 1;
					}
					totalAns = totalAns + 1;
					sum = sum + age;
					average = sum / totalAns;
					System.out.println("Would you like to give answers for other colaborator? Please answer with Y or N.");
					ans = input.nextLine();
					}
		System.out.println("There are " + bend+ " backend developers."
				+"\nThere are " + womenFront + " trans and cis women in the Frontend development." 
				+ "\nThere are " + menMobile40 + " trans and cis men in the Mobile development."
				+ "\nThere are " + nonB30 + " non-binary persons in the Fullstack development."
				+ "\nThere were " + totalAns + " total answers to this survey."
				+ "\nThe age average of the people that responded is " + average+".");
		input.close();
			}
}