package modeloDados;

import java.util.ArrayList;

public class MainTesteModelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogo objeto = new Jogo();
		
		objeto.setPontos(5);
		objeto.setPontos(10);
		objeto.setPontos(15);	
		objeto.setPontos(5);	
		objeto.setPontos(2);	

		System.out.println(	"Pontos digitados pelo usu�rio: " + Jogo.getLista());
	
		System.out.println("A maior pontua��o da temporada �: " + objeto.getMaior());
		
		System.out.println("A menor pontua��o da temporada �: " + objeto.getMenor());
		
		System.out.println("O recorde de menor pontua��o foi quebrado: " + objeto.getQuantVezesRecordMenor() + " vezes");
		
		System.out.println("O recorde de maior pontua��o foi quebrado: " + objeto.getQuantVezesRecordMaior() + " vezes");
		
		System.out.println("A soma de pontos na temporada foi de: " + objeto.getSomaElementosLista());
		
		System.out.println("A m�dia na temporada foi de: " + objeto.getMediaPontos() + " pontos");
	}

}
