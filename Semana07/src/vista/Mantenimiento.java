package vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Cuenta;
import proceso.operaciones;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mantenimiento extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtNombre;
	private JTextField txtTipo;
	private JTextField txtSaldo;
	operaciones op = new operaciones();
	Cuenta cta;

	/*Inicio de la aplicación*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mantenimiento frame = new Mantenimiento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Crear el marco*/
	
	public Mantenimiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NuevaEtiqueta = new JLabel("Número");
		NuevaEtiqueta.setBounds(51, 36, 45, 13);
		contentPane.add(NuevaEtiqueta);
		
		JLabel NuevaEtiqueta_1 = new JLabel("Nombre:");
		NuevaEtiqueta_1.setBounds(51, 73, 66, 13);
		contentPane.add(NuevaEtiqueta_1);
		
		JLabel NuevaEtiqueta_2 = new JLabel("Tipo");
		NuevaEtiqueta_2.setBounds(51, 111, 45, 13);
		contentPane.add(NuevaEtiqueta_2);
		
		JLabel NuevaEtiqueta_3 = new JLabel("Saldo");
		NuevaEtiqueta_3.setBounds(51, 147, 45, 13);
		contentPane.add(NuevaEtiqueta_3);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(190, 32, 176, 19);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(190, 69, 176, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(190, 107, 176, 19);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(190, 143, 176, 19);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);	
		
		JTextArea txtReporte = new JTextArea();
		txtReporte.setBounds(51, 191, 306, 162);
		contentPane.add(txtReporte);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNumero.getText());
				String nom = txtNombre.getText();
				String tipo = txtTipo.getText();
				double sal = Double.parseDouble(txtSaldo.getText());
				cta = new Cuenta(num,nom,tipo,sal);
				op.registro(cta);
				txtReporte.setText("Cuenta registrada correctamente");
			}
		});
		btnRegistrar.setBounds(10, 392, 96, 21);
		contentPane.add(btnRegistrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op.Imprime(txtReporte);
			}
		});
		btnImprimir.setBounds(116, 392, 85, 21);
		contentPane.add(btnImprimir);
		
		JButton btnBusqueda = new JButton("Buscar");
		btnBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtReporte.setText("");
				String nom = txtNombre.getText();
				int busqueda = op.busqueda(nom);
				txtReporte.append(op.leer(busqueda).numero + "\t" + 
				op.leer(busqueda).nombre + "\t" + 
				op.leer(busqueda).tipo + "\t" + 
				op.leer(busqueda).saldo);
			}
		});
		btnBusqueda.setBounds(212, 392, 85, 21);
		contentPane.add(btnBusqueda);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = txtNombre.getText();
				int busqueda = op.busqueda(nom);
				op.elimina(busqueda);
				txtReporte.setText("Cuenta eliminada correctamente");
			}
		});
		btnEliminar.setBounds(307, 392, 85, 21);
		contentPane.add(btnEliminar);
	}
}