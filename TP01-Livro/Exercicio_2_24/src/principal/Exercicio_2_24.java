package principal;

import java.util.Scanner;

public class Exercicio_2_24 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
		int maior= 0;
		int menor= 0;
		int [] num = new int [5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Adicione o numero inteiro: ");
			num[i] = teclado.nextInt();
			
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
		System.out.printf("Numero maior: %d\n", maior);
		System.out.printf("Numero menor: %d\n", menor);
		teclado.close();
	}
}