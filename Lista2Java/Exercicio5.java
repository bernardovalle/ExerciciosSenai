package Lista2Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia =  new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<>();

		for(int i=0; i < 5;i++) {
			notas.add(leia.nextInt());
		}
		System.out.println("Nota: " + notas);
		
		// usado para fazer a lista reversa
		Collections.reverse(notas);
		System.out.println("Nota: " + notas);
	}

}
