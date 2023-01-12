package repeticao;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares 
		
		int numeros = 0, pares=0, impares=0, i;
		
		Scanner entrada = new Scanner(System.in);
		
		for(i=0; i<10; i++) {
			System.out.println("Por favor, digite um número, ");
			numeros = entrada.nextInt();  
			
			if(numeros % 2 ==0) {
				pares++;				
			}
			
			else if(numeros %2 !=0) {
				impares++;
			}			
						
		}
		
		System.out.println("O total de números pares é: " + pares);
		System.out.println("O total de números ímpares é: "+ impares);
	}
	

}
