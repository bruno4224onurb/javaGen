package media;

import java.util.Scanner;

public class media {
	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextFloat();
		System.out.println("Digite a quarta nota: ");
		nota4 = scan.nextFloat();
		media = (nota1 + nota2 + nota3)/4;
		System.out.println("Sua média é "+media);
	}
	
}
