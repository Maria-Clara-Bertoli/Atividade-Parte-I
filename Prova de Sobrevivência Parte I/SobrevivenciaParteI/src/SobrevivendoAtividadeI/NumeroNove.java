package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroNove {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe a temperatura em graus Farenheit: ");
		double temperatura = valor.nextDouble();
		System.out.println("A temperatura convertida é " + ati.ConversaoTemperatura(temperatura));
		

	}

}
