package repeticao;

import java.util.Scanner;

public class SalarioAtual {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double percentual, salario;
			int contador, ano, anoInicial;

			System.out.println("Digite o ano atual:");
			ano = sc.nextInt();

			System.out.println("Digite o ano inicial:");
			anoInicial = sc.nextInt();

			System.out.printf("Digite o salario em %d.: \n", anoInicial);
			salario = sc.nextInt();

			int totalAnos = ano - anoInicial;
			for (contador = 0; contador <= totalAnos; contador++) {

				System.out.printf("Digite o percentual de aumento para %d:\n", anoInicial + contador);
				percentual = sc.nextInt();
				salario *= (1 + percentual / 100);

			}

			System.out.printf("\nO sal?rio atual ? de R$%.2f", salario);

			sc.close();
		}
	}

}
