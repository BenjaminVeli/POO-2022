package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Conexión;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReporte1 = new JButton("Ver reporte1");
		btnReporte1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexión cnx=new Conexión();
				cnx.reporte1("Reporte1", "select * from Almacen");
			}
		});
		btnReporte1.setBounds(27, 92, 137, 21);
		contentPane.add(btnReporte1);
		
		JButton btnReporte2 = new JButton("Ver reporte2");
		btnReporte2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexión cnx=new Conexión();
				cnx.reporte2("Reporte2", "select * from Productos");
			}
		});
		btnReporte2.setBounds(27, 143, 137, 21);
		contentPane.add(btnReporte2);
	}
}