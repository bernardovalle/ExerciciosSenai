package Lista_4_Abstracao_OO;

public class Aluno {

	private String nome;
	private int idade;
	private double media;
	
	
	public Aluno (String nome, int idade, double media) {
		this.nome = nome;
		this.idade = idade;
		this.media = media;
	}
	public Aluno (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public double calcularMedia(double n1, double n2, double n3) {
		this.media = (n1+n2+n3) / 3;
		return this.media;
	}
	
	public void verificarMedia() {
		if (this.media < 5) {
			System.out.println("Reprovado.");
		} else if(this.media >= 5 && this.media < 7) {
			System.out.println("Em exame.");
		} else if(this.media >= 7) {
			System.out.println("Aprovado.");
		}
	}
	
}
