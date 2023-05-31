/**
 * 
 */
package ejercicio7;

import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class LlamadaMenu {


	public void llamadaAlMenu() {
		Menu menu= new Menu();
		FichaAlumno ficha=new FichaAlumno();
		Scanner sc= new Scanner(System.in);
		int opcion;
		String nombre;
		int nota;
		boolean salir=false;
		
		
		do {
			menu.print();
			opcion=sc.nextInt();
			
			
			switch(opcion){
				
			case 0:
				System.out.println("saliendo del programa");
				salir=true;
				break;
			case 1:
				System.out.println("Añada el nombre del alumno:");
				sc.nextLine();
				nombre=sc.nextLine();
				System.out.println("Añada la nota del alumno");
				nota=sc.nextInt();
				ficha.Anadir(nombre, nota);
				break;
			case 2:
				System.out.println("Añada el nombre del alumno");
				nombre=sc.nextLine();
				ficha.eliminar(nombre);
				break;
			case 3:
				System.out.println("Añada el nombre del alumno");
				sc.nextLine();
				nombre=sc.nextLine();
				Alumno alumno=ficha.buscar(nombre);
				if(alumno!=null)System.out.println("El alumno existe");
				else System.out.println("El alumno no existe");
				break;
			case 4:
				System.out.println("Contamos "+ficha.numeroAlumnosMatriculados()+" alumnos matriculados");
				break;
			}
		} while(salir==false);

			System.out.println("¡Adios!");
	}

}
