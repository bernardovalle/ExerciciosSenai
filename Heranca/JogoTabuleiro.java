package Heranca;

public class JogoTabuleiro extends Jogo {
	private String tamanhoTabuleiro;
	private int quantidadePecas;
	
	public JogoTabuleiro() {
		
	}
	
	public JogoTabuleiro(String tamanhoTabuleiro, int quantidadePecas) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
		this.quantidadePecas = quantidadePecas;
	}

	// Metodos
	
	public void setupTabuleiro() {
		System.out.println("Tabuleiro montado");
	}
	
	public void moverPeca() {
		System.out.println("Tabuleiro montado");
	}
	

	public String getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}


	public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}


	public int getQuantidadePecas() {
		return quantidadePecas;
	}


	public void setQuantidadePecas(int quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}

	@Override
	public void infoJogo() {
		System.out.println("Nome: "+nome+
				"/ Distribuidora: "+distribuidora+
				"/ Número Jogadores: "+nrJogadores+
				"/ Faixa Etaria: "+faixaEtaria+
				"/ Tamanho: "+tamanhoTabuleiro+
				"/ Quantidade Peças: "+quantidadePecas);
		
	}
	
	
	

}
