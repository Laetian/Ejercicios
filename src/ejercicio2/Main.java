package ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha fecha= new Fecha(29,2,2000);
		
		fecha.validar();
		fecha.imprimir();
		fecha.establecerFecha(29, 2, 2001);
		fecha.validar();
		fecha.imprimir();
		fecha.adelantar(-1, 0, 0);
		fecha.validar();
		fecha.imprimir();
	}

}
