package aula_03;

import java.util.Scanner;

public class Exe_04 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String filo, classe, dieta;
		
		System.out.print("1� Caracter�stica: ");
		filo = leia.next();
		System.out.print("\n2� Caracter�stica: ");
		classe = leia.next();
		System.out.print("\n3� Caracter�stica: ");
		dieta = leia.next();
		
		if(filo.equalsIgnoreCase("Vertebrado")) {
			if(classe.equalsIgnoreCase("Ave")) {
				if(dieta.equalsIgnoreCase("carn�voro") || dieta.equalsIgnoreCase("carnivoro")) {
					System.out.println("�guia");
				} else if(dieta.equalsIgnoreCase("on�voro") || dieta.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				} else 
					System.out.println("Dieta inv�lida");
			} else if(classe.equalsIgnoreCase("mamifero") || classe.equalsIgnoreCase("mam�fero")) {
				if(dieta.equalsIgnoreCase("on�voro") || dieta.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else if(dieta.equalsIgnoreCase("herb�voro") || dieta.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				} else
					System.out.println("Dieta inv�lida");
			} else
				System.out.println("Classe inv�lida");
		} else if (filo.equalsIgnoreCase("Invertebrado")) {
			if(classe.equalsIgnoreCase("Inseto")) {
				if(dieta.equalsIgnoreCase("hemat�fago") || dieta.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				} else if(dieta.equalsIgnoreCase("herb�voro") || dieta.equalsIgnoreCase("herbivoro")) {
					System.out.println("Lagarta");
				} else
					System.out.println("Dieta inv�lida");
			} else if(classe.equalsIgnoreCase("anelideo") || classe.equalsIgnoreCase("anel�deo")) {
				if(dieta.equalsIgnoreCase("hemat�fago") || dieta.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				} else if(dieta.equalsIgnoreCase("herb�voro") || dieta.equalsIgnoreCase("herbivoro")) {
					System.out.println("Minhoca");
				} else
					System.out.println("Dieta inv�lida");
			} else
				System.out.println("Classe inv�lida");
		} else
			System.out.println("Filo inv�lido");
		
		leia.close();
	}
}
