package interfaceGrafica;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modeloDados.Jogo;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InserePontos extends javax.swing.JFrame{
	
	Jogo jogo = new Jogo();
	private JTextField tfPontos;
	
	public InserePontos() {
		setLocation(0, -26);
		//Atribuir nome para a tela
		setTitle("Inserir Pontos");
		getContentPane().setLayout(null);
		
		//Label descrição do campo
		JLabel lbPontos = new JLabel("Pontos:");
		lbPontos.setBounds(10, 47, 46, 20);
		getContentPane().add(lbPontos);
		
		//Campo TF para informar pontos
		tfPontos = new JTextField();
		tfPontos.setEditable(false);
		tfPontos.setBounds(53, 44, 90, 23);
		getContentPane().add(tfPontos);
		tfPontos.setColumns(10);
		
		//Botão para registrar pontos
		JButton btIncluir = new JButton("Incluir");
		btIncluir.setBounds(150, 44, 90, 23);
		getContentPane().add(btIncluir);
		btIncluir.setEnabled(false);
		//Eventos do botão incluir
		btIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int capturaPonto;
				capturaPonto = Integer.parseInt(tfPontos.getText());	
				jogo.setPontos(capturaPonto);	
				tfPontos.setText("");
				tfPontos.setEditable(false);
				btIncluir.setEnabled(false);
				
				JOptionPane.showMessageDialog(null,"Ponto registrado!");
			}
		});
		
		//Botao para consultar pontos registrados
		JButton btConsultar = new JButton("Consultar Pontos");
		btConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Pontos registrados: " + Jogo.getLista());
				
			}
		});
		btConsultar.setBounds(10, 100, 150, 23);
		getContentPane().add(btConsultar);
		
		//Botão para inserir novo jogo
		JButton btNovoJogo = new JButton("Novo Jogo");
		btNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btIncluir.setEnabled(true);
				tfPontos.requestFocus();
				tfPontos.setEditable(true);
			}
		});
		btNovoJogo.setBounds(11, 13, 129, 23);
		getContentPane().add(btNovoJogo);
		
		//Botão para sair do sistema
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btSair.setBounds(247, 13, 89, 23);
		getContentPane().add(btSair);
		
		//BoTão para mostrar maior pontuação
		JButton btMaiorPonto = new JButton("Maior Pontuação");
		btMaiorPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Maior pontuação da temporada: " + jogo.getMaior());
				
			}
		});
		btMaiorPonto.setBounds(10, 130, 150, 23);
		getContentPane().add(btMaiorPonto);
		
		//Botão para mostrar menor pontuação
		JButton btMenorPonto = new JButton("Menor Pontuação");
		btMenorPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Menor pontuação da temporada: " + jogo.getMenor());
			}
		});
		btMenorPonto.setBounds(10, 160, 150, 23);
		getContentPane().add(btMenorPonto);
		
		//Botão para mostrar quantas vezes record minimo foi quebrado
		JButton btRecMinimo = new JButton("Record Mínimo");
		btRecMinimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Recorde mínimo foi quebrado " + jogo.getQuantVezesRecordMenor() + " vez(es)");
			}
		});
		btRecMinimo.setBounds(10, 190, 150, 23);
		getContentPane().add(btRecMinimo);
		
		//Botão para mostrar quantas vezes record maximo foi quebrado
		JButton btRecMaximo = new JButton("Record Máximo");
		btRecMaximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Recorde máximo foi quebrado " + jogo.getQuantVezesRecordMaior() + " vez(es)");
			}
		});
		btRecMaximo.setBounds(10, 220, 150, 23);
		getContentPane().add(btRecMaximo);
		
		//Botão para mostrar total de pontos
		JButton btTotalPontos = new JButton("Total Pontos");
		btTotalPontos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Total de pontos da temporada: " + jogo.getSomaElementosLista());
	
			}
		});
		btTotalPontos.setBounds(186, 100, 150, 23);
		getContentPane().add(btTotalPontos);

		//Botão para mostrar média de pontos
		JButton btMediaPontos = new JButton("Média Pontos");
		btMediaPontos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Média de pontos da temporada: " + jogo.getMediaPontos());
			}
			
		});
		btMediaPontos.setBounds(186, 130, 150, 23);
		getContentPane().add(btMediaPontos);
		
	}
}
