package Lista_4_Abstracao_OO;

public class Exericicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto;
		
		produto = new Produto("TV", 10, 40);
		produto.aumentarPreco(produto);
		produto = new Produto("TV", 10, 400);
		produto.aumentarPreco(produto);
		produto = new Produto("TV", 10, 550);
		produto.aumentarPreco(produto);

	}

}
