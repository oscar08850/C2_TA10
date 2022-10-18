package ex5;


public class MainApp {

	public static void main(String[] args) {
		String contraseñas[] = new String[10];
		boolean seguras[] = new boolean[10];

		for (int i = 0; i < seguras.length; i++) {
			Password password = new Password(40);
			contraseñas[i] = password.getContraseña();
			seguras[i] = password.esFuerte();
		}

		for (int i = 0; i < seguras.length; i++) {
			System.out.println(contraseñas[i] + " " + seguras[i]);

		}

	}

}
