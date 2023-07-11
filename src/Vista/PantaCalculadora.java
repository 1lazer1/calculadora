package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorCalculadora;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField consola;
	private ControladorCalculadora controlador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	PantaCalculadora frame = new PantaCalculadora();
	frame.setVisible(true);
	
	}

	/**
	 * Create the frame.
	 */
	public PantaCalculadora() {
		
		
		controlador = new ControladorCalculadora();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 417);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnNewButton, consola.getText());
				consola.setText("");
			}
		});
		
		btnNewButton.setBounds(219, 311, 95, 34);
		contentPane.add(btnNewButton);
		
		consola = new JTextField();
		consola.setEditable(false);
		consola.setForeground(new Color(0, 0, 0));
		consola.setBounds(20, 11, 294, 70);
		contentPane.add(consola);
		consola.setColumns(10);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"1");
				
			}
		});
		boton1.setBounds(20, 274, 46, 30);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"2");
				
			}
		});
		boton2.setBounds(88, 274, 46, 30);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"3");
				
			}
		});
		boton3.setBounds(155, 274, 46, 30);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"4");
				
			}
		});
		boton4.setBounds(20, 230, 46, 30);
		contentPane.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"5");
				
			}
		});
		boton5.setBounds(88, 230, 46, 30);
		contentPane.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"6");
				
			}
		});
		boton6.setBounds(155, 230, 46, 30);
		contentPane.add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"7");
				
			}
		});
		boton7.setBounds(20, 186, 46, 30);
		contentPane.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"8");
				
			}
		});
		boton8.setBounds(88, 186, 46, 30);
		contentPane.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"9");
				
			}
		});
		boton9.setBounds(155, 186, 46, 30);
		contentPane.add(boton9);
		
		JButton boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				consola.setText(consola.getText()+"0");
				
			}
		});
		boton0.setBounds(88, 315, 46, 30);
		contentPane.add(boton0);
		
		JButton botonpunto = new JButton(".");
		botonpunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!consola.getText().contains(".")) {
				
					if(consola.getText().isEmpty()) {
						
						consola.setText("0.");
						
					}else {
						
						consola.setText(consola.getText()+".");
						
					}
				}	
			}
		});
		botonpunto.setBounds(155, 315, 46, 30);
		contentPane.add(botonpunto);
		
		JButton botonsumar = new JButton("+");
		botonsumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controlador.setN1(Double.parseDouble(consola.getText()));
				
				
			}
	
		});
		botonsumar.setBounds(219, 184, 41, 30);
		contentPane.add(botonsumar);
		
		JButton botonrestar = new JButton("-");
		botonrestar.setBounds(219, 228, 41, 30);
		contentPane.add(botonrestar);
		
		JButton botonmultiplicar = new JButton("x");
		botonmultiplicar.setBounds(219, 272, 41, 30);
		contentPane.add(botonmultiplicar);
		
		JButton botondividir = new JButton("/");
		botondividir.setBounds(273, 184, 41, 30);
		contentPane.add(botondividir);
	}
}
