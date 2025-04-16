package aula_04;

import java.util.Scanner;

public class Exe_01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int primeiro, ultimo;
		
		System.out.print("Digite o primeiro n�mero do intervalo: ");
		primeiro = leia.nextInt();
		System.out.print("Digite o �ltimo n�mero do intervalo: ");
		ultimo = leia.nextInt();
		
		if(ultimo < primeiro)
			System.out.print("\nIntervalo inv�lido!");
		else {
			System.out.println("");
			for(int contador = primeiro; contador < ultimo; contador++) {
				if(contador % 3 == 0 && contador % 5 == 0)
					System.out.printf("%d � m�ltiplo de 3 e 5\n", contador);
			}
		}
		leia.close();
	}
}
