package comando.basicos;

import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		
		// impotação lib scanner
		Scanner ler = new Scanner (System.in);

		double numero; // real
		
		System.out.println("Digite um número: ");
		numero =  ler.nextDouble();// armazena info digitada p/usuario
		
		// && = e || = ou
		
		if(numero > 0 ) {
			System.out.println("Positivo");
		}else if (numero < 0 ){
			System.out.println("Negativo");
		} else {
			System.out.println("Neutro");
		}
		
		// Comparação de String, quando for string sempre lembrar de inicializar a variavel.
		String estado = "";
		estado = "SC";
		if (estado.equals("SC")) {
			System.out.println("Catarinense");
		}
		
		
	}	
}
