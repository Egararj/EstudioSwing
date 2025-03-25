package vista.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FrmEstudioRadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JRadioButton rdbtnSoltero,rdbtnCasado;
	private JRadioButton rdbtnSeparado;
	private JLabel lblEstadoCivil;
	private JButton btnAceptar;
	private ButtonGroup estadoCivil;
	private ArrayList<JRadioButton> listaRadio;
	
	public FrmEstudioRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		
		
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}

	private void definirEventos() {
		
		rdbtnSoltero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEstadoCivil.setText(rdbtnSoltero.getText());
			}
		});
		
		rdbtnCasado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEstadoCivil.setText(rdbtnCasado.getText());
			}
		});
		
		rdbtnSeparado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEstadoCivil.setText(rdbtnSeparado.getText());
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(JRadioButton radio:listaRadio) {
					if(radio.isSelected()) {
						lblEstadoCivil.setText(radio.getText()+ " desde botón");
					}
				}
			}
		});
		
	}

	private void definirVentana() {
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(44, 41, 172, 136);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		estadoCivil = new ButtonGroup();
		listaRadio = new ArrayList<JRadioButton>();
		
		rdbtnCasado = new JRadioButton("Casado");
		rdbtnCasado.setBounds(30, 33, 109, 23);
		estadoCivil.add(rdbtnCasado);
		listaRadio.add(rdbtnCasado);
		panel_1.add(rdbtnCasado);
		
		rdbtnSoltero = new JRadioButton("Soltero");

		rdbtnSoltero.setBounds(30, 7, 94, 23);
		estadoCivil.add(rdbtnSoltero);
		listaRadio.add(rdbtnSoltero);
		panel_1.add(rdbtnSoltero);
		
		rdbtnSeparado = new JRadioButton("Separado");
		rdbtnSeparado.setBounds(30, 59, 109, 23);
		estadoCivil.add(rdbtnSeparado);
		listaRadio.add(rdbtnSeparado);
		panel_1.add(rdbtnSeparado);
		
		lblEstadoCivil = new JLabel("......");
		lblEstadoCivil.setBounds(30, 111, 132, 14);
		panel_1.add(lblEstadoCivil);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(81, 205, 89, 23);
		panel.add(btnAceptar);
		
		
		
	}
}
