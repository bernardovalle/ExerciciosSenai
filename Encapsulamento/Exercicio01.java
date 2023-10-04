package Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Agenda agenda= new Agenda();
		Scanner leia =  new Scanner(System.in);
		
		for(int i=0;i<2; i++) {
			System.out.println("Informe o nome da pessoa:");
			String nome = leia.next();
			System.out.println("Informe a idade da pessoa:");
			int idade = leia.nextInt();
			System.out.println("Informe a altura da pessoa:");
			double altura = leia.nextDouble();
			agenda.armazenarPessoa(nome, idade, idade,i);
		}
		
		System.out.println("Posição "+agenda.buscarPessoa("Bernardo"));
		System.out.println("Agenda -------------");
		agenda.imprimirAgenda();
		
		agenda.imprimirPessoa(3);
		System.out.println("Removendo -------------");
		agenda.removerPessoa("Bernardo");
		System.out.println("-------------");

	}

}
