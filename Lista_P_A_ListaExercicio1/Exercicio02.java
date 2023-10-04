package Lista_P_A_ListaExercicio1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int number = leia.nextInt();
		
		
		for (int cont = 1; cont <= number; cont++) {
			System.out.println(cont);
		}

	}

}
