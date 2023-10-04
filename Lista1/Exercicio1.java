package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler =  new Scanner(System.in);
		
		int valorHora;
		double totalGanho;
		
		System.out.println("Valor por hora:");
		valorHora = ler.nextInt();
		
		System.out.println("Horas Trabalhadas no mes: ");
		totalGanho = ler.nextDouble();
		
		double total = valorHora * totalGanho;
		
		System.out.println("Volar mensal - "+total);
		
	}

}
