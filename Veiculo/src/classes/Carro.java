package classes;

import java.util.Random;

public class Carro extends Veiculos{
	
	private double distanciaPercorrida;
	private double velocidade;
	public static int capacidadeTanque = 55;
	
	public Carro(String marca, String modelo, String placa, int ano, String tipoDeCombustivel ){
		super(marca, modelo, placa, ano, tipoDeCombustivel, capacidadeTanque);
		
		
		

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
	public  double geraCombustivel() {
		
		double valorAtualDoTanque = 0;	
		Random gerarValorAtualDoTanque = new Random();
		valorAtualDoTanque = gerarValorAtualDoTanque.nextDouble() * 54 + 1;
		Math.round(valorAtualDoTanque);
		return valorAtualDoTanque;
	}
	
	@Override
	public String avisaAutonomia(double qtdCombustivelAtual, double consumoPorKilometro) {
			double Kmdisponivel = qtdCombustivelAtual * consumoPorKilometro;
			
				if (Kmdisponivel > 10) {
					return "Seu carro aguenta mais 10km";
				}
				
				else {
					return "Precisa abastecer";
				}
	}


	@Override
	public double velocidadeMedia(double distancia, double tempo) {
		// TODO Auto-generated method stub
		return 0;
	}

	

		
		
	}
	
	
	
