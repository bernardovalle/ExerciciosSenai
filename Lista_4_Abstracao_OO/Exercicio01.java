package Lista_4_Abstracao_OO;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia =  new Scanner(System.in);
	
		System.out.println("Informa dois numeros para calcular operações:");
		int n1 = leia.nextInt();
		int n2 = leia.nextInt();
		
		Calculadora calc = new Calculadora(n1, n2);
		
		System.out.println("Soma -"+ calc.somar(n1, n2));
		System.out.println("Subtrair -" + calc.subtrair(n1, n2));
		System.out.println("Multiplicar -"+ calc.multiplicar(n1, n2));
		System.out.println("Dividir -"+calc.dividir(n1, n2));
	
		leia.close();
		
	}

}
