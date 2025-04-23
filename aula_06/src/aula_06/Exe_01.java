package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		System.out.println("*****************************");
		System.out.println("    Digite 5 cores abaixo    ");
		System.out.println("*****************************");
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%dª Cor: ", i + 1);
			cores.add(leia.next());
		}
		
		System.out.println("\nListar todas as cores:");
		cores.forEach(System.out::println);
		
		cores.sort(null);
		System.out.println("\nOrdenar as cores:");
		cores.forEach(System.out::println);
		leia.close();
	}

}
