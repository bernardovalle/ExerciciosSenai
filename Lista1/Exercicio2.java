package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		double custoFabrica;
		
		double distribuidor = 0.28;
		
		double imposto = 0.45;
		
		System.out.println("Valor fabrica: ");
		custoFabrica = ler.nextDouble();
		
		double totalDistribuidor = custoFabrica * distribuidor;
		double totalImposto = custoFabrica * imposto;
		
		double totalCarro = custoFabrica + totalDistribuidor + totalImposto;
		
		
		System.out.println("Volar Total - "+totalCarro);
		
	}

}
