package OO_Abstracao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String modelo = "PS5";
		String cor = "branco";
		int bateria = 40;
		
		Joystick js1 = new Joystick(modelo, cor, bateria);
		
		js1.visualizarPorgentagem();
		js1.conectar();
		js1.recarregar();
	
	}

}
