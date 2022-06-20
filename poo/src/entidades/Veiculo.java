package entidades;

public class Veiculo {
	private int passageiros;
	private double capacidade;
	private double rendimento;

	public Veiculo() {
		
	}
	
	public Veiculo(int p, double ca, double co) {
		passageiros = p;
		capacidade = ca;
		rendimento = co;
	}

	public double tanqueViagem(double quilometro) {
		return quilometro/(rendimento*capacidade);
	}
	
	public double dividirDespesas(double combustivel, double quilometro) {
		return (quilometro/capacidade*combustivel)/passageiros;
	}
	
	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public String toString() {
		return "\nO veículo comporta "+passageiros
				+" passageiros, tem uma capacidade de "
				+capacidade+" litros de combustível e faz "
				+rendimento+" quilometros por litro.";
	}

}
