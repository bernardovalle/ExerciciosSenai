package Heranca;

public abstract class Jogo {
	//Atributos
	
	protected String nome;
	protected String distribuidora;
	protected int nrJogadores;
	protected int faixaEtaria;
	
	public Jogo(){
		
	}

	public Jogo(String nome, String distribuidora, int nrJogadores, int faixaEtaria) {
		this.nome = nome;
		this.distribuidora = distribuidora;
		this.nrJogadores = nrJogadores;
		this.faixaEtaria = faixaEtaria;
	}

	// Metodos
//	public void infoJogo() {
//		System.out.println("Nome: "+nome+
//							"/ Distribuidora: "+distribuidora+
//							"/ Número Jogadores: "+nrJogadores+
//							"/ Faixa Etaria: "+faixaEtaria);
//	}
	public abstract void infoJogo();
	
	public void jogar() {
		System.out.println("Voce está jogando.");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public int getNrJogadores() {
		return nrJogadores;
	}

	public void setNrJogadores(int nrJogadores) {
		this.nrJogadores = nrJogadores;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	
	
	
	
}
