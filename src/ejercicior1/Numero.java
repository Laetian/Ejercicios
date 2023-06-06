/**
 * 
 */
package ejercicior1;

import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class Numero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		
		
		
		
		
		
		
		
		
		System.out.println("Mete un numero");
		
		numero=sc.nextInt();
		
		

		
		while(numero>0) {
			System.out.println("el cuadrado es"+(numero*numero));
			System.out.println("Mete un numero");
			numero=sc.nextInt();
		}
		

	}

}
