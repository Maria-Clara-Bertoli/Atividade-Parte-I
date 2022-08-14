package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroSeis {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		Atividade ati = new Atividade();
		
		System.out.println("Informe o raio do círculo: ");
		double raio = valor.nextDouble();
		System.out.println("A área do círculo é " + ati.AreaCirculo(raio));
		
		

	}

}
