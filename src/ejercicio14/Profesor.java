/**
 * 
 */
package ejercicio14;

/**
 * @author Alumno
 *
 */
public abstract class Profesor extends Persona {
	
private String asignatura;
private String nombre;






public Profesor(String asignatura, String nombre) {
	super();
	this.asignatura = asignatura;
	this.nombre = nombre;
}
public abstract void cursoQueImparte();
/**
 * @return the asignatura
 */
public String getAsignatura() {
	return asignatura;
}
/**
 * @param asignatura the asignatura to set
 */
public void setAsignatura(String asignatura) {
	this.asignatura = asignatura;
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



}
