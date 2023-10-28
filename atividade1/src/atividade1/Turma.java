package atividade1;

import java.util.ArrayList;

public class Turma {
	
	private String nome;
	private Professor professor;
	private ArrayList<Aluno> listaDeAlunos;
	
	public Turma() {
		
	}
	
	public void adicionarAluno(Aluno aluno) {
		if (listaDeAlunos==null) {
			listaDeAlunos = new ArrayList<Aluno>();
			listaDeAlunos.add(aluno);
		} else {
			listaDeAlunos.add(aluno);
		}
		
	}

	public void adicionarProfessor(Professor professor) {
		if(this.professor != null) {
			System.out.println("Essa turma já tem o "+professor.getNome()+" cadastrado.");
		}
		this.professor = professor;
	}
	
	public void visualizarTuma() {
		if (listaDeAlunos == null) {
			System.out.println("Turma vazia");
		} else {
			System.out.println("Professor "+this.professor.getNome()+". Turma: "+getNome());
			for(Aluno x:listaDeAlunos) {
				System.out.println("Aluno "+x.getNome());
			}
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
