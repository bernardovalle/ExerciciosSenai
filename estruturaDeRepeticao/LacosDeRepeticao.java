package estruturaDeRepeticao;

import java.util.Scanner;

public class LacosDeRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comando para
		
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i< 10; i++) {
			System.out.println("I = "+(i+1));
		}
		// comando enquanto
		
		int contador = 1;
		while(contador <= 10) {
			System.out.println("Contador = "+contador);
			// lembrar de colocar um contador++ pois pode ficar rodando infinitamente.
			contador++;
		}
		// comando repita
		int opcao;
		do {
			System.out.println("Contador = "+contador);
			opcao = ler.nextInt();
		}while(opcao != 3);
	}

}
