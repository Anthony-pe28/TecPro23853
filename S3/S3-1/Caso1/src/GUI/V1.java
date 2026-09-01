package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Calculadora;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSumaEnteros;
	private JButton btnSumarReales;
	private JScrollPane scrollPane;
	private JTextField txtn2;
	private JLabel lblNewLabel2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel4;
	private JTextField txtn3;
	private JTextField txtn1;
	private JButton btnSumarEnteros;
	private JTextArea txts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSumaEnteros = new JButton("Sumar 3 enteros");
		btnSumaEnteros.addActionListener(this);
		btnSumaEnteros.setBounds(268, 35, 156, 23);
		contentPane.add(btnSumaEnteros);
		
		btnSumarReales = new JButton("Sumar 2 reales");
		btnSumarReales.addActionListener(this);
		btnSumarReales.setBounds(268, 66, 156, 23);
		contentPane.add(btnSumarReales);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 98, 414, 149);
		contentPane.add(scrollPane);
		
		txts = new JTextArea();
		scrollPane.setViewportView(txts);
		
		txtn2 = new JTextField();
		txtn2.setColumns(10);
		txtn2.setBounds(172, 36, 86, 20);
		contentPane.add(txtn2);
		
		lblNewLabel2 = new JLabel("Ingrese numero 2");
		lblNewLabel2.setBounds(10, 42, 94, 14);
		contentPane.add(lblNewLabel2);
		
		lblNewLabel = new JLabel("Ingrese numero 1");
		lblNewLabel.setBounds(10, 11, 94, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel4 = new JLabel("Ingrese numero 3 (Opcional)");
		lblNewLabel4.setBounds(10, 73, 143, 14);
		contentPane.add(lblNewLabel4);
		
		txtn3 = new JTextField();
		txtn3.setColumns(10);
		txtn3.setBounds(172, 67, 86, 20);
		contentPane.add(txtn3);
		
		txtn1 = new JTextField();
		txtn1.setColumns(10);
		txtn1.setBounds(172, 8, 86, 20);
		contentPane.add(txtn1);
		
		btnSumarEnteros = new JButton("Sumar 2 enteros");
		btnSumarEnteros.addActionListener(this);
		btnSumarEnteros.setBounds(268, 7, 156, 23);
		contentPane.add(btnSumarEnteros);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumarReales) {
			do_btnSumarReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumaEnteros) {
			do_btnSumaEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnSumarEnteros) {
			do_btnSumarEnteros_actionPerformed(e);
		}
	}
	protected void do_btnSumarEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtn1.getText());
			int n2 = Integer.parseInt(txtn2.getText());
			Calculadora S1 = new Calculadora(n1, n2);
			Imprimir(n1+" + "+n2+" = "+S1.Sumar(n1, n2));
		} catch (Exception e2) {
			MostarError();
		}
	}
	protected void do_btnSumaEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtn1.getText());
			int n2 = Integer.parseInt(txtn2.getText());
			int n3 = Integer.parseInt(txtn3.getText());
			Calculadora S2 = new Calculadora(n1, n2, n3);
			Imprimir(n1+" + "+n2+" + "+n3+" = "+S2.Sumar(n1, n2));
		} catch (Exception e2) {
			MostarError();
		}
	}
	protected void do_btnSumarReales_actionPerformed(ActionEvent e) {
		try {
			double n1 = Double.parseDouble(txtn1.getText());
			double n2 = Double.parseDouble(txtn2.getText());
			Calculadora S1 = new Calculadora(n1, n2);
			Imprimir(n1+" + "+n2+" = "+S1.Sumar(n1, n2));
		} catch (Exception e2) {
			MostarError();
		}
	}
	
	void MostarError() {
		JOptionPane.showMessageDialog(this, "Digite datos completos");
	}
	void Imprimir(String S) {
		txts.append(S+"\n");
	}
}
