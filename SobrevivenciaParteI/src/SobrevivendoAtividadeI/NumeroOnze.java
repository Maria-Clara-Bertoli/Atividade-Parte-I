package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroOnze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe a altura: ");
		double altura = valor.nextDouble();
		System.out.println("O peso ideal é " + ati.PesoIdeal(altura));
		
	}

}
