package ejercicio3;

public class CuentaCorriente {

	double saldo;
	String nombreTitular;
	long numeroCuenta;

	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(double saldo, String nombreTitular) {
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
		this.numeroCuenta = (long) Math.random();
	}

}
