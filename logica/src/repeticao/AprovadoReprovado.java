package repeticao;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double total = 0;
			int contador, aprovados = 0, reprovados = 0;
						
			for(contador = 0; contador <= 9; contador++) {
				System.out.printf("\nDigite a %dª nota: ",contador+1);
				double nota = sc.nextDouble();
				if(nota >=6) {
					aprovados++;
				}else {
					reprovados++;
				}
				total+=nota;
			}

			double media = total/contador;
				
			System.out.printf("\nTotal de alunos aprovados %d\n", aprovados);
			System.out.printf("\nTotal de alunos reprovados %d\n", reprovados);
			System.out.printf("\nA média da classe: %.1f", media);
				
			sc.close();
		}
	}

}
