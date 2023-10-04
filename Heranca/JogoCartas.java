package Heranca;

public class JogoCartas extends Jogo {
	private String tamanhoCartas;
	private int quantidadeCartas;
	
	
	
	// construtores
	
	public JogoCartas() {
		
	}
	public JogoCartas(String tamanhoCartas, int quantidadeCartas) {
		super();
		this.tamanhoCartas = tamanhoCartas;
		this.quantidadeCartas = quantidadeCartas;
	}
	
	// métodos
	
	public void comprarCarta() {
		System.out.println("Carta comprada.");
	}
	public void descartarCarta() {
		System.out.println("Carta descartada.");
	}
	public void jogarCarta() {
		System.out.println("Carta jogada");
	}
	
	// get e set
	public String getTamanhoCartas() {
		return tamanhoCartas;
	}
	public void setTamanhoCartas(String tamanhoCartas) {
		this.tamanhoCartas = tamanhoCartas;
	}
	public int getQuantidadeCartas() {
		return quantidadeCartas;
	}
	public void setQuantidadeCartas(int quantidadeCartas) {
		this.quantidadeCartas = quantidadeCartas;
	}
	@Override
	public void infoJogo() {
		// TODO Auto-generated method stub  
		
		System.out.println("Nome: "+nome+
				"/ Distribuidora: "+distribuidora+
				"/ Número Jogadores: "+nrJogadores+
				"/ Faixa Etaria: "+faixaEtaria+
				"/ Tamanho: "+tamanhoCartas+
				"/ Quantidade Peças: "+quantidadeCartas);
	}

}
