package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabrício");
		fila.add("Victor");
		
		System.out.println(fila);
		fila.remove();
		System.out.println(fila);
		fila.add("Thiago");
		System.out.println(fila);
		System.out.println(fila.peek()); //primeiro da fila
		System.out.println(fila.poll()); //exibe o primeiro da fila e remove
		System.out.println("A Maria está na fila? " + fila.contains("Maria"));
		System.out.println("Tamanho da fila: " + fila.size());
	}

}
