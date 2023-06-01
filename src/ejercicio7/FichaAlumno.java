/**
 * 
 */
package ejercicio7;

import java.util.Vector;

/**
 * @author Alumno
 *
 */
public class FichaAlumno {

	Vector<Alumno> alumnos = new Vector<>();

	public void Anadir(String nombre, int nota) {
		Alumno alumno = new Alumno(nombre, nota);
		alumnos.add(alumno);
	}

	public void eliminar(String nombre) {

		for (int i = 0; i <alumnos.size(); i++) {
			if (nombre.equalsIgnoreCase(alumnos.get(i).getNombre())) {
				alumnos.remove(i);
				i--;
			}
		}
	}

	public Alumno buscar(String nombre) {
		Alumno alumno = null;
		for (int i = 0; i < alumnos.size() + 1; i++) {

			if (nombre.equalsIgnoreCase(alumnos.get(i).getNombre()))
				alumno = alumnos.get(i);
		}
		return alumno;
	}

	public int numeroAlumnosMatriculados() {
		return alumnos.size();
	}
}
