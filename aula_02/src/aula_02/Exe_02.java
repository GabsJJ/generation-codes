package aula_02;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float soma = 0, media = 0;
		float[] notas = new float[4];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", i+1);
			notas[i] = leia.nextFloat();
			soma += notas[i];
		}
		
		media = soma / notas.length;
		System.out.printf("\nMédia final: %.1f", media);
		leia.close();

	}

}
