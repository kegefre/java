package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec {

	public static void main(String[] args) {

		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();

		entrada(a);

		if (a.validar()) {
			System.out.println(a.toString());
		} else {
			System.out.println("\nOs lados informados não formam um triângulo.\n");
		}

		entrada(b);

		if (b.validar()) {
			System.out.println(b.toString());
		} else {
			System.out.println("\nOs lados informados não formam um triângulo.\n");
		}
	}

	public static void entrada(Triangulo lado) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores dos lados: ");
		lado.x = sc.nextDouble();
		lado.y = sc.nextDouble();
		lado.z = sc.nextDouble();
	}

}
