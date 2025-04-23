package aula_07;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		pilha.add("1");
		pilha.add("2");
		pilha.add("3");
		pilha.add("4");
		pilha.add("5");
		pilha.add("6");
		pilha.add("7");
		
		System.out.println(pilha);
		pilha.pop();
		System.out.println(pilha);
		
		pilha.push("8");
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
	}

}
