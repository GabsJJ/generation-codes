package aula_04;

import java.util.Scanner;

public class Exe_01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int primeiro, ultimo;
		
		System.out.print("Digite o primeiro número do intervalo: ");
		primeiro = leia.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		ultimo = leia.nextInt();
		
		if(ultimo < primeiro)
			System.out.print("\nIntervalo inválido!");
		else {
			System.out.println("");
			for(int contador = primeiro; contador < ultimo; contador++) {
				if(contador % 3 == 0 && contador % 5 == 0)
					System.out.printf("%d é múltiplo de 3 e 5\n", contador);
			}
		}
		leia.close();
	}
}
