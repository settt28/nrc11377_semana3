package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnSumaEnteros;
	private JButton btnSumaReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;

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
		{
			lblNewLabel = new JLabel("Primer número:");
			lblNewLabel.setBounds(10, 11, 168, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("Segundo número:");
			lblSegundoNmero.setBounds(10, 36, 168, 14);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel(" Tercer número (opcional):");
			lblTercerNmero.setBounds(10, 61, 181, 14);
			contentPane.add(lblTercerNmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(201, 8, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(201, 33, 86, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(201, 58, 86, 20);
			contentPane.add(txtN3);
		}
		{
			btnNewButton = new JButton("Suma 2 enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(297, 7, 127, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumaEnteros = new JButton("Suma 3 enteros");
			btnSumaEnteros.addActionListener(this);
			btnSumaEnteros.setBounds(297, 32, 127, 23);
			contentPane.add(btnSumaEnteros);
		}
		{
			btnSumaReales = new JButton("Suma 2 reales");
			btnSumaReales.addActionListener(this);
			btnSumaReales.setBounds(297, 57, 127, 23);
			contentPane.add(btnSumaReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 110, 414, 140);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumaReales) {
			do_btnSumaReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumaEnteros) {
			do_btnSumaEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	try {
		int n1 = Integer.parseInt(txtN1.getText());
		int n2 = Integer.parseInt(txtN2.getText());
		Calculadora c = new Calculadora(n1, n2);
		txtS.append("La suma es: "+c.Sumar(n1, n2)+"\n");
		}
		catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese números enteros");
		}
	}
	protected void do_btnSumaEnteros_actionPerformed(ActionEvent e) {
	try {
		int n1 = Integer.parseInt(txtN1.getText());
		int n2 = Integer.parseInt(txtN2.getText());
		int n3 = Integer.parseInt(txtN3.getText());
		Calculadora c = new Calculadora(n1, n2, n3);
		txtS.append("La suma es: "+c.Sumar(n1, n2, n3)+"\n");
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(this, "Ingrese números enteros");
	}
	}
	protected void do_btnSumaReales_actionPerformed(ActionEvent e) {
		double d1 = Double.parseDouble(txtN1.getText());
		double d2 = Double.parseDouble(txtN2.getText());
		Calculadora c = new Calculadora(d1, d2);
		txtS.append("La suma es: "+c.Sumar(d1, d2)+"\n");
	}
}
