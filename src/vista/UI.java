package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.Cursor;

public class UI extends JFrame {

	private JPanel contentPane;
	protected JTextField txtNombre;
	protected JTextField txtDisco;
	protected JButton btnAgregar;
	protected JTextArea txtLista;
	private JLabel lblElementosEnEl;
	private JPanel panel_2;
	protected JLabel txtCantidadElementos;
	private JPanel panel_3;
	private JLabel lblCantantesFamosos;
	private JPanel panel_4;
	private JPanel panel;
	private JPanel panel_5;
	protected JLabel txtMensaje;

	public UI() {
		setMinimumSize(new Dimension(600, 600));
		setTitle("Ejercicio 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.DARK_GRAY);
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_3, BorderLayout.NORTH);
		
		lblCantantesFamosos = new JLabel("CANTANTES FAMOSOS");
		lblCantantesFamosos.setForeground(Color.WHITE);
		lblCantantesFamosos.setHorizontalAlignment(SwingConstants.LEFT);
		lblCantantesFamosos.setHorizontalTextPosition(SwingConstants.LEFT);
		lblCantantesFamosos.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_3.add(lblCantantesFamosos);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.GRAY);
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBorder(new EmptyBorder(0, 20, 0, 20));
		lblNombre.setForeground(Color.WHITE);
		panel_4.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtNombre = new JTextField();
		panel_4.add(txtNombre);
		txtNombre.setBorder(new EmptyBorder(5, 5, 5, 5));
		txtNombre.setColumns(15);
		
		JLabel lblDiscoMsVendido = new JLabel("Disco m\u00E1s vendido");
		lblDiscoMsVendido.setBorder(new EmptyBorder(0, 20, 0, 20));
		lblDiscoMsVendido.setForeground(Color.WHITE);
		panel_4.add(lblDiscoMsVendido);
		lblDiscoMsVendido.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtDisco = new JTextField();
		panel_4.add(txtDisco);
		txtDisco.setBorder(new EmptyBorder(5, 5, 5, 5));
		txtDisco.setColumns(15);
		
		btnAgregar = new JButton("A\u00F1adir");
		btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregar.setBorder(new EmptyBorder(5, 10, 5, 10));
		btnAgregar.setFocusPainted(false);
		panel_4.add(btnAgregar);
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAgregar.setBackground(Color.DARK_GRAY);
		
		panel_2 = new JPanel();
		panel_2.setBorder(null);
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel_2.add(panel, BorderLayout.EAST);
		
		lblElementosEnEl = new JLabel("Elementos en el ArrayList:");
		panel.add(lblElementosEnEl);
		lblElementosEnEl.setBorder(null);
		lblElementosEnEl.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtCantidadElementos = new JLabel("");
		panel.add(txtCantidadElementos);
		
		panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.WEST);
		
		txtMensaje = new JLabel("");
		txtMensaje.setForeground(Color.RED);
		txtMensaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(txtMensaje);
		
		txtLista = new JTextArea();
		txtLista.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtLista.setBorder(new EmptyBorder(10, 10, 10, 10));
		txtLista.setEditable(false);
		txtLista.setBackground(Color.WHITE);
		
		JScrollPane scrollLista = new JScrollPane(txtLista);
		scrollLista.setBorder(null);
		contentPane.add(scrollLista, BorderLayout.CENTER);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtDisco() {
		return txtDisco;
	}

}
