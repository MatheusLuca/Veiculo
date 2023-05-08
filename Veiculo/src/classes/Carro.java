package classes;

public class Carro extends Veiculos{
	
	private double distanciaPercorrida;
	private double velocidade;
	
	public Carro(String marca, String modelo, String placa, int ano, double combustivel,String tipoDeCombustivel, double distanciaPercorrida, double velocidade, int capacidadeTanque) {
		
		super(marca, modelo, placa, ano, combustivel, tipoDeCombustivel, capacidadeTanque);
		this.distanciaPercorrida = distanciaPercorrida;
	    
	}
	
	
	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
		
	@Override
	public int getCapacidadeTanque() {

		return super.getCapacidadeTanque();
	}
	
	
	@Override
	public double consumirCombustivel(double distancia, double combustivel) {
		
		 double potencialCombustivelGasolina = 1.30;
		 
		 if (super.getTipoDeCombustivel().equalsIgnoreCase("gasolina")) {
			return distancia / (combustivel * potencialCombustivelGasolina);
		}
		 
		 else {
			return distancia / combustivel;
		}
	}
	
	
	@Override
	public double velocidadeMedia(double distancia, double tempo) {
			
		return distancia / tempo;
		
	}
	
	


	
	
}