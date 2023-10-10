package Model;

import java.util.ArrayList;

public class Venda {
	
	private Double vlrTotal;
	//private ArrayList<Produto> produto;
	
	public Venda() {
		super();
	}
	public Venda(Double vlrTotal) {
		this.vlrTotal = vlrTotal;
		
	}
	
	public void adicionarItemVenda(Produto prod) {
		
	}
	
	public void visualizarVenda() {
		
	}
	
	public void concluirVenda(Pagamento pag) {
		
	}
	
	public Double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(Double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	
	
	
	
}
