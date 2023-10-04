package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a nota 1:");
		int  nota1 = ler.nextInt();
		
		System.out.println("Informe a nota 2:");
		int  nota2 = ler.nextInt();
		
		System.out.println("Informe a nota 3:");
		int  nota3 = ler.nextInt();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media > 7) {
			System.out.println("Aluno Aprovado!");
		} else if (media >= 5 && media <= 7) {
			System.out.println("Aluno em Exame!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}