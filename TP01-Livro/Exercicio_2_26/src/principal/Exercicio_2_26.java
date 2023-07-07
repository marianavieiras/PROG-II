package principal;

import java.util.Scanner;

public class Exercicio_2_26 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = teclado.nextInt();

		if (num1 % num2 == 0) {
		System.out.println(num1 + " é um múltiplo de " + num2);
		} else {
		System.out.println(num1 + " não é um múltiplo de " + num2);
		}

		teclado.close();
	}	
}

