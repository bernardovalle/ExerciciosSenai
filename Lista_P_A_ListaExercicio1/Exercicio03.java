package Lista_P_A_ListaExercicio1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		int cont = 0, media  = 0;
		int numerosDigitados = 1;
		do {
			System.out.println("Informe os numeros até o 0");
			opcao = leia.nextInt();
			cont += opcao;
			numerosDigitados += numerosDigitados;
			media = cont / numerosDigitados;
		} while (opcao != 0); 
		
		System.out.println("A media dos numeros é " + media);
	}

}
