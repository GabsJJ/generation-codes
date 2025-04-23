package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe_01 {
	
	public static void mostrarFila(Queue<String> fila) {
		if(!fila.isEmpty()) {
			System.out.println("\nFila: ");
			fila.forEach(System.out::println);
		} else 
			System.out.println("\nA Fila está vazia!");
	}

	public static void main(String[] args) {
		Queue<String> clientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;
		
		while(opcao != 0) {
			System.out.println("*******************************");
			System.out.println(" 1 - Adicionar cliente na fila ");
			System.out.println(" 2 - Listar todos os clientes  ");
			System.out.println(" 3 - Retirar cliente da fila   ");
			System.out.println(" 0 - Sair                      ");
			System.out.println("*******************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				clientes.add(leia.next());
				mostrarFila(clientes);
				System.out.println("\nCliente adicionado!");
				break;
			case 2:
				mostrarFila(clientes);
				break;
			case 3:
				if(clientes.isEmpty())
					System.out.println("\nA fila está vazia");
				else {
					clientes.remove();
					mostrarFila(clientes);
					System.out.println("\nO cliente foi chamado!");
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			default:
				System.out.println("\nDigite uma opção válida");
				break;
			}
		}
		leia.close();
	}

}
