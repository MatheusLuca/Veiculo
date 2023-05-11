package Main;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import classes.Carro;
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
			carro1.geraCombustivel();
			System.out.printf("\n------O valor do combustivel atual do carro é %.2f\n------" ,carro1.getQuantidadeDeCombustivel()); 					
			System.out.println("\nInsira um valor de distancia percorrida por KM:");
			double distanciaPercorrida = input.nextDouble();
			
			carro1.consumirCombustivel(distanciaPercorrida, carro1.getQuantidadeDeCombustivel());
			System.out.printf("O consumo por km é de %.2f: \n" , carro1.getConsumoPorKm());
			
			
			carro1.gerarTempoAleatorio();
			System.out.printf("o valor do tempo: %.2f \n", carro1.getTempoPercurso());

			
			
			carro1.avisaAutonomia(carro1.getQuantidadeDeCombustivel(), carro1.getConsumoPorKm());
			
			if(carro1.avisaAutonomia(carro1.getQuantidadeDeCombustivel(), carro1.getConsumoPorKm()) == true) {
				
				System.out.println("\nSeu carro tem autonomia para mais de 10km");
			}
			
			else {
				System.out.println("\nSeu carro tem autonomia para menos de 10km");
			}
			
			carro1.velocidadeMedia(distanciaPercorrida, carro1.getTempoPercurso());
			System.out.printf("Velocidade media é de: %.2f", carro1.getVelocidadeMedia());
			
		break;
		case 2:
				/*System.out.println("----CARRO----");
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
					
					
					
					double velocidadeMoto = moto1.velocidadeMedia(distanciaMotoPercorrida, tempoValidoMoto);
					
					System.out.printf("Velocidade: %.2f\n", velocidadeMoto);
					System.out.println(moto1.imprimeDadosVeiculo());
					
			break;*/
		}
		
		
		}

}
