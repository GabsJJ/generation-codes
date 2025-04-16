package aula_03;

import java.util.Scanner;

public class Exe_08 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int operacao;
		float saldo = 1000.00f, valor;
		
		System.out.print("Operação: ");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\nOperação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.print("Valor: R$ ");
			valor = leia.nextFloat();
			System.out.println("\nOperação - Saque");
			if(valor > saldo)
				System.out.print("Saldo insuficiente!");
			else
				System.out.printf("Novo Saldo: R$ %.2f", saldo-valor);
			break;
		case 3:
			System.out.print("Valor: R$ ");
			valor = leia.nextFloat();
			System.out.println("\nOperação - Depósito");
			System.out.printf("Novo Saldo: R$ %.2f", saldo+valor);
			break;
		default: 
			System.out.println("Operação Inválida!");
		}
		leia.close();
	}
}
