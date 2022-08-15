package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroDez {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe o primeiro valor inteiro: ");
		int valor1 = valor.nextInt();
		System.out.println("Informe o segundo valor inteiro: ");
		int valor2 = valor.nextInt();
		System.out.println("Informe um valor real: ");
		double valor3 = valor.nextDouble();
		ati.Conta(valor1, valor2, valor3);

	}

}
