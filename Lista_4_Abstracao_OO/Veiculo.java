package Lista_4_Abstracao_OO;

public class Veiculo {
	private int ano;
	private String modelo;
	private String cor;
	private int quilometragem;
	
	public Veiculo(int ano, String modelo, String cor, int quilometragem) {
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.quilometragem = quilometragem;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	
	public void verificarManutencao() {
		if(quilometragem < 25000) {
			System.out.println("Tudo ok!");
		} else if (quilometragem >= 25000 && quilometragem <= 75000) {
			System.out.println("Realizar manutenção.");
		} else {
			System.out.println("Realizar manutenção completa.");
		}
	}
	
	public void mudarCor(String cor) {
		this.cor = cor;
	}
	
	public void exibirCor() {
		System.out.println(cor);
	}

}
