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
		this.numeroCuenta = (long) Math.random()*99999;
	}

	
	public void ingresar(double ingreso) {
		saldo=saldo+ingreso;
	}
	public double consultarSaldo() {
		return saldo;
	}
	public void mostrarInfo() {
		System.out.println(" Nombre del titular: "+nombreTitular+"/n"
				+"Saldo: "+saldo+"/n"
				+"número de cuenta: "+numeroCuenta+"/n");
	}
	public void transferencia(CuentaCorriente receptor, CuentaCorriente donante, double monto) {
		
	}
}
