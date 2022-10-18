package ex1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JuegoNumero {

	// Variables //

	private int numIntentos;
	private int numSecreto;
	private int numMin;
	private int numMax;

	public JuegoNumero() {
		this.numIntentos = 0;
		this.numSecreto = dameRandom(0, 500);
		this.numMin = 0;
		this.numMax = 500;
	}

	// Devuelve un numero random entre min y max incluidos.
	private static int dameRandom(int min, int max) {
		Random random = new Random();
		int numero = random.nextInt(max - min + 1) + min;
		return numero;
	}

	public void juego() {
		System.out.println("He pensado un número entre el 1 y el 500");
		Scanner scanner = new Scanner(System.in);
		boolean seguir = true;

		while (seguir) { // loop hasta que se acierte el número.
			System.out.print("Que número crees que es? ");
			try { //Comprobamos si el input es valido. 
				int numeroUsuario = scanner.nextInt();
				numIntentos++;
				if (numeroUsuario>500 | numeroUsuario<0) { //Lo contaremos como un intento si el valor esta fuera del rango [0,500]
					System.out.println("Número fuera de los valores previstos");
					System.out.println("Pista: [" + numMin + "," + numMax + "]"); // Muestro el progreso al usuario.
				}
				else if (numeroUsuario < numSecreto) {
					System.out.println("El número que buscas es más grande.");
					if (numeroUsuario > numMin) {
						numMin = numeroUsuario; // Defino el numero más pequeño valido que ha introducido el usuario.
						System.out.println("Pista: [" + numMin + "," + numMax + "]"); // Muestro el progreso al usuario.
					}
				} else if (numeroUsuario > numSecreto) {
					System.out.println("El número que buscas es más pequeño.");
					if (numeroUsuario < numMax) {
						numMax = numeroUsuario; // Defino el numero más grande valido que ha introducido el usuario.
						System.out.println("Pista: [" + numMin + "," + numMax + "]"); // Muestro el progreso al usuario.
					}
				} else {
					System.out.println("Enhorabuena! has acertado el número secreto: " + numSecreto
							+ ". Y para ello has necesitado un total de: " + numIntentos + " intentos.");
					seguir = !seguir;
				}

			} catch (InputMismatchException e) {
				numIntentos++;
				scanner.nextLine(); //Necesario para dejar atrás el input introducido mal.
				System.out.println("\nNo se ha introducido un número");
			}

		}
	}
}
