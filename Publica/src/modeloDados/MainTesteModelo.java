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

		System.out.println(	"Pontos digitados pelo usuário: " + Jogo.getLista());
	
		System.out.println("A maior pontuação da temporada é: " + objeto.getMaior());
		
		System.out.println("A menor pontuação da temporada é: " + objeto.getMenor());
		
		System.out.println("O recorde de menor pontuação foi quebrado: " + objeto.getQuantVezesRecordMenor() + " vezes");
		
		System.out.println("O recorde de maior pontuação foi quebrado: " + objeto.getQuantVezesRecordMaior() + " vezes");
		
		System.out.println("A soma de pontos na temporada foi de: " + objeto.getSomaElementosLista());
		
		System.out.println("A média na temporada foi de: " + objeto.getMediaPontos() + " pontos");
	}

}
