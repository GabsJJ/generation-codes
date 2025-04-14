package aula_02;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.print("Adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.print("Horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.print("Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("\nSalário líquido: %.2f", salarioLiquido);
		leia.close();

	}

}
