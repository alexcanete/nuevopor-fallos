package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Principal extends JFrame {

	private JPanel contentPane;
	public static JTextArea txtQuery;
	public static JTable table;
	public static JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDataBase = new JMenu("DataBase");
		menuBar.add(mnDataBase);
		
		JMenuItem mntmConex = new JMenuItem("Conexi\u00F3n");
		mnDataBase.add(mntmConex);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnDataBase.add(mntmLogin);
		
		JSeparator separator = new JSeparator();
		mnDataBase.add(separator);
		
		JMenuItem mntmTest = new JMenuItem("Test");
		mnDataBase.add(mntmTest);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtQuery = new JTextArea();
		txtQuery.setRows(3);
		panel.add(txtQuery, BorderLayout.CENTER);
		
		JButton btnEjecutar = new JButton("Ejecutar");
		panel.add(btnEjecutar, BorderLayout.EAST);
		
		JSeparator separator_1 = new JSeparator();
		panel.add(separator_1, BorderLayout.SOUTH);
		
		JSeparator separator_2 = new JSeparator();
		panel.add(separator_2, BorderLayout.NORTH);
		
		JSeparator separator_3 = new JSeparator();
		panel.add(separator_3, BorderLayout.WEST);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		lblInfo = new JLabel("");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblInfo, BorderLayout.SOUTH);


		
		mntmConex.addActionListener(e -> {
			new Conexion();

		});

		mntmLogin.addActionListener(e -> {
			new frmLogin();
		});
		
		mntmTest.addActionListener(e-> {
			dbms.DataBase.comprobarConexion();
			new frmTest();
		});

		btnEjecutar.addActionListener(e -> {
			try {
				controller.Controlador.executeQuery();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.err.println("Error al ejecutar la query");
			}
		});

		


		
			
	}

}
