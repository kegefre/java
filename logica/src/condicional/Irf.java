package condicional;

import java.util.Scanner;

public class Irf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double rendaBruta, desconto, valorDesconto;
		String mensagem;
		
		System.out.println("Informe a renda bruta: ");
		rendaBruta = sc.nextDouble();
		
		if(rendaBruta <= 1903.98) {
			desconto = 0;
		}else if(rendaBruta <= 2826.65){
			desconto = 0.075;
		}else if(rendaBruta <= 3751.06){
			desconto = 0.15;
		}else if(rendaBruta <= 4664.68){
			desconto = 0.225;
		}else {
			desconto = 0.275;
		}
		
		valorDesconto = rendaBruta*desconto;
		
		mensagem = desconto!=0?"O valor do desconto do Imposto de Renda é R$%.2f":"Você está isento do imposto.";
		System.out.printf(mensagem,valorDesconto);
		System.out.println("\nCálculo encerrado.");
		sc.close();

	}

}
