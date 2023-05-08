package classes;

public abstract class Veiculos {
	
	protected String marca;
	protected String modelo;
	protected String placa;
	protected int ano;
	protected double combustivel;
	protected String tipoDeCombustivel;
	protected int capacidadeTanque;
	
	public Veiculos(String marca, String modelo, String placa, int ano, double combustivel, String tipoDeCombustivel) {

		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.combustivel = combustivel;
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public double getCapacidadeDoTanque() {
		return combustivel;
	}
	
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	
	public abstract double consumirCombustivel(double distancia, double combustivel);
	//public abstract double velocidadeMedia(double distancia, double tempo);
	//public abstract double frenagem();


}
