package estruturaDeRepeticao;

public class vetorMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nota = new int[5];
		int [][] numero = new int[2][3];
		
		nota[0]= 1;
		nota[1]= 10;
		nota[2]= 20;
		nota[3]= 30;
		nota[4]= 40;
		
		numero[0][0] = 1;
		numero[0][1] = 2;
		numero[0][2] = 3;
		numero[1][0] = 4;
		numero[1][1] = 5;
		numero[1][2] = 6;
		
		
		for(int i = 0; i < nota.length; i++) {
			System.out.println("Conteudo no vetor "+i+" "+ nota[i]);
		}
		
		for(int i = 0; i < numero.length; i++) {
			for(int j = 0; j < numero.length; j++) {
			System.out.println("Conteudo na matriz "+i+" "+j+" "+ numero[i][j]);
			}
		}
	}

}
