package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modeloDados.Jogo;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InserePontos extends javax.swing.JFrame{

	//private JFrame frame;
	private JTextField tfPontos;
	Jogo jogo = new Jogo();
	
	public InserePontos() {
		setLocation(0, -26);
		setTitle("Inserir Pontos");
		getContentPane().setLayout(null);
		
		JLabel lbPontos = new JLabel("Pontos:");
		lbPontos.setBounds(10, 47, 46, 20);
		getContentPane().add(lbPontos);
		
		tfPontos = new JTextField();
		tfPontos.setEditable(false);
		tfPontos.setBounds(53, 44, 90, 23);
		getContentPane().add(tfPontos);
		tfPontos.setColumns(10);
		
		JButton btIncluir = new JButton("Incluir");
		btIncluir.setBounds(150, 44, 90, 23);
		getContentPane().add(btIncluir);
		btIncluir.setEnabled(false);
		
		btIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
							
				int capturaPonto;
				capturaPonto = Integer.parseInt(tfPontos.getText());	
				jogo.setPontos(capturaPonto);	
				tfPontos.setText("");
				tfPontos.setEditable(false);
				btIncluir.setEnabled(false);
			}
		});
		
		
		JButton btConsultar = new JButton("Consultar Pontos");
		btConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, Jogo.getLista());
				
			}
		});
		btConsultar.setBounds(10, 100, 150, 23);
		getContentPane().add(btConsultar);
		
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
		
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btSair.setBounds(247, 13, 89, 23);
		getContentPane().add(btSair);
		
		JButton btMaiorPonto = new JButton("Maior Pontua\u00E7\u00E3o");
		btMaiorPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, jogo.getMaior());
				
			}
		});
		btMaiorPonto.setBounds(10, 130, 150, 23);
		getContentPane().add(btMaiorPonto);
		
		JButton btMenorPonto = new JButton("Menor Pontua\u00E7\u00E3o");
		btMenorPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogo.getMenor());
			}
		});
		btMenorPonto.setBounds(10, 160, 150, 23);
		getContentPane().add(btMenorPonto);
		
		JButton btRecMinimo = new JButton("Record M\u00EDnimo");
		btRecMinimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogo.getQuantVezesRecordMenor());
			}
		});
		btRecMinimo.setBounds(10, 190, 150, 23);
		getContentPane().add(btRecMinimo);
		
		JButton btRecMaximo = new JButton("Record M\u00E1ximo");
		btRecMaximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogo.getQuantVezesRecordMaior());
			}
		});
		btRecMaximo.setBounds(10, 220, 150, 23);
		getContentPane().add(btRecMaximo);
		
		JButton btTotalPontos = new JButton("Total Pontos");
		btTotalPontos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogo.getSomaElementosLista());
	
			}
		});
		btTotalPontos.setBounds(186, 100, 150, 23);
		getContentPane().add(btTotalPontos);
		
		JButton btMediaPontos = new JButton("M\u00E9dia Pontos");
		btMediaPontos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogo.getMediaPontos());
			}
			
		});
		btMediaPontos.setBounds(186, 130, 150, 23);
		getContentPane().add(btMediaPontos);
		
	}
}
