package estruturaDeRepeticao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		notas.add(1);
		notas.add(4454);
		notas.add(200);
		notas.add(55);
		notas.add(45);
		System.out.println(notas);
		// para poder remover o ultimo elemento da lista
		 notas.remove(notas.size()-1);
		System.out.println(notas);
		// tamanho total da lista
		System.out.println(notas.size());
		// lista vazia
		System.out.println(notas.isEmpty());
		// limpar lista
		//notas.clear();
		System.out.println(notas);
		// ordenação de lista
		Collections.sort(notas);
		System.out.println(notas);
		//ordenação invertida
		Collections.reverse(notas);
		System.out.println(notas);


		// opçoes de visualização
		// forEach opção 1
//		for (int i : notas) {
//			System.out.println(i);
//		}
//		// forEach opção 2
//		notas.forEach(i ->{System.out.println(i);});
//		// forEach 
//		for(int i =0; i <= notas.size(); i++) {
//			System.out.println("Nota - "+i+" "+notas.get(i));
//		}
	}

}
