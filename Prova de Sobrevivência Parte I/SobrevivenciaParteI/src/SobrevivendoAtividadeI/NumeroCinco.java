package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroCinco {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe a quantidade em metros: ");
		float metros = valor.nextFloat();
		System.out.println("A quantidade em centímetros é: " + ati.Conversao(metros));
	}

}
