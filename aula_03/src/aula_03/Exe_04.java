package aula_03;

import java.util.Scanner;

public class Exe_04 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String filo, classe, dieta;
		
		System.out.print("1ª Característica: ");
		filo = leia.next();
		System.out.print("\n2ª Característica: ");
		classe = leia.next();
		System.out.print("\n3ª Característica: ");
		dieta = leia.next();
		
		if(filo.equalsIgnoreCase("Vertebrado")) {
			if(classe.equalsIgnoreCase("Ave")) {
				if(dieta.equalsIgnoreCase("carnívoro") || dieta.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				} else if(dieta.equalsIgnoreCase("onívoro") || dieta.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				} else 
					System.out.println("Dieta inválida");
			} else if(classe.equalsIgnoreCase("mamifero") || classe.equalsIgnoreCase("mamífero")) {
				if(dieta.equalsIgnoreCase("onívoro") || dieta.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else if(dieta.equalsIgnoreCase("herbívoro") || dieta.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				} else
					System.out.println("Dieta inválida");
			} else
				System.out.println("Classe inválida");
		} else if (filo.equalsIgnoreCase("Invertebrado")) {
			if(classe.equalsIgnoreCase("Inseto")) {
				if(dieta.equalsIgnoreCase("hematófago") || dieta.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				} else if(dieta.equalsIgnoreCase("herbívoro") || dieta.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				} else
					System.out.println("Dieta inválida");
			} else if(classe.equalsIgnoreCase("anelideo") || classe.equalsIgnoreCase("anelídeo")) {
				if(dieta.equalsIgnoreCase("hematófago") || dieta.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				} else if(dieta.equalsIgnoreCase("herbívoro") || dieta.equalsIgnoreCase("herbivoro")) {
					System.out.println("Minhoca");
				} else
					System.out.println("Dieta inválida");
			} else
				System.out.println("Classe inválida");
		} else
			System.out.println("Filo inválido");
		
		leia.close();
	}
}
