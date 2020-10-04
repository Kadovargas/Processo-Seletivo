package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

//Tela principal
public class Home extends javax.swing.JFrame {
	//Atributos privados da classe
	private JFrame home;
	private JMenu menuOpcoes;

	//Carregamento inicial da tela
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.home.setVisible(true);
					window.home.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Iniciando componentes de tela
	public Home() {
		initComponents();		
	}

	//inicializacao e parametrizacao dos componetes da tela
	private void initComponents() {
		home = new JFrame();
		home.setTitle("Basquete");
		home.setSize(400, 400);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		home.setJMenuBar(menuBar);
		menuOpcoes = new JMenu("Menu");
		menuBar.add(menuOpcoes);
		
		//Opcoes do Menu - Registrar Jogo
		JMenuItem mnItemNovo = new JMenuItem("Registrar Jogo");
		menuOpcoes.add(mnItemNovo);
		
		mnItemNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InserePontos telaInsere = new InserePontos();
				telaInsere.setSize(400, 400);
				telaInsere.setLocationRelativeTo(null);
				telaInsere.setVisible(true);
				home.dispose();
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		menuOpcoes.add(separator_1);
		
		//Opção do menu -  Sair
		JMenuItem mnItemSair = new JMenuItem("Sair");
		menuOpcoes.add(mnItemSair);
		home.getContentPane().setLayout(null);
		mnItemSair.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
	}
}
