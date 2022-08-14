package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroTreze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe o peso de peixes: ");
		double peixe = valor.nextDouble();
		ati.PesoPeixe(peixe);
	}

}
