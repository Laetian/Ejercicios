package ejercicio11;

public class Articulo {

	private String nombre;
	private int precio;
	
	
	public String toString() {
		String toString="Nombre: "+this.nombre+" precio: "+this.precio;
		return toString;
	}
	
	
	
	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
