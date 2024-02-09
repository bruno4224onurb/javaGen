package lacosCondicionais2;

import java.util.Scanner;

public class LacoSwitch1 {
	public static void main(String[] agrs) {
		String ans;
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println(
				"----Welcome to Bruno's burger online menu!----\n----------------------------------------------\n----ID----Product-----------------------$-----\n-----1---Hot Dog--------------------10.00-----\n-----2---Cheeseburger---------------15.00-----\n-----3---Bacon Cheeseburger---------18.00-----\n-----4---Bauru----------------------12.00-----\n-----5---Soda-----------------------08.00-----\n-----6---Orange Juice---------------18.00-----\n----------------------------------------------\n-----Would you like to place an order?--------\n----------------------------------------------");
		ans = input.nextLine();
		if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
			System.out.println("Please type the ID of the product you desire: ");
			a = input.nextInt();
			System.out.println("How many units?");
			b = input.nextInt();
			switch (a) {
			case 1:
				System.out.println("Product: Hot Dog\nPrice: $" + b * 10.00);
				break;
			case 2:
				System.out.println("Product: Cheeseburger\nPrice: $" + b * 15.00);
				break;
			case 3:
				System.out.println("Product: Bacon Cheeseburger\nPrice: $" + b * 18.00);
				break;
			case 4:
				System.out.println("Product: Bauru\nPrice: $" + b * 12.00);
				break;
			case 5:
				System.out.println("Product: Soda\nPrice: $" + b * 08.00);
				break;
			case 6:
				System.out.println("Product: Orange Juice\nPrice: $" + b * 13.00);
				break;
			default:
				System.out.println("Invalid option. Restart the application.");
				break;
			}
		} else if (ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")) {
			System.out.println("See ya!");
		} else {
			System.out.println("Invalid option. Please Answer with yes(y) or no(n).");
		}
		input.close();
	}
}
