package Presentacion;

import Dominio.GestorCancion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class VentanaApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaApp window = new VentanaApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSpotif = new JLabel("SPOTIF");
		lblSpotif.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpotif.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblSpotif, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel Streaming = new JPanel();
		tabbedPane.addTab("Streaming", null, Streaming, null);
		GridBagLayout gbl_Streaming = new GridBagLayout();
		gbl_Streaming.columnWidths = new int[]{215, 0, 0, 150, 0};
		gbl_Streaming.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_Streaming.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Streaming.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		Streaming.setLayout(gbl_Streaming);
		
		JLabel lblCanciones = new JLabel("Canciones");
		GridBagConstraints gbc_lblCanciones = new GridBagConstraints();
		gbc_lblCanciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblCanciones.gridx = 0;
		gbc_lblCanciones.gridy = 0;
		Streaming.add(lblCanciones, gbc_lblCanciones);
		
		
		

		
		JButton btnReproducir = new JButton("Reproducir");
		GridBagConstraints gbc_btnReproducir = new GridBagConstraints();
		gbc_btnReproducir.insets = new Insets(0, 0, 5, 5);
		gbc_btnReproducir.gridx = 0;
		gbc_btnReproducir.gridy = 2;
		Streaming.add(btnReproducir, gbc_btnReproducir);
		
		JPanel Local = new JPanel();
		tabbedPane.addTab("Local", null, Local, null);
		
		conexion(Streaming);
		mostrarCancionesS(Streaming);
		
		
		
	}
	
	public void conexion(JPanel streaming) {
		boolean controlConexion;
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 3;
		streaming.add(label, gbc_label);
		GestorCancion gesCan = new GestorCancion();
		controlConexion = gesCan.conexion();
		if(controlConexion) {
			label.setText("Conectado");
		}else {
			label.setText("Conectado");
		}
	}
	
	public void mostrarCancionesS(JPanel streaming) {
		GestorCancion gesCan = new GestorCancion();
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 1;
		streaming.add(textArea, gbc_textArea);
		textArea.setText("La bicicleta");
		gesCan.cancionesBBDD();
	}

}
