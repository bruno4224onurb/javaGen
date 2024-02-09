package lacosCondicionais;

import java.util.Scanner;

public class LacoIf4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String p1, p2, p3;
		System.out.println("This algoritm uses a taxonomy diagram to decide wich animal you chose. ");
		System.out.println("Vertebrae or Invertebrae?");
		p1 = input.nextLine();
		System.out.println("What Class?");
		p2 = input.nextLine();
		System.out.println("What Order:");
		p3 = input.nextLine();
		if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("ave") && p3.equalsIgnoreCase("carnívoro")) {
			System.out.println("This animal is a Águia");
		} else if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("ave") && p3.equalsIgnoreCase("onívoro")) {
			System.out.println("This animal is a Pomba");
		} else if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("mamífero")
				&& p3.equalsIgnoreCase("onívoro")) {
			System.out.println("This animal is a Homem");
		} else if (p1.equalsIgnoreCase("vertebrado") && p2.equalsIgnoreCase("mamífero")
				&& p3.equalsIgnoreCase("herbívoro")) {
			System.out.println("This animal is a Vaca");
		} else if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("inseto")
				&& p3.equalsIgnoreCase("hematófago")) {
			System.out.println("This animal is a Pulga");
		} else if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("inseto")
				&& p3.equalsIgnoreCase("herbívoro")) {
			System.out.println("This animal is a Lagarta");
		} else if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("anelídeo")
				&& p3.equalsIgnoreCase("hematófago")) {
			System.out.println("This animal is a Sanguessuga");
		} else if (p1.equalsIgnoreCase("invertebrado") && p2.equalsIgnoreCase("anelídeo")
				&& p3.equalsIgnoreCase("onívoro")) {
			System.out.println("This animal is a Minhoca");
		} else {
			System.out.println("This animal is out of our source taxonomy diagram or you typed a invalid word.");
		}
		System.out.println(
				"There is a source diagram for this decision that can be found in: https://docs.google.com/document/d/1itYmU-hDQHgZBo7gcHkl1u2Ba0xFXLy8/edit");
		input.close();
	}
}
