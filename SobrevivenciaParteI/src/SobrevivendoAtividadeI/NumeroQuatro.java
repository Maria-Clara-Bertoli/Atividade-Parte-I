package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroQuatro {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		float soma = 0;
		System.out.println("Informe quatro notas: ");
		for(int i = 0; i < 4; i++) {
			float nota = valor.nextFloat();
			soma = soma + nota;
		}
		System.out.println("A média é " + ati.Media(soma));

	}

}
