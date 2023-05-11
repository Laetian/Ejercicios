package ejercicio2;

public class Fecha {

	int dia;
	int mes;
	int anno;
	
	public Fecha() {
		super();
	}

	public Fecha(int dia, int mes, int anno) {
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
	}
	
	public void reiniciar() {
		this.dia=1;
		this.mes=1;
		this.anno=2000;
	}
	public void adelantar(int dia, int mes, int anno) {
		this.dia=this.dia+dia;
		this.mes=this.mes+mes;
		this.anno=this.anno+anno;
	}
	
	public void imprimir() {
		System.out.println("Fecha: "+dia+"/"+mes+"/"+anno);
	}
	public int diasDelMes(int mes) {
		switch(mes) {
		case 1,3,5,7,8,10,12:
			return 31;
		case 2:
			return 28;
		case 4,6,9,11:
			return 30;
		default:
			return 0;
		}
			
	}
	
	public boolean validar(int dia,int mes,int anno) {
		return false;
		if
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
