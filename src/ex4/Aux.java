package ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aux {

	public void pruebaCalculadora() {
		while (true) {
			// En este caso usaremos valores INT para ver la excepción al dividir entre 0 ya que entre doubles da INFINITY
			
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("Introduce el primer número: ");
				int x = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				int y = sc.nextInt();

				calculadoraClass calculadoraClass = new calculadoraClass(x, y);

				// Salida de datos con los métodos
				System.out.println("La suma de los números es: " + calculadoraClass.suma());
				System.out.println("La resta de los números es: " + calculadoraClass.resta());
				System.out.println("La multiplicacion de los números es: " + calculadoraClass.multiplicacion());
				try {
					System.out.println("La division de los números es: " + calculadoraClass.division());
				} catch (ArithmeticException e) {
					System.out.println("ArithmeticException: No se puede dividir entre 0");
				}
				System.out.println("La potencia del primer número es: " + calculadoraClass.potencia());
				System.out.println("La raiz cuadrada del primer número es: " + calculadoraClass.raizCuadrada());
				System.out.println("La raiz cúbica del primer número es: " + calculadoraClass.raizCubica() + "\n");

			} catch (InputMismatchException e) { // Se introduce algo que no es un número
				System.out.println("Error en el imput. InputMismatchException");
			} 

		}

	}

}
