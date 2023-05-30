/**
 * 
 */
package ejercicio11;

/**
 * @author Alumno
 *
 */
public class Disco extends Articulo {

	
	private String interprete;
	/**
	 * 
	 */
	public Disco(String interprete) {
		this.interprete=interprete;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String toString= super.toString();
		return toString+" Interprete: "+this.interprete;
	}
	
	/**
	 * @return the interprete
	 */
	public String getInterprete() {
		return interprete;
	}
	/**
	 * @param interprete the interprete to set
	 */
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	
	
}
