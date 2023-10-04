package Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalElevador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informa a capacidade do elevador e o total de andar:");
		int capacidade  = leia.nextInt();
		System.out.println("Total de andar:");
		int totalAndares  = leia.nextInt();
		
		Elevador elevador = new Elevador();
		
		elevador.inicializar(capacidade, totalAndares);
		
		System.out.println("Andar atual:"+elevador.getAndarAtual());
		System.out.println("Capacidade:"+elevador.getCapacidade());
		System.out.println("Pessoas no elevador:"+elevador.getQuantidadePessoas());
		System.out.println("----------------------------------------------------------------");
		
		elevador.entrar();
		elevador.entrar();
		elevador.subir();
		
		System.out.println("Andar atual:"+elevador.getAndarAtual());
		System.out.println("Capacidade:"+elevador.getCapacidade());
		System.out.println("Pessoas no elevador:"+elevador.getQuantidadePessoas());
		System.out.println("----------------------------------------------------------------");
		
		elevador.entrar();
		elevador.entrar();
		elevador.subir();
		
		System.out.println("Andar atual:"+elevador.getAndarAtual());
		System.out.println("Capacidade:"+elevador.getCapacidade());
		System.out.println("Pessoas no elevador:"+elevador.getQuantidadePessoas());
		elevador.sair();
		elevador.sair();
		elevador.descer();
		elevador.descer();
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Andar atual:"+elevador.getAndarAtual());
		System.out.println("Capacidade:"+elevador.getCapacidade());
		System.out.println("Pessoas no elevador:"+elevador.getQuantidadePessoas());
		System.out.println("----------------------------------------------------------------");
	}

}
