package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroQuatorze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe quanto você ganha por hora: ");
		double real = valor.nextDouble();
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		int horas = valor.nextInt();
		ati.FolhaDePagamento(real, horas);

	}

}
