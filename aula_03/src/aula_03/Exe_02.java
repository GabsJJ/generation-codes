package aula_03;

import java.util.Scanner;

public class Exe_02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			if(numero >= 0)
				System.out.printf("O n�mero %d � par e positivo!", numero);
			else
				System.out.printf("O n�mero %d � par e neagtivo!", numero);
		} else {
			if(numero >= 0)
				System.out.printf("O n�mero %d � impar e positivo!", numero);
			else
				System.out.printf("O n�mero %d � impar e neagtivo!", numero);
		}
		
		leia.close();
	}
}
