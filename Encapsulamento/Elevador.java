package Encapsulamento;

public class Elevador {

	private int quantidadePessoas;
	private int capacidade;
	private int andarAtual;
	private int totalAndares;

	public void inicializar(int capacidadeElevalor, int quantidadeAndares) {
		this.andarAtual = 0;
		this.quantidadePessoas = 0;
		totalAndares = quantidadeAndares;
		capacidade = capacidadeElevalor;
	}

	public void entrar() {
		if (quantidadePessoas >= capacidade) {
			System.out.println("O elevador está lotado.");
		} else {
			quantidadePessoas++;
		}
	}

	public void sair() {
		if (quantidadePessoas <= 0) {
			System.out.println("O elevador está vaziu.");
		} else {
			quantidadePessoas--;
		}
	}

	public void subir() {
		if (andarAtual < totalAndares) {
			andarAtual++;
		} else {
			System.out.println("O elevador está no ultimo andar.");
		}
	}

	public void descer() {
		if (andarAtual > 0) {
			andarAtual--;
		} else {
			System.out.println("O elevador está no ultimo andar.");
		}
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

}
