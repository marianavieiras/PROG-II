package principal;

import java.util.Scanner;

public class Exercicio_2_17 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		int [] num = new int[3];
		
		
		int maior= 0, menor= 0, media, soma = 0, prod = 1;
		for (int i = 0; i < 3; i++) {
			System.out.printf("Adicione o valor do numero na posição %d:", i+1);
			num[i] = teclado.nextInt();
			
			soma += num[i];
			prod *= num[i];
			if (i == 0) {
				maior = num[0];
			} else if (num[i] > num[i-1]) {
				maior = num[i];
			}
			if (i==0) {
				menor = num[0];
			} else if (num[i] < num[i-1]) {
				menor = num[i];
			}

		}
		
		media = soma / 3;
		
		System.out.printf("O maior numero é: %d \nO menor numero é: %d \nA soma entre eles é: %d \nA media dos valores é: %d \nO prudto é: %d", maior, menor, soma, media, prod);
		teclado.close();
	}
}
