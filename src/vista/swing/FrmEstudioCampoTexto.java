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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmEstudioCampoTexto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblImporte;
	private JLabel lblTotal;
	private JLabel lblIva;
	private JTextField textImporte;
	private JTextField textIva;
	private JTextField textTotal;
	private JButton btnCalcular;
	private JLabel lblInformacion;
	
	
	
	public FrmEstudioCampoTexto() {
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
		
		textImporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformacion.setText(e.getActionCommand());
				try {
					Integer x = 0;
					x = Integer.parseInt(textImporte.getText());
				}catch(Exception e2) {
					lblInformacion.setText("Introduzca un valor correcto");
					textImporte.setText("");
				}
			}
		});
		
		textIva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInformacion.setText(e.getActionCommand());
				try {
					Integer x = 0;
					x = Integer.parseInt(textIva.getText());
				}catch(Exception e2) {
					lblInformacion.setText("Introduzca un valor correcto");
					textIva.setText("");
				}
			}
		});
		
		textIva.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				char c = e.getKeyChar();
				if(c != KeyEvent.VK_ENTER){
				lblInformacion.setText("Caracter: "+ e.getKeyChar()+" Código: "+e.getKeyCode());
				}
			}
		});
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double importe = Double.parseDouble(textImporte.getText());
					int iva = Integer.parseInt(textIva.getText());
					double iva2 = iva*importe/100;
					double total = importe*iva2;
					textTotal.setText(Double.toString(total));
				}catch(Exception ex) {
					lblInformacion.setText("Introduzca un valor correcto");
				}
			}
		});
		
	}

	private void definirVentana() {
		lblImporte = new JLabel("Importe");
		lblImporte.setBounds(29, 31, 46, 14);
		panel.add(lblImporte);
		
		lblIva = new JLabel("Iva");
		lblIva.setBounds(29, 54, 46, 14);
		panel.add(lblIva);
		
		lblTotal = new JLabel("Total");
		lblTotal.setBounds(29, 75, 46, 14);
		panel.add(lblTotal);
		
		textImporte = new JTextField();
		textImporte.setBounds(85, 28, 86, 20);
		panel.add(textImporte);
		textImporte.setColumns(10);
		
		textIva = new JTextField();
		textIva.setBounds(85, 51, 86, 20);
		panel.add(textIva);
		textIva.setColumns(10);
		
		textTotal = new JTextField();
		textTotal.setBounds(85, 75, 86, 20);
		panel.add(textTotal);
		textTotal.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(82, 122, 89, 23);
		panel.add(btnCalcular);
		
		lblInformacion = new JLabel("Información caracter");
		lblInformacion.setBounds(232, 54, 192, 14);
		panel.add(lblInformacion);
		
	}
}
