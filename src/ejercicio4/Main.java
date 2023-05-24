package ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] arrayPersona = new Persona[5];
		
		arrayPersona[0]=new Persona(15, "Anna");
		arrayPersona[1]=new Persona(19, "Juan");
		arrayPersona[2]=new Persona(15, "Luis");
		arrayPersona[3]=new Persona(15, "Maca");
		arrayPersona[4]=new Persona(15, "Pepe");
		
		Listado listado= new Listado();
		listado.mostrarDatos(arrayPersona);
	}

}
