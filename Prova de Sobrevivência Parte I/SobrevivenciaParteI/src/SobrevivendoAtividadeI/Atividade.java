package SobrevivendoAtividadeI;

public class Atividade {
	
	private float a;
	private double b;
	private double c;
	private double peso;
	private double excesso;
	private double multa;
	private double salariobruto;
	private double sindicato;
	private double inss;
	private double ir;
	private double salarioliquido;
	private double desconto;
	private double totallitros;
	private double latas;
	private double preco;
	private double galoes;
	private double preco2;

	public String Alo() {
		return "Alo mundo!";
	}

	public int numeroInformado(int valor) {
		return valor;
	}

	public float Soma(float valor1, float valor2) {
		float soma = valor1 + valor2;
		return soma;
	}
	
	public float Media(float soma){
		return soma/4;
	}
	
	public float Conversao(float metros) {
		return metros * 100;
	}
	
	public double AreaCirculo(double raio) {
		return 3.14 * Math.pow(raio, 2);
	}
	
	public double AreaQuadrado(double lado) {
		return Math.pow(lado, 2);
	}
	
	public float Salario(float grana, int hora) {
		return grana * hora;
	}
	
	public double ConversaoTemperatura(double temperatura) {
		return (temperatura - 32)/1.8;
	}
	
	public void Conta(int valor1, int valor2, double valor3){
		a = (valor1 * 2) * (valor2/2);
		b = (valor1 * 3) + valor3;
		c = Math.pow(valor3, 3);
		System.out.println("Letra a: " + a);
		System.out.println("Letra b: " + b);
		System.out.println("Letra c: " + c);
	}
	
	public double PesoIdeal(double altura) {
		return (72.7 * altura) - 58;
	}
	
	public double PesoIdealSexo(double altura, char tipo) {
		if (tipo == 'F') {
			peso = (62.1 * altura) - 44.7;
		}
		else
			peso = (72.7 * altura) - 58;
		return peso;
	}
	
	public void PesoPeixe(double peso) {
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
		}
		else {
			excesso = 0;
			multa = 0;
		}
		System.out.println("O excesso de peso � " + excesso + " quilos" + " e a multa � " + multa +" reais.");
	}
	
	public void FolhaDePagamento(double real, int hora) {
		salariobruto = real * hora;
		ir = (salariobruto/100)*11;
		inss = (salariobruto/100)*8;
		sindicato = (salariobruto/100)*5;
		salarioliquido = salariobruto - ir -inss - sindicato;
		desconto = inss + ir + sindicato;
		System.out.println("---------------------");
		System.out.println("FOLHA DE PAGAMENTO");
		System.out.println("---------------------");
		System.out.println("Sal�rio Bruto: " + salariobruto);
		System.out.println("IR: " + ir);
		System.out.println("INSS: " + inss);
		System.out.println("Salario L�quido: " + salarioliquido);
		System.out.println("Descontos: " + desconto);
	}
	
	public void Pintura(double area) {
		totallitros = area/3;
		latas = totallitros/18;
		preco = latas * 80;
		System.out.println("A quantidade de latas que devem ser compradas s�o " + latas + " e o valor total � " + preco + " reais");
	}
	
	public void Pintura2(double area) {
		totallitros = area/6;
		latas = totallitros/18;
		preco = latas * 80;
		galoes = totallitros/3.6;
		preco2 = galoes * 25;
		System.out.println("Para litros: A quantidade de latas que devem ser compradas s�o " + latas + " e o valor total � " + preco + " reais");
		System.out.println("Para gal�es: A quantidade de gal�es que devem ser comprados s�o " + galoes + " e o valor total � " + preco2 + " reais");
	}

}
