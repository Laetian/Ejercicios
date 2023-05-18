package ejercicio2;

public class Fecha {

	int dia = 1;
	int mes = 1;
	int anno = 2000;

	public Fecha() {
		super();
	}

	public Fecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public void reiniciar() {
		this.dia = 1;
		this.mes = 1;
		this.anno = 2000;
	}
	
	public void establecerFecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public void adelantar(int dia, int mes, int anno) {
		this.dia = this.dia + dia;
		this.mes = this.mes + mes;
		this.anno = this.anno + anno;
	}

	public void imprimir() {
		System.out.println("Fecha: " + dia + "/" + mes + "/" + anno);
	}

	public int diasDelMes(int mes, int anno) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			if (esBisiesto(anno))
				return 29;
			else
				return 28;
		case 4, 6, 9, 11:
			return 30;
		default:
			return 0;
		}
	}

	public boolean esBisiesto(int anno) {
		if (anno % 400 == 0 || anno % 4 == 0 && anno % 100 != 0) {
			return true;
		}
		return false;
	}

	public boolean validar(int dia, int mes, int anno) {
		int validMes = 0, validDia = 0, validAnno = 0;
		if (anno > 0)
			validAnno = 1;
		else
			System.out.println("Año incorrecto, introduzca un año correcto");
		if (mes > 0 && mes <= 12)
			validMes = 1;
		else
			System.out.println("Mes incorrecto, introduzca un mes correcto");
		if (dia > 0 && dia <= diasDelMes(mes, anno))
			validDia = 1;
		else
			System.out.println("Día incorrecto, introduzca un dia correcto");
		if (validDia == 1 && validMes == 1 && validAnno == 1)
			return true;
		else
			return false;
	}
	public boolean validar() {
		int validMes = 0, validDia = 0, validAnno = 0;
		if (anno > 0)
			validAnno = 1;
		else
			System.out.println("Año incorrecto, introduzca un año correcto");
		if (mes > 0 && mes <= 12)
			validMes = 1;
		else
			System.out.println("Mes incorrecto, introduzca un mes correcto");
		if (dia > 0 && dia <= diasDelMes(mes, anno))
			validDia = 1;
		else
			System.out.println("Día incorrecto, introduzca un dia correcto");
		if (validDia == 1 && validMes == 1 && validAnno == 1)
			return true;
		else
			return false;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

}
