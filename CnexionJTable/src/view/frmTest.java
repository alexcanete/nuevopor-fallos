package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dbms.DataBase;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class frmTest extends JDialog {

	public static String mensaje;

	private JPanel contentPane = new JPanel();
	private frmTest frmTest;

	
	public frmTest() {
		frmTest = this;
		setResizable(false);
		setBounds(100, 100, 174, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMensaje = new JLabel(mensaje);
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMensaje, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnAceptar = new JButton("Aceptar");
		panel.add(btnAceptar);


		setVisible(true);

		btnAceptar.addActionListener(l -> {
			frmTest.dispose();
		});

		if(DataBase.comprobarConexion() == false) {
			lblMensaje.setText("<html>No hay conexion<br>con la base de datos.</html>");
		}else {
			lblMensaje.setText("Conexion correcta");
		}

	}

}