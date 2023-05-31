/**
 * 
 */
package ejercicio7;

/**
 * @author Alumno
 *
 */
public class Alumno {
	
	private String nombre;
	private int nota;
	
	public Alumno(String nombre, int nota) {
		this.nombre=nombre;
		this.nota=nota;
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
	 * @return the nota
	 */
	public int getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	

}
