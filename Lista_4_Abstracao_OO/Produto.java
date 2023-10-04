package Lista_4_Abstracao_OO;

public class Produto {

	private String nome;
	private double peso;
	private double preco;
	
	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}
	

	public void aumentarPreco(Produto p) {
		if (p.preco < 50) {
			double reajuste = (preco * 20) / 100 ;
			p.preco += reajuste;
			
			System.out.println("O reajuste foi de R$"+reajuste+", e seu preço é R$"+p.preco);
		} else if(p.preco >= 50) {
			double reajuste = (preco * 10) / 100 ;
			p.preco += reajuste ;
			System.out.println("O reajuste foi de R$"+reajuste+", e seu preço é R$"+p.preco);
		}
	}
	
	
	
}
