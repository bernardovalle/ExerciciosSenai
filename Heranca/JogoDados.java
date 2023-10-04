package Heranca;

public class JogoDados extends Jogo {
	
	private String tipoDado;
	private int quantidadeDados;
	
	
	// construtores
	public JogoDados() {
		
	}
	
	public JogoDados(String tipoDado, int quantidadeDados) {
		super();
		this.tipoDado = tipoDado;
		this.quantidadeDados = quantidadeDados;
	}

	// métodos
	public void arremessarDado() {
		System.out.println("Dado arremessado.");
	}
	
	// get e set
	public String getTipoDado() {
		return tipoDado;
	}


	public void setTipoDado(String tipoDado) {
		this.tipoDado = tipoDado;
	}


	public int getQuantidadeDados() {
		return quantidadeDados;
	}


	public void setQuantidadeDados(int quantidadeDados) {
		this.quantidadeDados = quantidadeDados;
	}

	@Override
	public void infoJogo() {
		System.out.println("Nome: "+nome+
				"/ Distribuidora: "+distribuidora+
				"/ Número Jogadores: "+nrJogadores+
				"/ Faixa Etaria: "+faixaEtaria+
				"/ Tipo: "+tipoDado+
				"/ Quantidade de Dados: "+quantidadeDados);
		
	}

}
