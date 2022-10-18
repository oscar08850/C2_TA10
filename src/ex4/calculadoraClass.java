package ex4;

public class calculadoraClass {

	/// Atributos ///
	private int x;
	private int y;

	/// Constructor ///
	public calculadoraClass() { // Defecto
	}

	public calculadoraClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	/// Métodos ///
	
	// Devuelve la suma de x,y
	public double suma() {
		return x + y;
	}

	// Devuelve la resta de x,y
	public double resta() {
		return x - y;
	}

	// Devuelve la multiplicación de x,y
	public double multiplicacion() {
		return x * y;
	}

	// Devuelve la división de x,y
	public double division() {
		return x / y;
	}

	// Devuelve la potencia de x a la y
	public double potencia() {
		return Math.pow(x, y);
	}

	// Devuelve la raiz cuadrada de x
	public double raizCuadrada() {
		return Math.sqrt(x);
	}

	// Devuelve la raiz cúbica de x
	public double raizCubica() {
		return Math.cbrt(y);
	}
}