package Heranca;

public class Princiapal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JogoTabuleiro jogoTabuleiro = new JogoTabuleiro();
		JogoCartas jogoCarta =  new JogoCartas();
		JogoDados jogoDado = new JogoDados();
		
		jogoTabuleiro.setNome("Catan");
		jogoTabuleiro.setDistribuidora("Devir");
		jogoTabuleiro.setNrJogadores(5);
		jogoTabuleiro.setFaixaEtaria(12);
		jogoTabuleiro.setTamanhoTabuleiro("40x40");
		jogoTabuleiro.setQuantidadePecas(35);
		
		jogoTabuleiro.jogar();
		
		jogoTabuleiro.setupTabuleiro();
		jogoTabuleiro.moverPeca();
		
		// =============================================
		System.out.println("=============================================");
		
		jogoCarta.setNome("Uno");
		jogoCarta.setDistribuidora("Brinkados");
		jogoCarta.setNrJogadores(2);
		jogoCarta.setFaixaEtaria(18);
		jogoCarta.setQuantidadeCartas(55);
		jogoCarta.setTamanhoCartas("todos");
		
		jogoCarta.jogar();
		
		jogoCarta.comprarCarta();
		jogoCarta.descartarCarta();
		
		System.out.println("=============================================");
		
		jogoDado.setNome("Dados");
		jogoDado.setDistribuidora("Dadinho kids");
		jogoDado.setNrJogadores(6);
		jogoDado.setFaixaEtaria(7);
		jogoDado.setTipoDado("Madeira");
		jogoDado.setQuantidadeDados(1);
		jogoDado.arremessarDado();
		
		System.out.println("=============================================");
		
		jogoTabuleiro.infoJogo();
		jogoCarta.infoJogo();
		jogoDado.infoJogo();

	}

}
