package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
			System.out.print("Digite o primeiro número: ");
			double numero1 = leia.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			double numero2 = leia.nextDouble();
			
			System.out.println("\n*******************************");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			System.out.println("*******************************");
			System.out.printf("Qual operação deseja realizar? ");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				leia.close();
				sobre();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1 -> System.out.printf("\n%.2f + %.2f = %.2f\n", numero1, numero2, somar(numero1, numero2));
			case 2 -> System.out.printf("\n%.2f - %.2f = %.2f\n", numero1, numero2, subtrair(numero1, numero2));
			case 3 -> System.out.printf("\n%.2f * %.2f = %.2f\n", numero1, numero2, multiplicar(numero1, numero2));
			case 4 -> System.out.printf("\n%.2f / %.2f = %.2f\n", numero1, numero2, dividir(numero1, numero2));
			default -> System.out.println("Digite uma opção válida\n");
			}
		}
	}	
	static double somar(double n1, double n2) {
		return n1+n2;
	}
	
	static double subtrair(double n1, double n2) {
		return n1-n2;
	}
	
	static double multiplicar(double n1, double n2) {
		return n1*n2;
	}
	
	static double dividir(double n1, double n2) {
		return n1/n2;
	}
	
	static void sobre() {
		System.out.println("\nCalculadora de métodos");
		System.out.println("Feita por: Gabriel");
	}
}
