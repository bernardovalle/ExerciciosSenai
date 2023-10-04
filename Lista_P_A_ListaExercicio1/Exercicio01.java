package Lista_P_A_ListaExercicio1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informa um número para ver sua tabuada");
		int number = leia.nextInt();
		
		
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println(number+"x"+cont +" = "+cont * number);
		}
		

	}

}
