package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroOito {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe quanto vale a sua hora: ");
		float grana = valor.nextFloat();
		System.out.println("Informe quantas horas voc� trabalha no m�s: ");
		int hora = valor.nextInt();
		System.out.println("Seu sal�rio mensal � de " + ati.Salario(grana, hora) + " reais");
	}

}
