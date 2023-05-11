package Main;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import classes.Carro;
import classes.Moto;
import classes.Veiculos;

import java.lang.Math;


public class Programa {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
			
		//Variaveis para inputs
		String marca, modelo, placa, tipoDeCombustivel;
		int ano;
		int escolhaVeiculo;
		
		System.out.println("1 para carro ---- 2 para moto");
		escolhaVeiculo = input.nextInt();
		switch(escolhaVeiculo) {
		case 1:
			System.out.println("----CARRO----");
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
			
			
			System.out.printf("\n------O valor do combustivel atual do carro é %.2f\n------" , qtdCombustivelAtual); 			
		
			System.out.println("\nInsira um valor de distancia percorrida por KM:");
			double distanciaPercorrida = input.nextDouble();
			double consumoPorKilometro = carro1.consumirCombustivel(distanciaPercorrida, qtdCombustivelAtual);
			System.out.printf("O consumo de combustivel por quilometro é de : %.2f\n" , consumoPorKilometro);
			
			System.out.println(carro1.avisaAutonomia(qtdCombustivelAtual, consumoPorKilometro));
			
				// gerar tempo aleatório para calculo de velocidade media.
					double tempo = 0;
					double tempoValido = 0;
					Random gerarTempoRandomico = new Random();
			
					tempo = gerarTempoRandomico.nextDouble();
					tempoValido = tempo / 60;			
					Math.round(tempoValido);
					System.out.printf("Tempo da viagem foi de %.2f hora\n " , tempoValido);
					
					
					double velocidade = carro1.velocidadeMedia(distanciaPercorrida, tempoValido);
					
				System.out.printf("Velocidade: %.2f\n", velocidade);
				System.out.println(carro1.imprimeDadosVeiculo());
			break;
		case 2:
				System.out.println("----CARRO----");
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
				
					Moto moto1 = new Moto(marca, modelo, placa, ano, tipoDeCombustivel, ano);
					double qtdCombustivelAtualMoto = moto1.geraCombustivel();
					System.out.printf("\n------O valor do combustivel atual do carro é %.2f\n------" , qtdCombustivelAtualMoto); 			
					
					System.out.println("\nInsira um valor de distancia percorrida por KM:");
					double distanciaMotoPercorrida = input.nextDouble();
					double consumoMotoPorKM = moto1.consumirCombustivel(distanciaMotoPercorrida, qtdCombustivelAtualMoto);
					System.out.printf("O consumo de combustivel por quilometro é de : %.2f\n" , consumoMotoPorKM);
					
					System.out.println(moto1.avisaAutonomia(qtdCombustivelAtualMoto, consumoMotoPorKM));
					
					double tempoMoto = 0;
					double tempoValidoMoto = 0;
					Random gerarTempoRandomicoMoto = new Random();
			
					tempoMoto = gerarTempoRandomicoMoto.nextDouble();
					tempoValidoMoto = tempoMoto / 60;			
					Math.round(tempoValidoMoto);
					System.out.printf("Tempo da viagem foi de %.2f hora\n " , tempoValidoMoto);
					
					double velocidadeMoto = moto1.velocidadeMedia(distanciaMotoPercorrida, tempoValidoMoto);
					
					System.out.printf("Velocidade: %.2f\n", velocidadeMoto);
					System.out.println(moto1.imprimeDadosVeiculo());
					
			break;
		}
		
		
		}

}
