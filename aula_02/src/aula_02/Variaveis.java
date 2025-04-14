package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int numero_02 = leia.nextInt();
		final double PI = 3.1415;
		
		System.out.println(numero_01);
		System.out.println(numero_02);
		System.out.printf("PI: %f", PI);
	}
}
