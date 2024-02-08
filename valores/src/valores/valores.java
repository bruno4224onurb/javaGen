package valores;

import java.util.Scanner;

public class valores {
	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = scan.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = scan.nextFloat();
		System.out.println("Digite o terceiro número: ");
		n3 = scan.nextFloat();
		System.out.println("Digite o quarto número: ");
		n4 = scan.nextFloat();
		diferenca = (n1 * n2) - (n3 * n4); 
		System.out.println("A diferença entre a multiplicação do primeiro e segundo números em relação à multiplicação do terceiro e quarto números é de  "+diferenca+".");
	}
}
