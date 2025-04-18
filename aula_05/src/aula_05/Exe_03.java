package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int[] diagonalPrincipal = new int[3], diagonalSecundaria = new int[3];
		int somaDiagPrincipal = 0, somaDiagSecundaria = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("Digite o número da posição [%d][%d] da matriz: ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
				
				if(linha == coluna) {
					diagonalPrincipal[linha] = matriz[linha][coluna];
					somaDiagPrincipal += matriz[linha][coluna];
				}
				if(linha + coluna == (matriz.length - 1)) {
					diagonalSecundaria[linha] = matriz[linha][coluna];
					somaDiagSecundaria += matriz[linha][coluna];
				}
			}
		}
		System.out.println("\nElementos da diagonal principal");
		System.out.println(Arrays.toString(diagonalPrincipal));
		System.out.println("\nElementos da diagonal secundaria");
		System.out.println(Arrays.toString(diagonalSecundaria));
		System.out.print("\nSoma dos elementos da diagonal principal: " + somaDiagPrincipal);
		System.out.println("\nSoma dos elementos da diagonal secundaria: " + somaDiagSecundaria);
		
		leia.close();
	}

}
