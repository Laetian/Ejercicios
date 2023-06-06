/**
 * 
 */
package ejercicior2;

import java.beans.DefaultPersistenceDelegate;
import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class Numeros15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero;
		int suma=0;
		int i;
		
		System.out.println("mete 15 numeros");
		

		for (i=0; i<15; i++) {
			numero = sc.nextInt();
			suma = suma+numero;
		}
		System.out.println("resultado: "+suma);
		

	}

}
