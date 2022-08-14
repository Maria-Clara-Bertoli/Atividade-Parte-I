package SobrevivendoAtividadeI;

import java.util.Scanner;

public class NumeroDoze {

	public static void main(String[] args) {
	
		Scanner valor = new Scanner (System.in);
		
		Atividade ati = new Atividade();
		
		System.out.println("Informe 'M' para masculino e 'F' para feminino: ");
		char sexo = valor.next().charAt(0);
		System.out.println("Informe a altura: ");
		double altura = valor.nextDouble();
		System.out.println("O peso ideal é " + ati.PesoIdealSexo(altura, sexo));
	}

}
