package aula_05;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {10, 15, 20, 30, 40};
		float vetorReal[] = new float[5];
		
		for(int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.printf("vetorInteiros[%d] = %d\n",indice, vetorInteiros[indice]);
		}
		
		System.out.println();
		
		for(int indice = 0; indice < vetorReal.length; indice++) {
			System.out.print("Digite um número real: ");
			vetorReal[indice] = leia.nextFloat();
		}
		
		//foreach
		for(float valor : vetorReal) {
			System.out.printf("Elemento atual: %.1f\n", valor);
		}
		leia.close();
	}

}
