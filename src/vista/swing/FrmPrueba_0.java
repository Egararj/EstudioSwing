package vista.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrueba_0 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textNombre;
	private JButton Aceptar;

	/**
	 * Create the frame.
	 */
	public FrmPrueba_0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 434);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(107, 106, 86, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblSaludo = new JLabel("Hola Mundo con Swing");
		lblSaludo.setBounds(107, 42, 119, 14);
		panel.add(lblSaludo);
		
		Aceptar = new JButton("Aceptar");
		Aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSaludo.setText("Bienvenido "+textNombre.getText());
			}
		});
		Aceptar.setBounds(107, 153, 89, 28);
		panel.add(Aceptar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNombre.setBounds(30, 107, 74, 14);
		panel.add(lblNombre);
		
		
		
		
		this.setVisible(true);
	}
}
