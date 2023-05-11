package classes;

import java.util.Random;

public class Moto extends Veiculos {

	public static int capacidadeTanque = 10;
	
		public Moto(String marca, String modelo, String placa, int ano, String tipoDeCombustivel, int capacidadeTanque) {
			super(marca, modelo, placa, ano, tipoDeCombustivel, capacidadeTanque);
			
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
			valorAtualDoTanque = gerarValorAtualDoTanque.nextDouble() * 10 + 1;
			Math.round(valorAtualDoTanque);
			return valorAtualDoTanque;
		}
		
		@Override
		public String avisaAutonomia(double qtdCombustivelAtual, double consumoPorKilometro) {
				double Kmdisponivel = qtdCombustivelAtual * consumoPorKilometro;
				
					if (Kmdisponivel > 10) {
						return "\nSua moto aguenta mais 10km";
					}
					
					else {
						return "Sua moto tem menos de 10km até a gasolina acabar";
					}
		}
		
		@Override
		public double velocidadeMedia(double distancia, double tempo) {
				
			 return (distancia / tempo);
		}

		@Override
		public String imprimeDadosVeiculo() {
			return " " + getMarca() + " " + getModelo();
		
		
		}
}