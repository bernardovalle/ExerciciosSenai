package estruturaDeRepeticao;

import java.util.Scanner;

public class SelecaoMultipla {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("Informe uma opção");
		opcao = ler.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Opção 1");
			break;
		case 2:
			System.out.println("Opção 2");
			break;
		case 3:
			System.out.println("Opção 3");
			break;
		default:
			System.out.println("Opção inválida");
			break;
	
		}

	}

}
