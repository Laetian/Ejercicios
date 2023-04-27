package ejercicio1;

public class Hora {
	
	private int hora,min,seg;
	
	public Hora(int hora, int min, int seg) {
		this.hora=hora;
		this.min=min;
		this.seg=seg;
	}
	public Hora() {
	 super();
	}

	public void establecerHora(int hora, int min, int seg) {
		this.hora=hora;
		this.min=min;
		this.seg=seg;
	}
	
	public void adelantarHora(int hora, int min, int seg) {
		this.hora=this.hora+hora;
		this.min=this.min+min;
		this.seg=this.seg+seg;
	}
	public void reiniciar() {
		this.hora=0;
		this.min=0;
		this.seg=0;
	}
	public void imprimir() {
		System.out.println("Hora: "+hora+":"+min+":"+seg);
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	
}
