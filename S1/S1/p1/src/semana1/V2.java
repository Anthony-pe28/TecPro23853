package semana1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtN1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtNom;
	private JTextField txtN2;
	private JTextField txtCod;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V2 frame = new V2();
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
	public V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Código");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Nota 1");
			lblNewLabel_1.setBounds(10, 44, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCod = new JTextField();
			txtCod.setBounds(64, 8, 86, 20);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(66, 41, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Nombre");
			lblNewLabel_2.setBounds(174, 11, 46, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Nota 2");
			lblNewLabel_3.setBounds(174, 44, 46, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(229, 8, 86, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(230, 41, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 110, 414, 140);
			contentPane.add(txtS);
		}
		{
			btnNewButton = new JButton("Reportar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(10, 72, 89, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Adicionar");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(96, 72, 89, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Eliminar");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(184, 72, 89, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			btnNewButton_3 = new JButton("Buscar");
			btnNewButton_3.addActionListener(this);
			btnNewButton_3.setBounds(267, 72, 89, 23);
			contentPane.add(btnNewButton_3);
		}
		{
			btnNewButton_4 = new JButton("Modificar");
			btnNewButton_4.addActionListener(this);
			btnNewButton_4.setBounds(356, 72, 89, 23);
			contentPane.add(btnNewButton_4);
		}
		Listado();
	}
	ArregloEstudiante ae=new ArregloEstudiante();
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_4) {
			do_btnNewButton_4_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
		Imprimir("El promedio general es: "+ae.PromedioGeneral());
		Imprimir("Cantidad de estudiantes: "+ae.Tamaño());
	}
	void Listado() {
		Imprimir("Código\tNombre\tNota 1\tNota 2\tPromedio");
		for (int i = 0; i <ae.Tamaño() ; i++) {
			Imprimir(""+ae.Obtener(i).getCod()+"\t"+ae.Obtener(i).getNom()+
			"\t"+ae.Obtener(i).getN1()+"\t"+ae.Obtener(i).getN2()+
			"\t"+ae.Obtener(i).Promedio());
		}
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
	Estudiante es=ae.Buscar(leerCodigo());
	if(es==null) {
		Estudiante e1=new Estudiante(leerCodigo(),leerNombre(), leerN1(), leerN2());
		ae.Adicionar(e1);
	}
	else Mensaje("Existe código");
	}
	void Mensaje(String s) {
		JOptionPane.showMessageDialog(this,s);
	}
	int leerCodigo() {
		return Integer.parseInt(txtCod.getText());
	}
	double leerN1() {
		return Double.parseDouble(txtN1.getText());
	}
	double leerN2() {
		return Double.parseDouble(txtN2.getText());
	}
	String leerNombre() {
		return txtNom.getText();
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		Estudiante es=ae.Buscar(leerCodigo());
		if(es!=null) ae.Eliminar(es);
		else Mensaje("No existe código");
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Estudiante es=ae.Buscar(leerCodigo());
		if(es!=null)
		{
			Imprimir("Código\tNombre\tNota 1\tNota 2\tPromedio");
			Imprimir(""+es.getCod()+"\t"+es.getN1()+"\t"+es.getN2()+"\t"+
					es.Promedio());
		}
		else Mensaje("No existe código");
	}
	protected void do_btnNewButton_4_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Estudiante es=ae.Buscar(leerCodigo());
		if(es!=null) {
			es.setNom(leerNombre());
			es.setN1(leerN1());
			es.setN2(leerN2());
			Listado();
		}
	}
}




