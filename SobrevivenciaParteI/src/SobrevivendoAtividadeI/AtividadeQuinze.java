package SobrevivendoAtividadeI;

import java.util.Scanner;

public class AtividadeQuinze {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe o tamanho da �rea que ser� pintada: ");
		double area = valor.nextDouble();
		ati.Pintura(area);
		
		valor.close();

	}

}
