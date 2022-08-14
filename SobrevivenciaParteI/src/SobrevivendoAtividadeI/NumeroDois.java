package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroDois {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe um número: ");
		int numero = valor.nextInt();
		System.out.println("O número informado foi " + ati.numeroInformado(numero));
		

	}

}
