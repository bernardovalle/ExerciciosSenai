package Lista_4_Abstracao_OO;

import java.util.ArrayList;

public class CadernoAnotacoes {
	
	private ArrayList<String> listaAnotacoes;

	public CadernoAnotacoes(ArrayList<String> listaAnotacoes) {

		this.listaAnotacoes = listaAnotacoes;
	}

	public ArrayList<String> getListaAnotacoes() {
		return listaAnotacoes;
	}

	public void setListaAnotacoes(ArrayList<String> listaAnotacoes) {
		this.listaAnotacoes = listaAnotacoes;
	}
	
	public void adicionarAnotacoes(String anotacao) {
		listaAnotacoes.add(anotacao);
	}
	
	public void visualizarLista() {
		for (String x : listaAnotacoes) {
			System.out.println("Item - "+x);
		}
	}

	public void removerAnotacao() {
		listaAnotacoes.removeAll(listaAnotacoes);
	}
	

}
