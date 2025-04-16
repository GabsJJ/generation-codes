package aula_03;

import java.util.Scanner;

public class Exe_02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			if(numero >= 0)
				System.out.printf("O número %d é par e positivo!", numero);
			else
				System.out.printf("O número %d é par e neagtivo!", numero);
		} else {
			if(numero >= 0)
				System.out.printf("O número %d é impar e positivo!", numero);
			else
				System.out.printf("O número %d é impar e neagtivo!", numero);
		}
		
		leia.close();
	}
}
