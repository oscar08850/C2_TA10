package ex5;

import java.util.Random;

public class Password {

	/// Atributos ///

	private int longitud;
	private String contraseña;

	/// Constructores ///

	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = creaContraseña(longitud);
	}

	/// Metodos ///
	private String creaContraseña(int longitud) {
		// valores de ascii entre los que se incluyen numeros y letras en minusculas y
		// mayusculas
		int min = 48, max = 122;
		String intToAscii = "";
		String contra = "";
		Random random = new Random();
		int numero = 0;
		for (int i = 0; i < longitud; i++) {
			do {
				numero = random.nextInt(max - min + 1) + min; // Coge un random entre min y max
			} while ((numero >= 58 && numero <= 64) || (numero >= 91 && numero <= 96)); // Eliminamos los caracteres
																						// diferentes. En la primera
																						// versión los usaba para darle
																						// aún más seguridad a la
																						// contraseña
			intToAscii = Character.toString((char) numero);
			contra = contra + intToAscii;
		}

		return contra;
	}

	public boolean esFuerte() {
		int mayusculas = 0, minusculas = 0, numeros = 0;
		for (int i = 0; i < getContraseña().length(); i++) {
			// Comprobamos si cada letra del string está entre los valores enteros de ascii
			// que definen la letra como minucula o mayuscula
			if ((int) (getContraseña().charAt(i)) >= 65 && (int) (getContraseña().charAt(i)) <= 90) {
				mayusculas++;
			} else if ((int) (getContraseña().charAt(i)) >= 97 && (int) (getContraseña().charAt(i)) <= 122) {
				minusculas++;
			} else if ((int) (getContraseña().charAt(i)) >= 48 && (int) (getContraseña().charAt(i)) <= 57) {
				numeros++;
			}

		}
		System.out.println("mayus minus num: " + mayusculas + " " + minusculas + " " + numeros);
		if (mayusculas > 2 && minusculas > 1 && numeros > 5) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String mensaje = "Contraseña: " + this.contraseña + "\nLongitud: " + this.longitud + "\n";
		return mensaje;
	}

	/// Getters y setters ///

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

}
