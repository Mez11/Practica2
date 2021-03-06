package com.redes.p2.servidor.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AgregarProducto {

	private JFrame frmAgregarProducto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarProducto window = new AgregarProducto();
					window.frmAgregarProducto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AgregarProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgregarProducto = new JFrame();
		frmAgregarProducto.setTitle("Agregar producto");
		frmAgregarProducto.setBounds(100, 100, 450, 300);
		frmAgregarProducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgregarProducto.getContentPane().setLayout(null);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(181, 12, 70, 45);
		frmAgregarProducto.getContentPane().add(lblImagen);
		
		JButton btnEleguirImagen = new JButton("Eleguir imagen");
		btnEleguirImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEleguirImagen.setBounds(146, 69, 144, 25);
		frmAgregarProducto.getContentPane().add(btnEleguirImagen);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(22, 103, 70, 15);
		frmAgregarProducto.getContentPane().add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 130, 70, 15);
		frmAgregarProducto.getContentPane().add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(22, 157, 70, 15);
		frmAgregarProducto.getContentPane().add(lblNewLabel);
		
		JLabel lblExistencias = new JLabel("Existencias");
		lblExistencias.setBounds(22, 184, 96, 15);
		frmAgregarProducto.getContentPane().add(lblExistencias);
		
		JLabel lblNewLabel_1 = new JLabel("Descripcion");
		lblNewLabel_1.setBounds(22, 211, 106, 15);
		frmAgregarProducto.getContentPane().add(lblNewLabel_1);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(22, 238, 70, 15);
		frmAgregarProducto.getContentPane().add(lblOrigen);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(319, 206, 117, 25);
		frmAgregarProducto.getContentPane().add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(319, 147, 117, 25);
		frmAgregarProducto.getContentPane().add(btnAceptar);
		
		textField = new JTextField();
		textField.setBounds(110, 106, 124, 19);
		frmAgregarProducto.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 128, 124, 19);
		frmAgregarProducto.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 155, 124, 19);
		frmAgregarProducto.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 182, 124, 19);
		frmAgregarProducto.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110, 209, 124, 19);
		frmAgregarProducto.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(110, 236, 124, 19);
		frmAgregarProducto.getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}

}
