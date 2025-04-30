package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dividendo = 0;
		int divisor = 0;
		
		while(true) {
			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = leia.nextInt();
						
				System.out.println("Digite o Divisor: ");
				divisor = leia.nextInt();
						
				divide(dividendo, divisor);
				break;
				
			} catch(InputMismatchException e) {
				leia.nextLine();
				System.out.println("Digite um número inteiro positivo");
				
			} catch(ArithmeticException e) {
				leia.nextLine();
				System.out.println("Digite um número inteiro diferente de zero");
			} finally {
				System.out.println("Programa em execução!");
			}
		}
		leia.close();
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
