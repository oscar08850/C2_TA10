package ex3;

import java.util.Random;

import Excepcion.ExcepcionesPersonalizadas;

public class NumeroConExcepcion {

	public NumeroConExcepcion() {

	}

	public void dameExcepcionParOImpar() {

		int num = dameRandom(0, 900);
		System.out.println("Generando número aleatorio...");
		System.out.println("El número aleatorio generado es: " + num);
		try {
			if (num % 2 == 0) {
				throw new ExcepcionesPersonalizadas(4);
			} else {
				throw new ExcepcionesPersonalizadas(5);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int dameRandom(int min, int max) { // Genera un numero random entre min y max

		Random random = new Random();
		int numero = 0;
		numero = random.nextInt(max - min + 1) + min;
		return numero;
	}

}
