package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Set1 {
	public static void main(String[] args) {
		System.out.println("This algoritm takes as input 10 integers and creates a collection set."
				+ "\nThe output is created by a iterator and it shows the elements of the set.\n");
		Scanner input = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Type in the " + (i + 1) + " number: ");
			set.add(input.nextInt());
		}

		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		input.close();
	}

}
