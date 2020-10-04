package modeloDados;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Jogo {

	// Atributos
	private int pontos;
	private static ArrayList<Integer> lista = new ArrayList<Integer>();

	// Metodos

	// Método para setar os pontos no objeto do tipo ArrayLista "Lista"
	// Através do botão "Pontos" na interface do usuário
	public void setPontos(int pontos) {
		this.pontos = pontos;
		if (pontos < 1000 && pontos > -1) {
			lista.add(this.pontos);
		}

	}

	// Método que retorna os pontos
	public int getPontos() {
		return pontos;
	}

	// Método que retorna a Lista de pontos que é um objeto do tipo ArrayList
	public static ArrayList<Integer> getLista() {
		return lista;
	}

	// Retor maior pontuação
	public int getMaior() {
		int num = 0;
		int maior = 0;
		for (int i = 0; i < lista.size(); i++) {
			num = lista.get(i);
			if (num > maior) {
				maior = num;
			}
		}
		return maior;

	}

	// Retorna Menor pontuação
	public int getMenor() {
		int num = 0;
		int menor = 0;
		int quantMenor = 0;
		menor = lista.get(0);

		for (int i = 0; i < lista.size(); i++) {
			num = lista.get(i);
			if (num < menor) {
				menor = num;
				quantMenor++;
			}
		}
		return menor;

	}

	// Método que retorne quantas vezes o recorde foi quebrado para "menos"
	public int getQuantVezesRecordMenor() {
		int num = 0;
		int menor = 0;
		int quantMenor = 0;

		for (int i = 0; i < lista.size(); i++) {
			num = lista.get(i);
			if (i == 0) {
				menor = lista.get(i);
			} else if (num < menor) {
				menor = num;
				quantMenor++;
			}
		}
		return quantMenor;

	}

	// Método que retorna quantas vezes o recorde foi criado para mais
	public int getQuantVezesRecordMaior() {
		int num = 0;
		int maior = 0;
		int quantMaior = 0;

		for (int i = 0; i < lista.size(); i++) {
			num = lista.get(i);
			if (i == 0) {
				maior = lista.get(i);
			} else {
				if (num > maior) {
					maior = num;
					quantMaior++;
				}

			}
		}
		return quantMaior;
	}

	// Método que retorna a soma dos elementos da lista
	public int getSomaElementosLista() {
		int soma = 0;
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		return soma;

	}
	public Double getMediaPontos() {
		double soma = 0;
		double media = 0;
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
			media = soma / (i + 1);
		}
		//DecimalFormat f = new DecimalFormat("#.##");
		return media;//f.format(media);
	}
}