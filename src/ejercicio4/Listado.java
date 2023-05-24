/**
 * 
 */
package ejercicio4;

/**
 * @author Alumno
 *
 */
public class Listado {

	public void mostrarDatos(Persona arrayPersona[]) {
		for (int i = 0; i < arrayPersona.length; i++) {
			System.out.println("Nombre: " + arrayPersona[i].getNombre());
			System.out.println("Edad: " + arrayPersona[i].getEdad());
			if (arrayPersona[i].getEdad() < 18)
				System.out.println(arrayPersona[i].getNombre() + " es menor de edad.");
			else
				System.out.println(arrayPersona[i].getNombre() + " es mayor de edad.\n");
		}
	}

}
