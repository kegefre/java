package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int opcao;
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Infomre o 1� valor: ");
		num1 = sc.nextDouble();
		System.out.println("Infomre o 2� valor: ");
		num2 = sc.nextDouble();
		
		System.out.println("\n\nCalculadora\n");
		System.out.println("\n1. Soma \n2. Subtra��o"+
		"\n3. Multiplica��o \n4. Divis�o");
		System.out.println("\nEscolha uma op��o: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
			break;
		case 2:
			System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
			break;
		case 3:
			System.out.printf("%f X %f = %f", num1, num2, num1 * num2);
			break;
		case 4:
			System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
			break;
		default :
			System.out.println("Op��o inv�lida.");
		}
			
		sc.close();
	}

}
