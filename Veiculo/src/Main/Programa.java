package Main;
import java.util.Locale;
import java.util.Scanner;

import classes.Carro;

public class Programa {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		
		
		//Variaveis para criação de um veiculo
		String marca, modelo, placa, tipoDeCombustivel;
		int ano;
		double combustivel;
		
		System.out.println("----VEICULOS----");
		System.out.println("Qual a marca?");
		marca = input.next();
		System.out.println("Modelo?");
		modelo = input.next();
		System.out.println("Placa do veiculo");
		placa = input.next();
		System.out.println("Qual o ano do veiculo?");
		ano = input.nextInt();
		System.out.println("Qual a capacidade colocada no combustivel?");
		combustivel = input.nextDouble();
		System.out.println("Tipo de combustivel");
		tipoDeCombustivel = input.next();
		
		//variaveis para o carro
		double distanciaPercorrida;
		double quantidadeDeCombustivel;
		System.out.println("Para calcular o consumo de combustivel\n");
		System.out.println("Insira a distancia percoridda");
		distanciaPercorrida = input.nextDouble();
		System.out.println("Quantidade de combustivel usado?");
		quantidadeDeCombustivel = input.nextDouble();
		
		Carro carro1 = new Carro(marca, modelo, placa, ano, combustivel, tipoDeCombustivel, distanciaPercorrida, quantidadeDeCombustivel);
		
		
		System.out.println(carro1.consumirCombustivel(distanciaPercorrida, quantidadeDeCombustivel));
		
	}

}
