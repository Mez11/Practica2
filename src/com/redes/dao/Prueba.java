package com.redes.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.LeafElement;

import com.redes.model.Productos;

public class Prueba {

	public static void main (String []args) throws IOException{
		ProductosDao dao = new ProductosDao();
		Productos mochila = new Productos();
		mochila.setNombre("Malo");
		
		mochila.setOrigen("China");
		mochila.setDescripcion("Grande y cara");
		mochila.setExistencias(2);
		//Byte byte[] = new Byte();
		File file = new File("/home/pma/Pictures/Captura.png");
		FileInputStream fis = new FileInputStream(file);
		byte[] mochilaImagen = new byte [(int)file.length()];
		fis.read(mochilaImagen);
		mochila.setImagen(mochilaImagen);
		mochila.setPrecio(2.0);
		
		dao.inicializarConexion( );
		dao.create(mochila);
		//Borrar
		//Productos pr = new Productos();
		mochila.setIdProductos(1);
		dao.erase(mochila);
		mochila.setIdProductos(2);
		mochila.setDescripcion("Es horrorosa" );
		dao.update(mochila);
		
		List<Productos> productosList = dao.getProductos();
		
		for(Productos producto : productosList ){
			/*producto.getDescripcion();
			producto.getExistencias();
			producto.getIdProductos();
			producto.getImagen();
			producto.getNombre();
			producto.getOrigen();
			producto.getPrecio();**/
			System.out.println("Descripcion"+producto.getDescripcion());
			System.out.println("Nombre"+producto.getNombre());
			
		
		}
		
	}
}
