package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroOito {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe quanto vale a sua hora: ");
		float grana = valor.nextFloat();
		System.out.println("Informe quantas horas você trabalha no mês: ");
		int hora = valor.nextInt();
		System.out.println("Seu salário mensal é de " + ati.Salario(grana, hora) + " reais");
	}

}
