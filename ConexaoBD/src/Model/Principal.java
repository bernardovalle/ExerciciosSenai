package Model;

import DAO.PagamentoDAO;
import DAO.ProdutoDAO;
import DAO.VendaDAO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto p = new Produto("Banana",5.0,100);
		ProdutoDAO produtoDAO =  new ProdutoDAO();
		produtoDAO.creat(p);
		
		Venda venda =  new Venda(100.00);
		VendaDAO vendaDAO = new VendaDAO();
		vendaDAO.creat(venda);
		
		Pagamento pag =  new Pagamento(1);
		PagamentoDAO pagamentoDAO = new PagamentoDAO();
		pagamentoDAO.creat(pag);
		
	}

}
