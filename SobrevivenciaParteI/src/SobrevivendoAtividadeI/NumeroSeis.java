package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroSeis {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		Atividade ati = new Atividade();
		
		System.out.println("Informe o raio do c�rculo: ");
		double raio = valor.nextDouble();
		System.out.println("A �rea do c�rculo � " + ati.AreaCirculo(raio));
		
		

	}

}
