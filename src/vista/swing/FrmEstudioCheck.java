package vista.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FrmEstudioCheck extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JCheckBox chckbxJamon,chckbxPeperoni,chckbxBacon;
	private JLabel lblIngrediente1,lblIngrediente2,lblIngrediente3;
	private JCheckBox chckbxDobleQueso;
	private JLabel lblIngrediente4;
	private JButton btnAceptar;
	private JTextArea textAreaIngredientes;
	private ArrayList <JCheckBox> listaIngredientes;
	
	
	public FrmEstudioCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 543);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		
		
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}

	private void definirEventos() {
		
		chckbxJamon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxJamon.isSelected()) {
					lblIngrediente1.setText(chckbxJamon.getText());
				}else {
					lblIngrediente1.setText("Ingrediente");
				}
			}	
		});
		
		chckbxPeperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPeperoni.isSelected()) {
					lblIngrediente2.setText(chckbxPeperoni.getText());
				}else {
					lblIngrediente2.setText("Ingrediente");
				}
			}
		});
		
		chckbxBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBacon.isSelected()) {
					lblIngrediente3.setText(chckbxBacon.getText());
				}else {
					lblIngrediente3.setText("Ingrediente");
				}
			}
		});
		
		chckbxDobleQueso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDobleQueso.isSelected()) {
					lblIngrediente4.setText(chckbxDobleQueso.getText());
				}else {
					lblIngrediente4.setText("Ingrediente");
				}
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingredientes = "Ingredientes \n";
				JCheckBox check = new JCheckBox();
				check= null;
				for (int x=0; x<listaIngredientes.size(); x++) {
					check = listaIngredientes.get(x);
					if(check.isSelected()) {
						ingredientes = ingredientes + check.getText() + "\n";
					}
				}
				textAreaIngredientes.setText(ingredientes);
			}
		});
		
	}

	private void definirVentana() {
		
		chckbxJamon = new JCheckBox("Jamón");
		chckbxJamon.setBounds(43, 53, 93, 21);
		panel.add(chckbxJamon);
		
		lblIngrediente1 = new JLabel("Ingrediente");
		lblIngrediente1.setForeground(new Color(255, 0, 0));
		lblIngrediente1.setBounds(142, 57, 77, 13);
		panel.add(lblIngrediente1);
		
		chckbxPeperoni = new JCheckBox("Peperoni");
		chckbxPeperoni.setForeground(new Color(0, 0, 0));
		chckbxPeperoni.setBounds(43, 76, 93, 21);
		panel.add(chckbxPeperoni);
		
		lblIngrediente2 = new JLabel("Ingrediente");
		lblIngrediente2.setForeground(new Color(255, 0, 0));
		lblIngrediente2.setBounds(142, 80, 77, 13);
		panel.add(lblIngrediente2);
		
		chckbxBacon = new JCheckBox("Bacon");
		chckbxBacon.setBounds(43, 99, 93, 21);
		panel.add(chckbxBacon);
		
		lblIngrediente3 = new JLabel("Ingrediente");
		lblIngrediente3.setForeground(new Color(255, 0, 0));
		lblIngrediente3.setBounds(142, 103, 77, 13);
		panel.add(lblIngrediente3);
		
		chckbxDobleQueso = new JCheckBox("Doble Queso");
		chckbxDobleQueso.setBounds(43, 122, 93, 21);
		panel.add(chckbxDobleQueso);
		
		listaIngredientes = new ArrayList<JCheckBox>();
		listaIngredientes.add(chckbxJamon); listaIngredientes.add(chckbxBacon);listaIngredientes.add(chckbxPeperoni);listaIngredientes.add(chckbxDobleQueso);
		
		lblIngrediente4 = new JLabel("Ingrediente");
		lblIngrediente4.setForeground(new Color(255, 0, 0));
		lblIngrediente4.setBounds(142, 126, 77, 13);
		panel.add(lblIngrediente4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(116, 172, 85, 21);
		panel.add(btnAceptar);
		
		textAreaIngredientes = new JTextArea("Ingredientes\n");
		textAreaIngredientes.setBounds(247, 51, 163, 206);
		panel.add(textAreaIngredientes);
		
	}
}
