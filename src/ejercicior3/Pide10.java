/**
 * 
 */
package ejercicior3;

import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class Pide10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int negativos=0;
		int contadorNeg=0;
		int contadorPos=0;
		int positivos=0;
		
		int zero = 0;
		int i;
		Scanner sc = new Scanner (System.in);
			
		for (i=0; i<10; i++) {
			System.out.println("mete algun numero");
			numero= sc.nextInt();
			
			if (numero>0) {
				positivos=positivos+numero;
				contadorPos++;
			}
			if (numero<0) {
				negativos=negativos+numero;
				contadorNeg++;
			}
			if(numero==0) zero++;
		}
		
		System.out.println("la media de los positivos es "+ (positivos/contadorPos));
		System.out.println("la media de los negativos es "+ (negativos/contadorNeg));
		System.out.println("Numero de 0:"+zero);
		
		
		
	}

}
