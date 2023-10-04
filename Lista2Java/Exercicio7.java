package Lista2Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio7 {
	
	public static void maiorMenor() {
		Scanner leia =  new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<>();
		
		for (int i=0; i<5; i++) {
			valores.add(leia.nextInt());
		}
		System.out.println("Valor Maior: " + Collections.max(valores));
		System.out.println("Valor Menor: " + Collections.min(valores));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maiorMenor();
	}
}
