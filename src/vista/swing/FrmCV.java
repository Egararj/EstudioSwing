package vista.swing;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel,panel_datosPersonales,panel_estadoCivil,panel_lenguajesProgramacion,panel_SO,panel_masLenguajes,panel2;
	private JLabel lblCurriculumVitae, lblNombre,lblApellidos,lblDireccion,lblTelefono,lblPoblacion,lblExperienciaProfesional;
	private JTextField textNombre,textApellidos,textDireccion,textTelefono;
	private JComboBox comboPoblacion;
	private JRadioButton rdbtnSoltero,rdbtnCasado,rdbtnSeparado;
	private ButtonGroup estadoCivil;
	private ArrayList<JRadioButton> listaRadio;
	private JCheckBox chcJava,chcDelphi,chcAndroid;
	private ArrayList<JCheckBox> listaLenguajes;
	private JList listSO,listmasLenguajes;
	private JScrollPane scrollPane_1;
	private JTextArea textAreaExperiencia, textAreaTotal;
	private JButton btnAceptar;
	private JFrame frame;
	private String total = "";
	
	
	public FrmCV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 598);
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
				
				frame = new JFrame("Todas las opciones");
				frame.setSize(400,500);
				
				panel2 = new JPanel();
				panel2.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame.setContentPane(panel2);
				panel2.setLayout(null);

				
				definirVentana2();
				frame.setVisible(true);
			}

			private void definirVentana2() {
				
				textAreaTotal = new JTextArea();
				textAreaTotal.setBounds(5, 5, 390, 490);
				panel2.add(textAreaTotal);
				
				total += "Nombre: " + textNombre.getText() +"\n";
				total += "Apellidos: " + textApellidos.getText() +"\n";
				total += "Dirección: " + textDireccion.getText() +"\n";
				total += "Teléfono: " + textTelefono.getText() +"\n";
				total += "Población: " + comboPoblacion.getSelectedItem().toString() + "\n";
				
				for(JRadioButton radio:listaRadio) {
					if(radio.isSelected()) {
						total += "Estado civil: " + radio.getText() + "\n";
					}
				}
				
				JCheckBox check = new JCheckBox();
				check = null;
				total += "Lenguajes de programación: ";
				for (int x=0; x<listaLenguajes.size(); x++) {
					check = listaLenguajes.get(x);
					if(check.isSelected()) {
						total += check.getText() + " ";
					}
				}
				total += "\n";
				
				total += "Más lenguajes: ";
				Object[]seleccion = listmasLenguajes.getSelectedValues();
				for(Object obj:seleccion) {
					total += obj.toString() + " ";
				}
				total += "\n";
				
				total += "Sistemas operativos: ";
				seleccion = listSO.getSelectedValues();
				for(Object obj:seleccion) {
					total += obj.toString() + " ";
				}
				total += "\n";
				
				total += textAreaExperiencia.getText();
				textAreaTotal.setText(total);
			}
		});
	}

	private void definirVentana() {
		
		panel_datosPersonales = new JPanel();
		panel_datosPersonales.setBounds(38, 39, 262, 144);
		panel.add(panel_datosPersonales);
		panel_datosPersonales.setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 66, 14);
		panel_datosPersonales.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(10, 36, 66, 14);
		panel_datosPersonales.add(lblApellidos);
		
		lblDireccion = new JLabel("Dirección:");
		lblDireccion.setBounds(10, 61, 66, 14);
		panel_datosPersonales.add(lblDireccion);
		
		lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(10, 86, 66, 14);
		panel_datosPersonales.add(lblTelefono);
		
		lblPoblacion = new JLabel("Población:");
		lblPoblacion.setBounds(10, 111, 66, 14);
		panel_datosPersonales.add(lblPoblacion);
		
		textNombre = new JTextField();
		textNombre.setBounds(86, 8, 138, 20);
		panel_datosPersonales.add(textNombre);
		textNombre.setColumns(10);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(86, 33, 138, 20);
		panel_datosPersonales.add(textApellidos);
		textApellidos.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(86, 58, 138, 20);
		panel_datosPersonales.add(textDireccion);
		textDireccion.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(86, 83, 138, 20);
		panel_datosPersonales.add(textTelefono);
		textTelefono.setColumns(10);
		
		comboPoblacion = new JComboBox();
		comboPoblacion.setModel(new DefaultComboBoxModel(new String[] {"Jerez", "Trebujena", "Lebrija", "Sanlúcar"}));
		comboPoblacion.setBounds(86, 107, 138, 26);
		panel_datosPersonales.add(comboPoblacion);
		
		lblCurriculumVitae = new JLabel("Curriculum Vitae");
		lblCurriculumVitae.setBounds(38, 14, 213, 14);
		panel.add(lblCurriculumVitae);
		
		panel_estadoCivil = new JPanel();
		panel_estadoCivil.setBounds(38, 214, 101, 87);
		panel.add(panel_estadoCivil);
		panel_estadoCivil.setLayout(null);
		
		estadoCivil = new ButtonGroup();
		listaRadio = new ArrayList<JRadioButton>();
		
		rdbtnSoltero = new JRadioButton("Soltero");
		rdbtnSoltero.setBounds(6, 7, 109, 23);
		estadoCivil.add(rdbtnSoltero);
		listaRadio.add(rdbtnSoltero);
		panel_estadoCivil.add(rdbtnSoltero);
		
		rdbtnCasado = new JRadioButton("Casado");
		rdbtnCasado.setBounds(6, 33, 109, 23);
		estadoCivil.add(rdbtnCasado);
		listaRadio.add(rdbtnCasado);
		panel_estadoCivil.add(rdbtnCasado);
		
		rdbtnSeparado = new JRadioButton("Separado");
		listaRadio.add(rdbtnSeparado);
		rdbtnSeparado.setBounds(6, 59, 109, 23);
		estadoCivil.add(rdbtnSeparado);
		panel_estadoCivil.add(rdbtnSeparado);
		
		panel_lenguajesProgramacion = new JPanel();
		panel_lenguajesProgramacion.setBounds(166, 214, 133, 87);
		panel.add(panel_lenguajesProgramacion);
		panel_lenguajesProgramacion.setLayout(null);
		
		chcJava = new JCheckBox("Java");
		chcJava.setBounds(6, 7, 97, 23);
		panel_lenguajesProgramacion.add(chcJava);
		
		chcDelphi = new JCheckBox("Delphi");
		chcDelphi.setBounds(6, 33, 97, 23);
		panel_lenguajesProgramacion.add(chcDelphi);
		
		chcAndroid = new JCheckBox("Android");
		chcAndroid.setBounds(6, 59, 97, 23);
		panel_lenguajesProgramacion.add(chcAndroid);
		
		listaLenguajes = new ArrayList<JCheckBox>();
		listaLenguajes.add(chcJava);listaLenguajes.add(chcDelphi);listaLenguajes.add(chcAndroid);
		
		panel_SO = new JPanel();
		panel_SO.setBounds(333, 39, 120, 68);
		panel.add(panel_SO);
		panel_SO.setLayout(new BorderLayout(0, 0));
		JScrollPane scrollPane = new JScrollPane();
		panel_SO.add(scrollPane, BorderLayout.CENTER);
		
		listSO = new JList();
		listSO.setModel(new AbstractListModel() {
			String[] values = new String[] {"Windows 7", "Windows Server", "Linux", "Android", "Mac"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listSO);
		
		panel_masLenguajes = new JPanel();
		panel_masLenguajes.setBounds(333, 214, 101, 87);
		panel.add(panel_masLenguajes);
		panel_masLenguajes.setLayout(new BorderLayout(0, 0));
		
		scrollPane_1 = new JScrollPane();
		panel_masLenguajes.add(scrollPane_1, BorderLayout.CENTER);
		
		listmasLenguajes = new JList();
		listmasLenguajes.setModel(new AbstractListModel() {
			String[] values = new String[] {"Informix", "MySql", "Access", "Oracle"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(listmasLenguajes);
		
		textAreaExperiencia = new JTextArea();
		textAreaExperiencia.setBounds(492, 214, 198, 204);
		panel.add(textAreaExperiencia);
		
		lblExperienciaProfesional = new JLabel("Experiencia Profesional");
		lblExperienciaProfesional.setBounds(492, 189, 142, 14);
		panel.add(lblExperienciaProfesional);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(38, 341, 109, 59);
		panel.add(btnAceptar);
		
	}
}
