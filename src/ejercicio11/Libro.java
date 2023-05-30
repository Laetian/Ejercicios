/**
 * 
 */
package ejercicio11;

/**
 * @author Alumno
 *
 */
public class Libro extends Articulo {

	private String autor;

	/**
	 * 
	 */
	public Libro(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String toString = super.toString();
		return toString + " Autor: " + this.autor;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

}
