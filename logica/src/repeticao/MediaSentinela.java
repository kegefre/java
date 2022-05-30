package repeticao;

import java.util.Scanner;

public class MediaSentinela {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		int contador = 0;
		
		System.out.println("Digite uma notra ou -1 para sair:");
		double nota = sc.nextDouble();
		
		while(nota!= -1) {
			total+= nota;
			contador++;
			
			System.out.println("Digite uma notra ou -1 para sair:");
			nota = sc.nextDouble();
		}

		if(contador!=0) {
			double media = total/contador;
		
			System.out.printf("\nTotal de alunos da classe %d\n", contador);
			System.out.printf("O total de notas dos alunos: %.1f\n", total);
			System.out.printf("A m�dia da classe: %.1f", media);
		}else System.out.println("\nSem notas cadastradas.");
		
		sc.close();
	}

}
