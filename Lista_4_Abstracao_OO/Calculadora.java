package Lista_4_Abstracao_OO;

public class Calculadora {
	
	private int n1;
	private int n2;
	
	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n1 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public double somar(int n1, int n2) {
		return n1+n2;
	}
	public double subtrair(int n1, int n2) {
		return n1-n2;
	}
	public double multiplicar(int n1, int n2) {
		return n1*n2;
	}
	public double dividir(int n1, int n2) {
		return n1/n2;
	}

}
