package salario;

import java.util.Scanner;

public class salario {
	public static void main(String[] args) {
		float salario, abono, novoSalario;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		salario = scan.nextFloat();
		System.out.println("Digite o abono: ");
		abono = scan.nextFloat();
		novoSalario = salario + abono;
		System.out.println("Seu novo salário é de: "+novoSalario);
	}
}
