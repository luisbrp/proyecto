package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Almacen extends Articulo{
	
	public void cargarDatos () {
	
	}
	
	public Articulo elMasCaro() {
		return null;
	}
	
	public double precio (String codigoProducto) {
		return 0;
	}
	
	public boolean hayStock(String codigoProducto ) {
		return false;	
	}
	
	public ArrayList<Articulo> stockJusto ( ) {
		return null;	
	}
	
	public Articulo articulo (String codigoProducto) {
		return null;	
	}
	
	public boolean disponibilidad (int cantidad, String codigoProducto ) {
		return false;
	}
	
	public ArrayList<Articulo> equivalentes ( ) {
		return null;	
	}
	
	public ArrayList<Articulo> ordenarPorprecio ( ) {
		return null;	
	}
	
	public void ordenarPorStock (String orden) {
		
	}
}
