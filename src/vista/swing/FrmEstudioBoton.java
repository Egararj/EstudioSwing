package vista.swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;

public class FrmEstudioBoton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel, panel_1;
	private JButton btnRojo;
	private JButton btnAzul;
	private JButton btnAmarillo;
	private JButton btnVerde;
	private JFrame frame;
	private JToggleButton tglbtnHabilitado;
	private JButton btnGuardar;
	private JButton btnImagen;
	private JButton btnNuevo;
	private ImageIcon disquete;
	
	
	public FrmEstudioBoton() {
		frame = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("Muestra el color seleccionado");
		panel_1.setBounds(191, 132, 228, 86);
		panel_1.setBackground(Color.BLUE);
		panel.add(panel_1);
		
		definirVentana();
		definirEventos();
		setVisible(true);
	}



	private void definirEventos() {

		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.RED);
			}
		});
		
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.BLUE);

			}
		});
		
		btnAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.YELLOW);

			}
		});
		
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setBackground(Color.GREEN);
		        JOptionPane.showMessageDialog(frame, "Color verde", "MIRA ESTO", JOptionPane.INFORMATION_MESSAGE);

			}
		});
		
		tglbtnHabilitado.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(tglbtnHabilitado.isSelected()){
					tglbtnHabilitado.setText("Deshabilitado");
					boolean bl = false;
					habilitar(bl);
					
				}else{
					tglbtnHabilitado.setText("Habilitado");
					boolean bl = true;
					habilitar(bl);
				}
			}

			private void habilitar(boolean bl) {
				btnRojo.setEnabled(bl);
				btnAzul.setEnabled(bl);
				btnAmarillo.setEnabled(bl);
				btnVerde.setEnabled(bl);
			}
		});
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNuevo.setEnabled(false);
				btnImagen.setEnabled(true);
				btnGuardar.setEnabled(true);
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGuardar.setEnabled(false);
				btnNuevo.setEnabled(true);
				btnImagen.setEnabled(false);
			}
		});
		
		
	}



	private void definirVentana() {
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(47, 46, 89, 23);
		panel.add(btnRojo);
		
		btnAzul = new JButton("Azul");	
		btnAzul.setBounds(448, 46, 89, 23);
		panel.add(btnAzul);
		
		btnAmarillo = new JButton("Amarillo");
		btnAmarillo.setBounds(47, 236, 89, 23);
		panel.add(btnAmarillo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(448, 236, 89, 23);
		panel.add(btnVerde);
		
		tglbtnHabilitado = new JToggleButton("Habilitado");
		tglbtnHabilitado.setBounds(236, 46, 121, 23);
		panel.add(tglbtnHabilitado);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(47, 342, 89, 23);
		panel.add(btnGuardar);
		btnGuardar.setEnabled(false);
		
		disquete = new ImageIcon("imagenes/disquete.png");
		btnImagen = new JButton(disquete);
		btnImagen.setToolTipText("Esto es un disquete");
		btnImagen.setBounds(164, 308, 140, 117);
		panel.add(btnImagen);
		btnImagen.setEnabled(false);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(47, 308, 89, 23);
		panel.add(btnNuevo);
		
		
	}
}
