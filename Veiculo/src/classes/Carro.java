package classes;

import java.util.Random;

public class Carro extends Veiculos{
	
	public static int capacidadeTanque = 55;
	
	public Carro(String marca, String modelo, String placa, int ano, String tipoDeCombustivel ){
		
		super(marca, modelo, placa, ano, tipoDeCombustivel, capacidadeTanque);
		
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return super.getMarca();
	}
	
	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return super.getModelo();
	}
	
	@Override
	public String getPlaca() {
		// TODO Auto-generated method stub
		return super.getPlaca();
	}
	
	@Override
	public String getTipoDeCombustivel() {
		// TODO Auto-generated method stub
		return super.getTipoDeCombustivel();
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
					return "\nSeu carro aguenta mais 10km";
				}
				
				else {
					return "Seu carro tem menos de 10km até a gasolina acabar";
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
   
	
	
	
