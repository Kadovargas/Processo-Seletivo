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

public class Home extends javax.swing.JFrame {

	private JFrame home;
	private JMenu menuOpcoes;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Home() {
		initComponents();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initComponents() {
		home = new JFrame();
		home.setTitle("Basquete");
		home.setSize(400, 400);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		home.setJMenuBar(menuBar);
		menuOpcoes = new JMenu("Menu");
		menuBar.add(menuOpcoes);
		
		
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
