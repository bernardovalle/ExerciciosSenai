package Lista_4_Abstracao_OO;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =  new Scanner(System.in);
		System.out.println("Informe o nome do aluno:");
		String nome = leia.next();
		System.out.println("Informe a idade do aluno:");
		int idade = leia.nextInt();

		Aluno aluno = new Aluno(nome, idade);
		
		System.out.println("Voce cadastrou o aluno "+aluno.getNome());
		
		System.out.println("Agora calcule a média:");
		double n1,n2,n3;
		
		System.out.println("Nota 1:");
		n1 = leia.nextDouble();
		System.out.println("Nota 2:");
		n2 = leia.nextDouble();
		System.out.println("Nota 3:");
		n3 = leia.nextDouble();
		
		System.out.println("Média: "+aluno.calcularMedia(n1, n2, n3));
		aluno.verificarMedia();
		
		leia.close();
	}

}
