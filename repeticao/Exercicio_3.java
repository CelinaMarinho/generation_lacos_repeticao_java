package repeticao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */
		
		int idade = 0, menor21 = 0, maior50 = 0;
		Scanner entrada = new Scanner (System.in);
		
	
		
		while (idade != -99) { //enquanto a idade for menor que -99, execute
			System.out.println("Por favor, digite sua idade");  //peça a entrada da idade
			idade = entrada.nextInt();                          //armazene na var idade 
			
			if(idade < 21 && idade > 0) {
				menor21++;				
			}
			
			else if (idade > 50) {
				maior50++;
			}
			
			System.out.println("Digite -99 para encerrar o programa");
		}
		
		System.out.println("O total de pessoas com idade abaixo de 21 anos é: " + menor21);
		System.out.println("O total de pessoas com idade acima de 50 anos é: "+ maior50);
		
		
		

	}

}
