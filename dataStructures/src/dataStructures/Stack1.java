package dataStructures;

import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;

public class Stack1 {
	public static void main(String[] args) {
		System.out.println("This application is a interactive queue.");
		Scanner input = new Scanner(System.in);
		int o = -1;
		Stack<String> stack = new Stack<String>();
		while (o == -1) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++" + "\n      1 - Add book to Stack          "
					+ "\n      2 - List all Books            " + "\n      3 - Remove book from Stack            "
					+ "\n      0 - Leave            " + "\n++++++++++++++++++++++++++++++++++++++++++"
					+ "\nSelect an option: ");
			o = input.nextInt();
			switch (o) {
			default:
				System.out.println("Invalid option.");
				o = -1;
				break;
			case 0:
				System.out.println("Thanks for using this application!");
				input.close();
				break;
			case 1:
				System.out.println("Type in the name of the book.");
				String st1 = input.next();
				stack.push(st1.toUpperCase());
				System.out.println("Book added to the stack!");
				o = -1;
				break;
			case 2:
				Iterator<String> iterator = stack.iterator();
				int n = 1;
				System.out.println("******************Stack:*******************\n");
				if (stack.isEmpty()) {
					System.out.println("                 ~Empty~" + "\n\n******************************************");
					o = -1;
					break;
				} else {
					while (iterator.hasNext()) {
						System.out.println("      " + n + " - " + iterator.next());
						n++;
					}
					System.out.println("\n******************************************");
					o = -1;
					break;
				}
			case 3:
				int n2 = 1;
				if (stack.isEmpty()) {
					System.out.println("The stack is empty, there are no books to be removed.");
					o = -1;
					break;
				} else {
					stack.pop();
					Iterator<String> iterator2 = stack.iterator();
					System.out.println("******************Stack:*******************\n");
					while (iterator2.hasNext()) {
						System.out.println("      " + n2 + " - " + iterator2.next());
						n2++;
					}
					System.out.println("\n******************************************");
					System.out.println("A book has been removed!");
					o = -1;
					break;
				}
			}
		}
		input.close();
	}
}
