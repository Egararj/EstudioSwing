package vista.swing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.JLabel;
import java.awt.Font;

public class FrmEstudioEtiqueta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblEtiqueta1, lblEtiqueta2, lblEtiqueta3;
	private JLabel lblEtiqueta4;
	private ImageIcon imagen;

	public FrmEstudioEtiqueta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(new GridLayout(2, 2, 10, 10));
		
		
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}

	private void definirEventos() {
		
		
	}

	private void definirVentana() {
		
		lblEtiqueta1 = new JLabel("Etiqueta1");
		panel.add(lblEtiqueta1);
		
		lblEtiqueta2 = new JLabel("Etiqueta2",SwingConstants.CENTER);
		lblEtiqueta2.setFont(new Font("Calibri", Font.BOLD, 18));
		panel.add(lblEtiqueta2);
		
		imagen = new ImageIcon("imagenes/disquete.png");
		lblEtiqueta3 = new JLabel("Etiqueta3",imagen,JLabel.LEFT);
		panel.add(lblEtiqueta3);
		
		lblEtiqueta4 = new JLabel("Etiqueta4",SwingConstants.RIGHT);
		lblEtiqueta4.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		panel.add(lblEtiqueta4);
		
	}

}
