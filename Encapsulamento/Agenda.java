package Encapsulamento;

public class Agenda {

	Pessoa[] agenda = new Pessoa[10];
	
	public void armazenarPessoa(String nome, int idade, float altura, int index) {
		Pessoa p = new Pessoa();
		
		p.setNome(nome);
		p.setIdade(idade);
		p.setAltura(altura);
		
		agenda[index]=p;
		
	}

	public void removerPessoa(String nome) {
		// Feito a comparação se a lista não é vazia e comparação pelo nome do parametro,
		// sem essa comparação estava dando erro.
		for(int i=0;i<agenda.length;i++) {
			if (agenda[i] != null && agenda[i].getNome().equals(nome)) {
				agenda[i] = null;
				break;
			} 
		}
		
	}

	public int buscarPessoa(String nome) {
		int posicao =999999;
		for(int i=0;i<agenda.length;i++) {
			if (agenda[i].getNome().equals(nome)) {
				posicao = i;
				return  posicao;
			} 
		}
		return posicao;
		
	}

	public void imprimirAgenda() {
		for(int i=0;i<agenda.length;i++) {
			// para evitar o erro de que a agenda estiver vazia, fazer a comparação antes de imprimir
			if (agenda[i] != null) {
		        System.out.println("Nome - " + agenda[i].getNome() + ". Idade - " + agenda[i].getIdade() + ". Altura - " + agenda[i].getAltura());
		    } else {
		        System.out.println("Posição - "+i+", vazia na agenda.");
		    }
		}
	}

	public void imprimirPessoa(int index) {
		if(agenda[index] != null) {
			System.out.println("Nome - "+agenda[index].getNome()+". Idade - "+agenda[index].getIdade()+". Altura - "+agenda[index].getAltura());
		} else {
			 System.out.println("Não tem pessoa agendada nessa posição.");
		}
		
	}

}
