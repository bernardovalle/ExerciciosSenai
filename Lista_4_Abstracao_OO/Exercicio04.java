package Lista_4_Abstracao_OO;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia =  new Scanner(System.in);
		System.out.println("Informe o ano do veiculo: ");
		int ano = leia.nextInt();
		System.out.println("Informe o modelo do carro: ");
		String modelo = leia.next();
		System.out.println("Informe a cor do carro: ");
		String cor = leia.next();
		System.out.println("Informe a quilometragem: ");
		int quilometragem = leia.nextInt();
		
		Veiculo veiculo = new Veiculo(ano, modelo, cor, quilometragem);
		
		veiculo.verificarManutencao();
		veiculo.exibirCor();
		
		cor="Amarelo";
		veiculo.mudarCor(cor);
		
		veiculo.exibirCor();
		
		leia.close();

	}

}
