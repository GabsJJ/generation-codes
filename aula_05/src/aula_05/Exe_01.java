package aula_05;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		boolean encontrado = false;
		
		System.out.print("Digite o n�mero que deseja encontrar: ");
		int procurado = leia.nextInt();
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == procurado) {
				System.out.printf("N�mero %d encontrado na posi��o: %d", vetor[i], i);
				encontrado = true;
			}
		}
		if(!encontrado)
			System.out.printf("N�mero %d n�o encontrado!", procurado);
		
		leia.close();
	}

}
