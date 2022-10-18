package Excepcion;

public class ExcepcionesPersonalizadas extends Exception {

	private int codExcepcion;

	// Constructor default
	public ExcepcionesPersonalizadas() {

	}

	// Constructor principal para pasarle codigos de error
	public ExcepcionesPersonalizadas(int codExcepcion) {
		super();
		this.codExcepcion = codExcepcion;
	}

	// Método para mostrar mensajes customizados
	// Voy a usar tandas de 10 para los ejercicios.Por ejemplo ejercicio 2, del 200
	// al 210. Ejercicio 3, del 300 al 310.
	// Si lo utilizara en unidades siguientes usaré las siguientes decenas.
	@Override
	public String getMessage() {
		String mensaje = "";
		switch (codExcepcion) {

		// Excepciones ejercicio 2
		case 1:
			mensaje = "Mensaje mostrado por pantalla";
			break;
		case 2:
			mensaje = "Excepcion capturada con mensaje: Esto es un objeto Exception";
			break;
		case 3:
			mensaje = "Programa terminado";
			break;

		// Excepciones ejercicio 3
		case 4:
			mensaje = "Es par";
			break;
		case 5:
			mensaje = "Es impar";
			break;

		// Excepciones ejercicio 4
		case 6:
			mensaje = "Comando no válido.";
			break;
		case 500:
			mensaje = "Introduce un numero positivo";
			break;
		case 501:
			mensaje = "La longitud ha de estar entre 8 y 24 caracteres";
			break;
		}
		return mensaje;
	}
}