package ex2;

import Excepcion.ExcepcionesPersonalizadas;

public class Excepciones {

	public void dameExcepcion() {

		for (int i = 1; i <= 3; i++) {
			try {
				throw new ExcepcionesPersonalizadas(i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
