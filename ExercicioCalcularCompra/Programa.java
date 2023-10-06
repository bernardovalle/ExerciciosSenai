package ExercicioCalcularCompra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =  new Scanner(System.in);
		List<Produto> listProduct = new ArrayList<Produto>();
		
		System.out.println("Quantos produtos?");
		int n = leia.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.println("Nome do produto: ");
			String nome = leia.next();
			System.out.println("Quantidade do produto: ");
			int quantidade = leia.nextInt();
			System.out.println("Preço do produto: ");
			double preco = leia.nextDouble();
			listProduct.add(new Produto(nome, preco, quantidade));
		}
		System.out.println("Valor total da compra R$ "+calcularValorfinal(listProduct));
		leia.close();
	}
	
	public static double calcularValorfinal(List<Produto> produtos) {
		double valorTotal = 0 ,valorTotalItem = 0;
		for (int i=0; i<produtos.size(); i++) {
			valorTotalItem = produtos.get(i).getPreco() * produtos.get(i).getQuantidade() ;
			if (produtos.get(i).getQuantidade() > 3) {
				valorTotalItem -= valorTotalItem * 0.05;
				valorTotal += valorTotalItem;
 			} else {
 				valorTotal += valorTotalItem;
 			}
		}
		return valorTotal;
	}

}
