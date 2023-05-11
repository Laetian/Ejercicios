package ejercicio1;

public class Main {

	public static void main(String[] args) {

		Hora hora = new Hora();

		hora.establecerHora(10, 14, 50);
		hora.imprimir();
		hora.adelantarHora(1, 1, 1);
		hora.imprimir();
		hora.reiniciar();
		hora.imprimir();

	}

}
