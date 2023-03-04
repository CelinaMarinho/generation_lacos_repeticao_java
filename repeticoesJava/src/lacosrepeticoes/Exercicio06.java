package lacosrepeticoes;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, 
		 até que o número zero seja digitado. 
		 Ao final, mostre na tela a média de todos os números digitados, 
		 que sejam múltiplos de 3*/
		
		int numero=0, contador=0, soma=0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			 System.out.println("\nPor favor, digite um número inteiro ou zero para encerrar o programa: ");
	          numero = entrada.nextInt();
	          if(numero % 3 == 0 && numero !=0) {
	        	  contador++;
	        	  soma+=numero;	        	  
	          }	          
	           
		} while (numero != 0);
		
		if(contador >0) {
			int media = soma/contador;
			System.out.println("A média dos números múltiplos de 3 é: " + media);
			
		}

	}

}
