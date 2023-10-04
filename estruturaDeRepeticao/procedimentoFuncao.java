package estruturaDeRepeticao;

public class procedimentoFuncao {

	// procedimento|função = métodos
		// procedimento = método sem retorno (void)
		// função = método com retorno (int, double, boolean, String, ArrayList)

//		procedimento soma
//		var
//		   //variáveis locais
//		inicio
//		   //comandos
//		fimprocedimento

		// variáveis globais
		static double num1, num2, resposta;
		//método sem retorno
		public static void soma() {
			resposta = num1 + num2;
		}
	    //método com retorno
		public static double subtracao() {
			//resposta = num1 - num2;
			return num1 - num2;
		}
		//método com retorno e com parâmetros
		public static double multiplicacao(double a, double b) {
			//resposta = num1 - num2;
			return a * b;
		}

		public static void main(String[] args) {
			num1 = 10;
			num2 = 5;
			// resposta = num1 + num2;
			soma();
			System.out.println(resposta);
			System.out.println(subtracao());
			System.out.println(multiplicacao(num1, num2));
		}

}
