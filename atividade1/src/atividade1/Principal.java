package atividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Turma turma = new Turma();
		int opcao;
		do {
			
			listarMenu();
			opcao = leia.nextInt();
			
			switch (opcao) {	
			case 1:
				System.out.println("Cadastro de turma!");
				System.out.println("INFORME O NOME DA TURMA:");
				turma.setNome(leia.next());
				System.out.println("INFORME O NOME DO PROFESSOR:");
				String nomeProfessor = leia.next();
				System.out.println("INFORME A IDADE DO PROFESSOR:");
				int idadeProfessor = leia.nextInt();
				System.out.println("INFORME O SALARIO DO PROFESSOR:");
				double salario = leia.nextDouble();
				
				Professor professor = new Professor();
				professor.setNome(nomeProfessor);
				professor.setIdade(idadeProfessor);
				professor.setSalario(salario);
				
				turma.adicionarProfessor(professor);
				
				System.out.println("Informe quantos alunos a turma terá:");
				int n = leia.nextInt();
				for(int i=0; i<n;i++) {
					System.out.println((i+1)+"º");
					System.out.println("INFORME O NOME DO ALUNO:");
					String nomeAluno = leia.next();
					System.out.println("INFORME A IDADE DO ALUNO:");
					int idadeAluno = leia.nextInt();
					System.out.println("INFORME A NOTA DO ALUNO:");
					double nota = leia.nextDouble();
					
					Aluno aluno = new Aluno();
			
					aluno.setNome(nomeAluno);
					aluno.setIdade(idadeAluno);
					aluno.setNota(nota);
				
					turma.adicionarAluno(aluno);
				}
				break;
			case 2:
				turma.visualizarTuma();
				break;
			case 3:
				System.out.println("Voce Saiu!");
				break;
			}
	
		}while(opcao != 3);
		
	}
	
	public static void listarMenu() {
		System.out.println("1 - Cadastrar Truma\n" +
				   "2 - Listar Turma\n"+
				   "3 - Sair\n");	  
		}
}
