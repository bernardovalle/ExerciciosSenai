package Vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia =  new Scanner(System.in);
		int nota[] =  new int[4]; // vetor
		
		// atribuindo valor dinamicamente;
//		nota[0]=10;
//		nota[1]=8;
//		nota[2]=8;
//		nota[3]=9;
//		
//		for (int i=0; i < 4; i++) {
//			System.out.println(nota[i]);
//		}
		
		for (int i=0; i < 4; i++) {
			System.out.println("Digite a nota"+ (i+1));
			nota[i] = leia.nextInt();
	}
	
		leia.close();
	}

}
