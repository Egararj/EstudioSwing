package vista.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCombo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JComboBox comboDiasSemana,comboLocalidad,comboMeses;
	private JLabel lblDia,lblMeses;
	private JTextField textDia;
	private JButton btnAceptar, btnAgregar;
	private DefaultComboBoxModel dc;
	private String[] meses = {"Enero","Febrero","Marzo","Abril"};


	public FrmCombo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 490);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		
		
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}


	private void definirEventos() {

		comboDiasSemana.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				lblDia.setText(comboDiasSemana.getSelectedItem().toString()+"..");
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDia.setText(comboDiasSemana.getSelectedItem().toString()+" boton");
			}
		});
		
		comboMeses.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblMeses.setText(comboMeses.getSelectedItem().toString());
			}
		});
	}


	private void definirVentana() {
		
		dc = new DefaultComboBoxModel();
		dc.addElement("lunes");
		dc.addElement("martes");
		dc.addElement("miercoles");
		dc.addElement("jueves");
		dc.addElement("viernes");
		dc.addElement("sabado");
		dc.addElement("domingo");
		
		comboDiasSemana = new JComboBox(dc);
		comboDiasSemana.setBounds(48, 66, 118, 22);
		panel.add(comboDiasSemana);
		
		lblDia = new JLabel("Día");
		lblDia.setBounds(48, 30, 118, 14);
		panel.add(lblDia);
		
		textDia = new JTextField();
		textDia.setBounds(48, 99, 86, 20);
		panel.add(textDia);
		textDia.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(48, 130, 89, 23);
		panel.add(btnAceptar);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(179, 98, 89, 23);
		panel.add(btnAgregar);
		
		comboLocalidad = new JComboBox();
		comboLocalidad.setModel(new DefaultComboBoxModel(new String[] {"Jerez", "Lebrija", "Trebujena"}));
		comboLocalidad.setBounds(48, 186, 118, 22);
		panel.add(comboLocalidad);
		
		comboMeses = new JComboBox(meses);
		comboMeses.setBounds(305, 66, 142, 22);
		panel.add(comboMeses);
		
		lblMeses = new JLabel("Meses");
		lblMeses.setBounds(305, 41, 124, 14);
		panel.add(lblMeses);
		
	}
}
