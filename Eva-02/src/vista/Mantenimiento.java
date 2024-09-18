package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Producto;
import proceso.Operaciones;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class Mantenimiento extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField txtCategoria;
	private JTextField txtStock;
	private JTextField txtPrecio;
	Operaciones ope = new Operaciones(); 
	Producto pdto;

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
		setBounds(100, 100, 477, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel NuevaEtiqueta = new JLabel("Codigo:");
		NuevaEtiqueta.setFont(new Font("Arial Black", Font.PLAIN, 13));
		NuevaEtiqueta.setBounds(25, 63, 62, 19);
		contentPane.add(NuevaEtiqueta);
		
		JLabel NuevaEtiqueta_1 = new JLabel("Nombre:");
		NuevaEtiqueta_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		NuevaEtiqueta_1.setBounds(25, 107, 74, 13);
		contentPane.add(NuevaEtiqueta_1);
		
		JLabel NuevaEtiqueta_2 = new JLabel("Descripción:");
		NuevaEtiqueta_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		NuevaEtiqueta_2.setBounds(25, 149, 96, 19);
		contentPane.add(NuevaEtiqueta_2);
		
		JLabel NuevaEtiqueta_3 = new JLabel("Categoría:");
		NuevaEtiqueta_3.setFont(new Font("Arial Black", Font.PLAIN, 13));
		NuevaEtiqueta_3.setBounds(245, 63, 85, 19);
		contentPane.add(NuevaEtiqueta_3);
		
		JLabel NuevaEtiqueta_4 = new JLabel("Stock:");
		NuevaEtiqueta_4.setFont(new Font("Arial Black", Font.PLAIN, 13));
		NuevaEtiqueta_4.setBounds(245, 107, 57, 13);
		contentPane.add(NuevaEtiqueta_4);
		
		JLabel NuevaEtiqueta_5 = new JLabel("Precio:");
		NuevaEtiqueta_5.setFont(new Font("Arial Black", Font.PLAIN, 13));
		NuevaEtiqueta_5.setBounds(245, 150, 72, 16);
		contentPane.add(NuevaEtiqueta_5);
		
		txtCodigo = new JTextField();
		txtCodigo.setBackground(new Color(0, 255, 128));
		txtCodigo.setBounds(92, 64, 128, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(0, 255, 128));
		txtNombre.setBounds(124, 150, 96, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBackground(new Color(0, 255, 128));
		txtDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		txtDescripcion.setBounds(124, 107, 96, 19);
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setBackground(new Color(0, 255, 128));
		txtCategoria.setBounds(325, 64, 96, 19);
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		txtStock = new JTextField();
		txtStock.setBackground(new Color(0, 255, 128));
		txtStock.setBounds(298, 150, 123, 19);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBackground(new Color(0, 255, 128));
		txtPrecio.setBounds(298, 105, 123, 19);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel NuevaEtiqueta_6 = new JLabel("Reporte:");
		NuevaEtiqueta_6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		NuevaEtiqueta_6.setBounds(40, 241, 148, 19);
		contentPane.add(NuevaEtiqueta_6);
		
		JTextArea txtReporte = new JTextArea();
		txtReporte.setBounds(40, 271, 370, 159);
		contentPane.add(txtReporte);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnRegistrar.setBackground(new Color(255, 128, 64));
		btnRegistrar.setForeground(new Color(0, 64, 128));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cod = Integer.parseInt(txtCodigo.getText());
				String nom = txtNombre.getText();
				String desc = txtDescripcion.getText();
				String cat = txtCategoria.getText();
				int stock = Integer.parseInt(txtStock.getText());
				double price = Double.parseDouble(txtPrecio.getText());
				pdto = new Producto(cod, nom, desc, cat, stock, price);
				ope.registro(pdto);
				txtReporte.setText("Producto registrado de forma correcta");
				}
		});
		btnRegistrar.setBounds(25, 457, 96, 21);
		contentPane.add(btnRegistrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnBuscar.setBackground(new Color(255, 128, 64));
		btnBuscar.setForeground(new Color(0, 64, 128));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtReporte.setText("");
				int num = Integer.parseInt(txtCodigo.getText());
				int busqueda = ope.busqueda(num);
				txtReporte.append(ope.leer(busqueda).codigo + "\t" + 
				ope.leer(busqueda).nombre + "\t" + 
				ope.leer(busqueda).descripcion + "\t" + 
				ope.leer(busqueda).categoria + "\t" +
				ope.leer(busqueda).stock + "\t" +
				ope.leer(busqueda).precio);
				
			}
		});
		btnBuscar.setBounds(135, 457, 85, 21);
		contentPane.add(btnBuscar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnImprimir.setBackground(new Color(255, 128, 64));
		btnImprimir.setForeground(new Color(0, 64, 128));
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ope.Imprimir(txtReporte);
			}
		});
		btnImprimir.setBounds(230, 457, 85, 21);
		contentPane.add(btnImprimir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnEliminar.setBackground(new Color(255, 128, 64));
		btnEliminar.setForeground(new Color(0, 64, 128));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtCodigo.getText());
				int busqueda = ope.busqueda(num);
				ope.elimina(busqueda);
				txtReporte.setText("Producto eliminado correctamente");
			}
		});
		btnEliminar.setBounds(325, 457, 85, 21);
		contentPane.add(btnEliminar);
	}
}