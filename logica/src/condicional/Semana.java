package condicional;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int diaNum;
		String dia;
		
		System.out.println("Informe o n�mero do dia da semana: ");
		diaNum = sc.nextInt();
		
		switch(diaNum) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
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
			dia = "S�bado";
			break;
			default:
				dia = "inv�lido";
		}
		
		System.out.printf("O dia da semana � %s.", dia);
		System.out.println("\nPrograma encerrado.");
		
		sc.close();

	}

}
