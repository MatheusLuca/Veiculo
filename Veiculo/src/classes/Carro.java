package classes;

public class Carro extends Veiculos {
	
	private double distanciaPercorrida;
	private double velocidade;
	public Carro(String marca, String modelo, String placa, int ano, double combustivel,
				 String tipoDeCombustivel, double distanciaPercorrida, double velocidade) {
		
		super(marca, modelo, placa, ano, combustivel, tipoDeCombustivel);
		this.distanciaPercorrida = distanciaPercorrida;
	}
	
	
	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	
	
	@Override
	public double consumirCombustivel(double distancia, double combustivel) {
		
	return distancia / combustivel;	

	}

	@Override
	public double velocidadeMedia() {
		
		return 0;
	}

	@Override
	public double frenagem() {
		
		return 0;
	}
	
	
}