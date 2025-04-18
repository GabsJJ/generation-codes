package aula_05;

public class Cinema {

	public static void main(String[] args) {
		
		int[][] assentos = {
					{1,0,1,1,1,0},
					{1,0,1,0,1,1},
					{0,0,0,1,0,1},
					{1,0,1,0,1,1},
					{0,1,0,0,1,1},
					{1,0,1,1,1,0},
				};
		int ocupadas = 0, livres = 0;
		
		for(int[] fila : assentos) {
			for (int assento : fila) {
				if (assento == 1) {
					ocupadas++;
				} else {
					livres++;
				}
			}
		}
		System.out.printf("Assentos ocupados: %d\n", ocupadas);
		System.out.printf("Assentos livres: %d\n", livres);
	}

}
