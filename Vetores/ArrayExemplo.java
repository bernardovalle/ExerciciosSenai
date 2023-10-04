package Vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =  new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<>();
	
//		for (int i=0; i < 4; i++) {
//			System.out.println("Digite a nota"+ (i+1));
//			notas.add(leia.nextInt());
//	}
		notas.add(10);
		notas.add(8);
		notas.add(7);
		notas.add(8);
		
		System.out.println("NOTAS - "+ notas);
		
	}

}
