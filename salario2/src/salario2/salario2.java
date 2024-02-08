package salario2;

import java.util.Scanner;

public class salario2 {
	public static void main(String[] args) {
		float salario, adicional, horas, descontos, novoSalario;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Salário: ");
		salario = scan.nextFloat();
		System.out.println("Digite o Adicional Noturno: ");
		adicional = scan.nextFloat();
		System.out.println("Digite as Horas Extras: ");
		horas = scan.nextFloat();
		System.out.println("Digite os Descontos: ");
		descontos = scan.nextFloat();
		novoSalario = salario + adicional + (horas*5) - descontos;
		System.out.println("Seu novo salário é de: "+novoSalario);
	}
}
