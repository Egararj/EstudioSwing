package vista.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrueba_1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblNombre;
	private JTextField textNombre;
	private JLabel lblSaludo;
	private JButton btnAceptar;
	private JButton btnCancelar;


	/**
	 * Create the frame.
	 */
	public FrmPrueba_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}


	private void definirEventos() {
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSaludo.setText("Hola "+textNombre.getText());
			}
		});
		
	}


	private void definirVentana() {
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(41, 82, 46, 14);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(97, 79, 86, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		lblSaludo = new JLabel("Saludo");
		lblSaludo.setBounds(97, 11, 154, 14);
		panel.add(lblSaludo);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(189, 78, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(189, 112, 89, 23);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.addActionListener(this);
		panel.add(btnCancelar);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		lblSaludo.setText("Cancelar");
		JButton boton = (JButton) e.getSource();
		System.out.println(e.getActionCommand());
		
	}
}
