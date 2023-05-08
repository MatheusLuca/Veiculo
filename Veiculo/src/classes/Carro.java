package classes;

public class Carro extends Veiculos{
	
	private double distanciaPercorrida;
	private double velocidade;
	
	public Carro(String marca, String modelo, String placa, int ano, double combustivel,String tipoDeCombustivel, double distanciaPercorrida, double velocidade) {
		
		super(marca, modelo, placa, ano, combustivel, tipoDeCombustivel);
		this.distanciaPercorrida = distanciaPercorrida;


	}
	
	
	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	
	
	@Override
	public void setCapacidadeTanque(int capacidadeTanque) {
		super.setCapacidadeTanque(55);
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
	
	


	
	
}