package condicional;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int diaNum;
		String dia;
		
		System.out.println("Informe o número do dia da semana: ");
		diaNum = sc.nextInt();
		
		switch(diaNum) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
			default:
				dia = "inválido";
		}
		
		System.out.printf("O dia da semana é %s.", dia);
		System.out.println("\nPrograma encerrado.");
		
		sc.close();

	}

}
