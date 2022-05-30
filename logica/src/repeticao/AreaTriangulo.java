package repeticao;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area, base, altura;
		
		System.out.println("Digite a medida da base do tri�ngulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a medida da altura do tri�ngulo: ");
		altura = sc.nextDouble();
		
		while(base <= 0) {
			System.out.println("Digite uma medida da base do tri�ngulo v�lida(>0): ");
			base = sc.nextDouble();
		}
		while(altura <= 0) {
			System.out.println("Digite uma medida da altura do tri�ngulo v�lida(>0): ");
			altura = sc.nextDouble();
		}
		
		area = base*altura/2;
		System.out.printf("A �rea do tri�ngulo � %.2f.\n", area);
		sc.close();

	}

}
