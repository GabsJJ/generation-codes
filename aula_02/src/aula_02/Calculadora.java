package aula_02;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double numero_1 = leia.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double numero_2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f",numero_1, numero_2, numero_1 + numero_2);
		System.out.printf("\n%.2f - %.2f = %.2f",numero_1, numero_2, numero_1 - numero_2);
		System.out.printf("\n%.2f * %.2f = %.2f",numero_1, numero_2, numero_1 * numero_2);
		System.out.printf("\n%.2f / %.2f = %.2f",numero_1, numero_2, numero_1 / numero_2);
		System.out.printf("\n%.2f ^ %.2f = %.2f",numero_1, numero_2, Math.pow(numero_1, numero_2));
		leia.close();
	}

}
