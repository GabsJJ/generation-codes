package aula_02;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float salario, abono, novoSalario;
		
		System.out.print("Digite o sal�rio: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("\nNovo sal�rio: %.2f", novoSalario);
		leia.close();
	}

}
