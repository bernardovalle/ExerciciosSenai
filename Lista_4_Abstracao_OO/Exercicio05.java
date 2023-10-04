package Lista_4_Abstracao_OO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		List<String> lista = new ArrayList<String>();
		Scanner leia =  new Scanner(System.in);
		
		do {
			System.out.println("");
			System.out.println("------------------------");
			System.out.println("1-Adicionar Anotação");
			System.out.println("2-Visualizar Anotações");
			System.out.println("3-Apagar anotações");
			System.out.println("4-Sair");
			opcao = leia.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite a sua anotação:");
				String anotacao = leia.next();
				lista.add(anotacao);
				break;
			case 2:
				System.out.println("Lista - ");
				for(String x : lista) {
					System.out.println(x);
				}
				break;
			case 3:
				lista.removeAll(lista);
				break;
			case 4:
				System.out.println("Finalizando.");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}while (opcao != 4);
		leia.close();
	}

}
