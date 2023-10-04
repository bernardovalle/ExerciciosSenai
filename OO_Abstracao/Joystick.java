package OO_Abstracao;

public class Joystick {
	 String modelo;
	 String cor;
	 int porcentagemBateria;
	
	// construtor
	public Joystick(String modelo, String cor, int porcentagemBateria) {
		this.modelo = modelo;
		this.cor = cor;
		this.porcentagemBateria = porcentagemBateria;
	}

	// encapsulamento
	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Joystick [modelo=" + modelo + ", cor=" + cor + ", porcentagemBateria=" + porcentagemBateria + "]";
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPorcentagemBateria() {
		return porcentagemBateria;
	}

	public void setPorcentagemBateria(int porcentagemBateria) {
		this.porcentagemBateria = porcentagemBateria;
	}

	public void visualizarPorgentagem() {
		System.out.println("Modelo - "+ modelo+
				"\nCor - "+cor+
				"\nBateria- "+porcentagemBateria);
	}
	
	public void conectar() {
		System.out.println("Conectado");
	}
	
	public void recarregar() {
		System.out.println("Reconectando.");
	}

}
