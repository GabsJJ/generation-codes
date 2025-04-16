package aula_03;

import java.util.Scanner;

public class Exe_05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int item, quantidade;
		
		System.out.print("Código do produto: ");
		item = leia.nextInt();
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();
		
		switch(item) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor total: R$ %.2f", 10.00*quantidade);
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor total: R$ %.2f", 15.00*quantidade);
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.printf("Valor total: R$ %.2f", 18.00*quantidade);
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.printf("Valor total: R$ %.2f", 12.00*quantidade);
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor total: R$ %.2f", 8.00*quantidade);
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			System.out.printf("Valor total: R$ %.2f", 13.00*quantidade);
			break;
		default:
			System.out.println("Produto inválido");
			break;
		}
		leia.close();
	}
}
