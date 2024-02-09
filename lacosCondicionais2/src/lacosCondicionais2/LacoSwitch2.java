package lacosCondicionais2;

import java.util.Scanner;

public class LacoSwitch2 {
	public static void main(String[] args) {
		String name;
		int a;
		float b;
		Scanner input = new Scanner(System.in);
		System.out.println(
				"----------------------------------------------\n-----ID-------------------Role----------------\n-----1-------------------Manager--------------\n-----2-------------------Salesman-------------\n-----3------------------Supervisor------------\n-----4--------------------Driver--------------\n-----5-------------------Stockist-------------\n-----6-----------------IT Technician----------\n----------------------------------------------");
		System.out.println("Please write your name:");
		name = input.nextLine();
		System.out.println("Please type the ID of your role: ");
		a = input.nextInt();
		System.out.println("What's your salary?");
		b = input.nextFloat();
		switch (a) {
		case 1:
			System.out.println("Name: " + name + "\nRole: Manager\nNew salary: $" + b * 1.1);
			break;
		case 2:
			System.out.println("Name: " + name + "\nRole: Salesman\nNew salary: $" + b * 1.07);
			break;
		case 3:
			System.out.println("Name: " + name + "\nRole: Supervisor\nNew salary: $" + b * 1.09);
			break;
		case 4:
			System.out.println("Name: " + name + "\nRole: Driver\nNew salary: $" + b * 1.06);
			break;
		case 5:
			System.out.println("Name: " + name + "\nRole: Stockist\nNew salary: $" + b * 1.05);
			break;
		case 6:
			System.out.println("Name: " + name + "\nRole: IT Technician\nNew salary: $" + b * 1.08);
			break;
		default:
			System.out.println("Invalid option. Restart the application.");
			break;
		}
		input.close();
	}
}
