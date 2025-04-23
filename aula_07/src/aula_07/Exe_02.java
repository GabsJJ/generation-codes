package aula_07;

import java.util.Stack;
import java.util.Scanner;

public class Exe_02 {

	public static void mostrarPilha(Stack<String> pilha) {
		if(!pilha.isEmpty()) {
			System.out.println("\nPilha: ");
			pilha.forEach(System.out::println);
		} else 
			System.out.println("\nA pilha está vazia!");
	}
	
	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;
		
		while(opcao != 0) {
			System.out.println("*******************************");
			System.out.println(" 1 - Adicionar livro na pilha  ");
			System.out.println(" 2 - Listar todos os livros    ");
			System.out.println(" 3 - Retirar livro da pilha    ");
			System.out.println(" 0 - Sair                      ");
			System.out.println("*******************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				livros.add(leia.next());
				mostrarPilha(livros);
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				mostrarPilha(livros);
				break;
			case 3:
				if(livros.isEmpty())
					System.out.println("\nA pilha está vazia!");
				else {
					livros.pop();
					mostrarPilha(livros);
					System.out.println("\nUm livro foi retirado da pilha!");
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
