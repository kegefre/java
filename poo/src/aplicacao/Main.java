package aplicacao;

import java.util.Scanner;

import entidades.Veiculo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pass;
		double tanque, rendimento, km, valor;
		
		System.out.println("\nQtde de passageiros: ");
		pass = sc.nextInt();
		System.out.println("Capacidade do tanque: ");
		tanque = sc.nextDouble();
		System.out.println("Rendimento por litro: ");
		rendimento = sc.nextDouble();
		System.out.println("Distância em Km: ");
		km = sc.nextDouble();
		System.out.println("Valor do combustível: ");
		valor = sc.nextDouble();
		
		Veiculo gurgel = new Veiculo(pass, tanque, rendimento);
		
		System.out.println(gurgel.toString());
		
		double tanques = gurgel.tanqueViagem(km);
		double rateio = gurgel.dividirDespesas(km, valor);
		
		System.out.printf("Para a viagem vamos precisar de %.1f tanques(s) e cada passageito contribuirá com R$%.2f.\n", tanques, rateio);
		sc.close();
	}

}
