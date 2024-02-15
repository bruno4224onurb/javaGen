package dataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
	public static void main(String[] args) {
		System.out.println("This application is a interactive queue.");
		Scanner input = new Scanner(System.in);
		int o = -1;
		Queue<String> queue = new LinkedList<String>();
		while (o == -1) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++"
					+ "\n      1 - Add client to Queue          " + "\n      2 - List all clients            "
					+ "\n      3 - Remove client from Queue            " + "\n      0 - Leave            "
					+ "\n++++++++++++++++++++++++++++++++++++++++++" + "\nSelect an option: ");
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
				System.out.println("Type in the name of the client.");
				String st1 = input.next();
				queue.add(st1.toUpperCase());
				System.out.println("Client added to the queue!");
				o = -1;
				break;
			case 2:
				Iterator<String> iterator = queue.iterator();
				int n = 1;
				System.out.println("******************Queue:******************\n");
				if (queue.isEmpty()) {
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
				Iterator<String> iterator2 = queue.iterator();
				int n2 = 1;

				if (queue.isEmpty()) {
					System.out.println("The queue is empty, there are no clients to be removed.");
					o = -1;
					break;
				} else {
					String st;
					System.out.println("******************Queue:******************\n");
					while (iterator2.hasNext()) {
						System.out.println("      " + n2 + " - " + iterator2.next());
						n2++;
					}
					System.out.println("\n******************************************"
							+ "\nPlease type the name of the client\nthat you want to remove:");
					st = input.next();
					if (queue.contains(st.toUpperCase())) {
						queue.remove(st.toUpperCase());
						System.out.println("Client removed from queue!");
						o = -1;
						break;
					} else {
						System.out.println("The queue does not contain this client!");
						o = -1;
						break;
					}
				}
			}
		}
		input.close();
	}
}
