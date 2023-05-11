package classes;

import java.util.Random;

public class Carro extends Veiculos{
	
	public static int capacidadeTanque = 55;
	private double quantidadeDeCombustivel;
	private double tempoPercurso;
	private double ConsumoPorKm;
	private double velocidadeMedia;
	
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
	
    public double getQuantidadeDeCombustivel() {
		return quantidadeDeCombustivel;
	}
    
    public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
		this.quantidadeDeCombustivel = quantidadeDeCombustivel;
	}
	
    public double getTempoPercurso() {
		return tempoPercurso;
	}
 
    public void setTempoPercurso(double tempoPercurso) {
		this.tempoPercurso = tempoPercurso;
	}
    
    public double getConsumoPorKm() {
		return ConsumoPorKm;
	}
    
    public void setConsumoPorKm(double consumoPorKm) {
		ConsumoPorKm = consumoPorKm;
	}
    
    public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
    
    public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
    
    
	@Override
	public void consumirCombustivel(double distancia, double combustivel) {
		
		 double potencialCombustivelGasolina = 1.30;
		 double resultado;
		 if (super.getTipoDeCombustivel().equalsIgnoreCase("gasolina")) {
			
			resultado = distancia / (combustivel * potencialCombustivelGasolina);
			setConsumoPorKm(resultado);
		}
		 
		 else {
			 
			resultado =  distancia / combustivel;
			setConsumoPorKm(resultado);
		}
	}
	

	
	@Override
	public void geraCombustivel() {
		
		double valorAtualDoTanque = 0;	
		Random gerarValorAtualDoTanque = new Random();
		valorAtualDoTanque = gerarValorAtualDoTanque.nextDouble() * 54 + 1;
		Math.round(valorAtualDoTanque);
		setQuantidadeDeCombustivel(valorAtualDoTanque);
		 
	}
	
	@Override
	public boolean avisaAutonomia(double qtdCombustivelAtual, double consumoPorKilometro) {
			double Kmdisponivel = qtdCombustivelAtual * consumoPorKilometro;
			
				if (Kmdisponivel > 10) {
					return true;
				}
				
				else {
					return false;
				}
	}


	@Override
	public void velocidadeMedia(double distancia, double tempo) {
			double resultado;
			resultado = distancia / tempo;
			setVelocidadeMedia(resultado);
			
	}

	@Override
	public String imprimeDadosVeiculo() {
		return " " + getMarca() + " " + getModelo();
	}
	
	@Override
	public void gerarTempoAleatorio() {
		double tempo = 0;
		double tempoValido = 0;
		Random gerarTempoRandomico = new Random();

		tempo = gerarTempoRandomico.nextDouble();
		tempoValido = tempo / 60;			
		Math.round(tempoValido);
		setTempoPercurso(tempoValido);
		 
	}
	
}
   
	
	
	
