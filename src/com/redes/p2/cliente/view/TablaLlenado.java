package com.redes.p2.cliente.view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaLlenado  extends JFrame{
	
	private JTable table;
	private DefaultTableModel modelo;

	DataConnection con = DataConnection.getInstance();
	modelo = new DefaultTableModel() {
	   public boolean isCellEditable(int fila, int columna) {
	       return false; //Con esto conseguimos que la tabla no se pueda editar
	   }
	}

	table = new JTable(modelo); //Metemos el modelo dentro de la tabla
	 
	modelo.addColumn("Nombre"); //Añadimos las columnas a la tabla (tantas como queramos)
	modelo.addColumn("Precio");
	 
	rellenarTabla(); //Llamamos al método que rellena la tabla con los datos de la base de datos
	 
	scrollPane.setViewportView(table);//Esto añade la tabla al portView del scrollPane, si estaba puesto anteriormente
	                                  //hay que borrarlo del otro sitio, sino puede dar error de NullPointerException
	void rellenarTabla(){

	   try {
	       ResultSet rs = con.listaComidas(); //con es la conexión que hemos creado antes con el patrón singleton               
	                                                                                 //listaEquipos() es la consulta a la base de datos, que retorna un ResultSet
	  while(rs.next()){
	  Object[] fila = new Object[2];//Creamos un Objeto con tantos parámetros como datos retorne cada fila 
	  fila[0] = rs.getString("nombre"); //Lo que hay entre comillas son los campos de la base de datos
	  fila[1] = rs.getDouble("precio");
	  modelo.addRow(fila); // Añade una fila al final del modelo de la tabla
	  }
	  tabla.updateUI();//Actualiza la tabla

	   } catch (SQLException e) {
	   e.printStackTrace();
	   }

	                                                      	














	
