package vista.swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FrmTablasMultiplicar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panel_tablas;
	private JButton btnTabla1,btnTabla2,btnTabla3,btnTabla4,btnTabla5,btnTabla6,btnTabla7,btnTabla8,btnTabla9,btnCorregir;
	private JLabel lblInfoTabla,lblx1,lblx2,lblx3,lblx4,lblx5,lblx6,lblx7,lblx8,lblx9,lblx10;
	private JTextField textx1,textx2,textx3,textx4,textx5,textx6,textx7,textx8,textx9,textx10;
	private ArrayList<String> cuadroTexto = new ArrayList<>();
	private ArrayList<JTextField> cuadroTextoEstatico = new ArrayList<>();
	private int num = 0;


	public FrmTablasMultiplicar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		
		
		definirVentana();
		definirListaEstatica();
		definirEventos();
		this.setVisible(true);
	}
	
	

	private void limpiarCampos() {
		JTextField recuadroTexto = textx1;
		for(int x=0; x<10; x++) {
			recuadroTexto = cuadroTextoEstatico.get(x);
			recuadroTexto.setText("");
			recuadroTexto.setBackground(Color.WHITE);
		}
	}
	private void definirListaEstatica() {
		
		cuadroTextoEstatico.add(0,textx1);
		cuadroTextoEstatico.add(1,textx2);
		cuadroTextoEstatico.add(2,textx3);
		cuadroTextoEstatico.add(3,textx4);
		cuadroTextoEstatico.add(4,textx5);
		cuadroTextoEstatico.add(5,textx6);
		cuadroTextoEstatico.add(6,textx7);
		cuadroTextoEstatico.add(7,textx8);
		cuadroTextoEstatico.add(8,textx9);
		cuadroTextoEstatico.add(9,textx10);
	}
	
	private void definirLista() {
		
		cuadroTexto.add(0,textx1.getText());
		cuadroTexto.add(1,textx2.getText());
		cuadroTexto.add(2,textx3.getText());
		cuadroTexto.add(3,textx4.getText());
		cuadroTexto.add(4,textx5.getText());
		cuadroTexto.add(5,textx6.getText());
		cuadroTexto.add(6,textx7.getText());
		cuadroTexto.add(7,textx8.getText());
		cuadroTexto.add(8,textx9.getText());
		cuadroTexto.add(9,textx10.getText());	
	}

	private void correcion(int num) {
		int numPrueba = 0;
		JTextField recuadroTexto = textx1;
		for(int x=0; x<10; x++) {
			try {
				recuadroTexto = cuadroTextoEstatico.get(x);
				numPrueba = Integer.parseInt(cuadroTexto.get(x));				
				if(num*(x+1) == numPrueba) {
					recuadroTexto.setBackground(Color.GREEN);
				}else {
					recuadroTexto.setText("");
					recuadroTexto.setBackground(Color.RED);
				}
			}catch(Exception e) {
				recuadroTexto.setText("");
				recuadroTexto.setBackground(Color.RED);
			}
		}
	}

	private void establecerTabla(int numero) {
		
		btnCorregir.setEnabled(true);
		num = numero;
		
		lblInfoTabla.setText("TABLA DEL "+numero);;
		lblx1.setText(numero + " x 1 =");
		lblx2.setText(numero + " x 2 =");
		lblx3.setText(numero + " x 3 =");
		lblx4.setText(numero + " x 4 =");
		lblx5.setText(numero + " x 5 =");
		lblx6.setText(numero + " x 6 =");
		lblx7.setText(numero + " x 7 =");
		lblx8.setText(numero + " x 8 =");
		lblx9.setText(numero + " x 9 =");
		lblx10.setText(numero + " x 10 =");

	}

	private void definirEventos() {
	
		btnTabla1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(1);
			}
		});
		
		btnTabla2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(2);
			}
		});
		
		btnTabla3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(3);
			}
		});
		
		btnTabla4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(4);
			}
		});
		
		btnTabla5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(5);
			}
		});
		
		btnTabla6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(6);
			}
		});
		
		btnTabla7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(7);
			}
		});
		
		btnTabla8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(8);
			}
		});
		
		btnTabla9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
				establecerTabla(9);
			}
		});
		
		btnCorregir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				definirLista();
				correcion(num);
			}
		});
		
	}


	private void definirVentana() {
	
		panel_tablas = new JPanel();
		panel_tablas.setBounds(40, 40, 300, 300);
		panel_tablas.setBackground(Color.GRAY);
		panel.add(panel_tablas);
		panel_tablas.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnTabla1 = new JButton("1");
		panel_tablas.add(btnTabla1);
		
		btnTabla2 = new JButton("2");
		panel_tablas.add(btnTabla2);
		
		btnTabla3 = new JButton("3");
		panel_tablas.add(btnTabla3);
		
		btnTabla4 = new JButton("4");
		panel_tablas.add(btnTabla4);
		
		btnTabla5 = new JButton("5");
		panel_tablas.add(btnTabla5);
		
		btnTabla6 = new JButton("6");
		panel_tablas.add(btnTabla6);
		
		btnTabla7 = new JButton("7");
		panel_tablas.add(btnTabla7);
		
		btnTabla8 = new JButton("8");
		panel_tablas.add(btnTabla8);
		
		btnTabla9 = new JButton("9");
		panel_tablas.add(btnTabla9);
		
		lblInfoTabla = new JLabel("TABLA");
		lblInfoTabla.setBounds(560, 39, 88, 14);
		panel.add(lblInfoTabla);
		
		lblx1 = new JLabel("x1 =");
		lblx1.setBounds(514, 64, 46, 14);
		panel.add(lblx1);
		
		textx1 = new JTextField();
		textx1.setBounds(605, 64, 86, 20);
		panel.add(textx1);
		textx1.setColumns(10);
		
		lblx2 = new JLabel("x2 =");
		lblx2.setBounds(514, 98, 46, 14);
		panel.add(lblx2);
		
		textx2 = new JTextField();
		textx2.setBounds(605, 95, 86, 20);
		panel.add(textx2);
		textx2.setColumns(10);
		
		lblx3 = new JLabel("x3 =");
		lblx3.setBounds(514, 129, 46, 14);
		panel.add(lblx3);
		
		textx3 = new JTextField();
		textx3.setBounds(605, 126, 86, 20);
		panel.add(textx3);
		textx3.setColumns(10);
		
		lblx4 = new JLabel("x4 =");
		lblx4.setBounds(514, 160, 46, 14);
		panel.add(lblx4);
		
		textx4 = new JTextField();
		textx4.setBounds(605, 157, 86, 20);
		panel.add(textx4);
		textx4.setColumns(10);
		
		lblx5 = new JLabel("x5 =");
		lblx5.setBounds(514, 191, 46, 14);
		panel.add(lblx5);
		
		textx5 = new JTextField();
		textx5.setBounds(605, 188, 86, 20);
		panel.add(textx5);
		textx5.setColumns(10);
		
		textx6 = new JTextField();
		textx6.setBounds(605, 219, 86, 20);
		panel.add(textx6);
		textx6.setColumns(10);
		
		lblx6 = new JLabel("x6 =");
		lblx6.setBounds(514, 222, 46, 14);
		panel.add(lblx6);
		
		textx7 = new JTextField();
		textx7.setBounds(605, 250, 86, 20);
		panel.add(textx7);
		textx7.setColumns(10);
		
		lblx7 = new JLabel("x7 =");
		lblx7.setBounds(514, 253, 46, 14);
		panel.add(lblx7);
		
		textx8 = new JTextField();
		textx8.setBounds(605, 281, 86, 20);
		panel.add(textx8);
		textx8.setColumns(10);
		
		lblx8 = new JLabel("x8 =");
		lblx8.setBounds(514, 284, 46, 14);
		panel.add(lblx8);
		
		textx9 = new JTextField();
		textx9.setBounds(605, 312, 86, 20);
		panel.add(textx9);
		textx9.setColumns(10);
		
		lblx9 = new JLabel("x9 =");
		lblx9.setBounds(514, 315, 46, 14);
		panel.add(lblx9);
		
		textx10 = new JTextField();
		textx10.setBounds(605, 343, 86, 20);
		panel.add(textx10);
		textx10.setColumns(10);
		
		lblx10 = new JLabel("x10 =");
		lblx10.setBounds(514, 346, 46, 14);
		panel.add(lblx10);
		
		btnCorregir = new JButton("Corregir");
		btnCorregir.setBounds(602, 395, 89, 23);
		btnCorregir.setEnabled(false);
		panel.add(btnCorregir);
		
	}
}
