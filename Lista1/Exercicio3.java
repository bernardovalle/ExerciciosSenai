package Lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informa um genero M ou F");
		String genero = ler.nextLine();
		
		if (genero.equals("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Feminino");
		}

	}

}
