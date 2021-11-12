package view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

public class Conexion extends JDialog {

	private JPanel contentPane;
	public static JTextField txtHost;
	public static JTextField txtPuerto;
	public static JTextField txtNombre;

	Conexion conexion;
	

	public Conexion() {
		conexion=this;
		setResizable(false);
		setBounds(100, 100, 221, 169);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHost = new JLabel("Host: ");
		lblHost.setBounds(27, 23, 46, 14);
		contentPane.add(lblHost);
		
		JLabel lblPuerto = new JLabel("Puerto:");
		lblPuerto.setBounds(27, 48, 56, 14);
		contentPane.add(lblPuerto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(27, 73, 56, 14);
		contentPane.add(lblNombre);
		
		txtHost = new JTextField();
		txtHost.setBounds(93, 23, 79, 14);
		contentPane.add(txtHost);
		txtHost.setColumns(10);

		
		txtPuerto = new JTextField();
		txtPuerto.setColumns(10);
		txtPuerto.setBounds(93, 48, 79, 14);
		contentPane.add(txtPuerto);

		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(93, 73, 79, 14);
		contentPane.add(txtNombre);

		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(66, 105, 79, 14);
		contentPane.add(btnAceptar);


		



		setVisible(true);

		//pulsar boton aceptar
		btnAceptar.addActionListener(l -> {

			controller.Controlador.createConexion();
		
			
			conexion.dispose();
		});
	}


	
}
