package condicional;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String disciplina, resultado;
		int qtdAulas, faltas;
		double n1, n2, n3, n4, media;
		
		System.out.println("Informe o nome da disciplina: ");
		disciplina = sc.next();
		System.out.println("Informe a quantidade de aulas dadas: ");
		qtdAulas = sc.nextInt();
		System.out.println("Informe a quantidade de faltas: ");
		faltas = sc.nextInt();
		System.out.println("Informe a 1? nota: ");
		n1 = sc.nextDouble();
		System.out.println("Informe a 2? nota: ");
		n2 = sc.nextDouble();
		System.out.println("Informe a 3? nota: ");
		n3 = sc.nextDouble();
		System.out.println("Informe a 4? nota: ");
		n4 = sc.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		if(media>=6.0 && faltas/qtdAulas<=0.25) {
			resultado = "aprovado";
		}else {
			resultado = "reprovado";
		}
		
		System.out.printf("A m?dia em %s foi %.1f, e possui %d faltas.",disciplina, media, faltas);
		System.out.printf("\nCom os valores acima o aluno est? %s em %s.", resultado, disciplina);
		System.out.println("\n Programa encerrado.");
		sc.close();
	}

}
