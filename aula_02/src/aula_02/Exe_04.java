package aula_02;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float[] numeros = new float[4];
		float diferenca;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Número %d: ", i+1);
			numeros[i] = leia.nextFloat();
		}
		
		diferenca = (numeros[0] * numeros[1]) - (numeros[2] * numeros[3]);
		System.out.printf("\nDiferença: %.1f", diferenca);
		leia.close();

	}

}
