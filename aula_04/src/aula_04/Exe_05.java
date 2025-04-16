package aula_04;

import java.util.Scanner;

public class Exe_05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero = -1, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if(numero > 0)
				soma += numero;
		} while(numero != 0);
		System.out.printf("\nA soma dos números positivos é: %d", soma);
		leia.close();
	}
}
