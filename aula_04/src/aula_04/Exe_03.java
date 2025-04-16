package aula_04;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, menores_21 = 0, maiores_50 = 0;
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade < 21 && idade >= 0)
				menores_21++;
			if(idade > 50)
				maiores_50++;
		}
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menores_21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maiores_50);
		leia.close();
	}

}
