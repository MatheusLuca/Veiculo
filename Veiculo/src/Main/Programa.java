package Main;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import classes.Carro;
import java.lang.Math;


public class Programa {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
			
		//Variaveis para inputs
		String marca, modelo, placa, tipoDeCombustivel;
		int ano, capacidadeTanque;
		double combustivelVeiculo;
		
		//inputs do usuario
		System.out.println("----VEICULOS----");
		System.out.println("Qual a marca?");
		marca = input.next();
		System.out.println("Modelo?");
		modelo = input.next();
		System.out.println("Placa do veiculo");
		placa = input.next();
		System.out.println("Qual o ano do veiculo?");
		ano = input.nextInt();
		System.out.println("Tipo de combustivel");
		tipoDeCombustivel = input.next();
			
		Carro carro1 = new Carro(marca,  modelo,  placa,  ano,  tipoDeCombustivel);
		double qtdCombustivelAtual = carro1.geraCombustivel();
		System.out.printf("\nO valor do combustivel atual do carro é %.2f\n" , qtdCombustivelAtual); 			
	
		System.out.println("\nInsira um valor de distancia percorrida por KM:");
		double distanciaPercorrida = input.nextDouble();
		double consumoPorKilometro = carro1.consumirCombustivel(distanciaPercorrida, qtdCombustivelAtual);
		System.out.println("\nSeu carro fez " + consumoPorKilometro + " km" +" litro");
		
		System.out.println("Voce ainda tem km" + carro1.avisaAutonomia(qtdCombustivelAtual, consumoPorKilometro));
		
			// gerar tempo aleatório para calculo de velocidade media.
			
			
			
			double tempo = 0;
			double tempoValido = 0;
			Random gerarTempoRandomico = new Random();
			
					tempo = gerarTempoRandomico.nextDouble();
					tempoValido = tempo / 60;			
					Math.round(tempoValido);
					
					
					
			System.out.println("Velocidade média em km/h: " + carro1.velocidadeMedia(distanciaPercorrida, tempo));
			
			
			
		
		
	

		}

}
