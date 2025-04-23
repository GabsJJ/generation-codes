package aula_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
		
		System.out.print("Digite o número que deseja encontrar: ");
		int numero = leia.nextInt();
		
		boolean encontrado = false;
		Iterator<Integer> isetNumeros = numeros.iterator();
		while(isetNumeros.hasNext()) {
			int i = isetNumeros.next();
			if(i == numero)
				encontrado = true;
		}
		if(encontrado)
			System.out.printf("O número %d foi encontrado!", numero);
		else
			System.out.printf("O número %d não foi encontrado!", numero);
		
		leia.close();
	}

}
