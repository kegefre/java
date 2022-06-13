package geometria;

public class Triangulo {
	// Atributos
	public double x;
	public double y;
	public double z;

	// Métodos
	public boolean validar() {
		if (Math.abs(x - y) < z && z < (x + y))
			return true;
		else
			return false;
	}

	public String classificar() {
		String tipo;
		if (x == y && y == z) {
			tipo = "equilátero";

		} else if (x == y || y == z || z == x) {

			tipo = "isóceles";
		} else {
			tipo = "escaleno";
		}
		return tipo;
	}

	public double perimetro() {

		return x + y + z;
	}

	public double area() {
		double semi = perimetro()/2;
		return Math.sqrt(semi*(semi-x)*(semi-y)*(semi-z));
	}
	
	public String toString() {
		return "\nOs lados "+x+", "+y+" e "+z+" formam um triângulo "+classificar()+"."
				+"\nO perímetro do triângulo é "+String.format("%.2f",perimetro())+"."
				+"\nA área desse triângulo é "+String.format("%.2f",area())+".";
	}
}
