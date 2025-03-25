package vista.swing;

import java.awt.EventQueue;
import java.util.EventListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;

public class FrmTrabajoDeClase extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JList listPoblacion, listLibros,listAlumnos;
	private JLabel lblPoblacion,lblLibros,lblAlumnos;
	private JTextField textAgregar;
	private JButton btnAceptar, btnAgregar, btnAceptar2;
	private DefaultListModel modelo;
	private JPanel panel_2;
	private JScrollPane scrollPane_1;
	private String[] Alumnos= {"Antonio","Francis","Lorena","Andres","Luis"};
	private JPanel panel_3;
	private JScrollPane scrollPane_2;
	private JButton btnAceptar3;


	public FrmTrabajoDeClase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		
		
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}


	private void definirEventos() {
		listPoblacion.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int valor = listPoblacion.getSelectedIndex();
				lblPoblacion.setText(listPoblacion.getSelectedValue().toString()+"..."+valor);
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPoblacion.setText(listPoblacion.getSelectedValue().toString()+" desde el botón");

			}
		});
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.addElement(textAgregar.getText());
			}
		});
		
		btnAceptar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[]seleccion = listLibros.getSelectedValues();
				
				lblLibros.setText("");
				for(Object obj:seleccion) {
					lblLibros.setText(lblLibros.getText()+obj.toString()+ " ");
				}
			}
		});
		
		btnAceptar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[]valores = listAlumnos.getSelectedIndices();
				String cadena = "";
				for(int x=0; x<valores.length; x++) {
					cadena = cadena+Alumnos[valores[x]]+ " ";
				}
				lblAlumnos.setText(cadena);
			}
		});
	}


	private void definirVentana() {
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(55, 82, 204, 230);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		modelo = new DefaultListModel();
		
		modelo.addElement("Jerez");modelo.addElement("Trebujena");modelo.addElement("Lebrija");
		modelo.addElement("Sanlucar");modelo.addElement("Cadiz");
		listPoblacion = new JList(modelo);
		
		scrollPane.setViewportView(listPoblacion);
		
		lblPoblacion = new JLabel("...");
		lblPoblacion.setBounds(58, 57, 166, 14);
		panel.add(lblPoblacion);
		
		textAgregar = new JTextField();
		textAgregar.setBounds(55, 343, 86, 20);
		panel.add(textAgregar);
		textAgregar.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(170, 342, 89, 23);
		panel.add(btnAgregar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(170, 397, 89, 23);
		panel.add(btnAceptar);
		
		panel_2 = new JPanel();
		panel_2.setBounds(381, 82, 204, 230);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		listLibros = new JList();
		listLibros.setModel(new AbstractListModel() {
			String[] values = new String[] {"El Quijote", "El Código DaVinci", "Diamante de Sangre", "El Capitán Alatriste"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(listLibros);
		
		lblLibros = new JLabel("Libros");
		lblLibros.setBounds(381, 57, 235, 14);
		panel.add(lblLibros);
		
		btnAceptar2 = new JButton("Aceptar");
		btnAceptar2.setBounds(496, 342, 89, 23);
		panel.add(btnAceptar2);
		
		panel_3 = new JPanel();
		panel_3.setBounds(635, 82, 166, 230);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		scrollPane_2 = new JScrollPane();
		panel_3.add(scrollPane_2, BorderLayout.CENTER);
		
		listAlumnos = new JList(Alumnos);
		scrollPane_2.setViewportView(listAlumnos);
		
		lblAlumnos = new JLabel("Alumnos");
		lblAlumnos.setBounds(635, 57, 166, 14);
		panel.add(lblAlumnos);
		
		btnAceptar3 = new JButton("Aceptar");
		btnAceptar3.setBounds(712, 342, 89, 23);
		panel.add(btnAceptar3);
	}
}
