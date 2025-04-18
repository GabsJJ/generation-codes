package aula_05;

public class Matrizes {

	public static void main(String[] args) {
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				System.out.printf("matriz[%d][%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
	}

}
