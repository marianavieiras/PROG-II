package principal;

import java.util.Scanner;

public class Exercicio_4_30 {
	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	        int num;
	        do {
	            System.out.print("Digite um numero: ");
	            num = teclado.nextInt();
	            if (num< 10000 || num > 99999) {
	                System.out.println("Digite novamente pois o numero adicionado não contém 5 digitos");
	            }
	        } while (num < 10000 || num > 99999);

	        int d1 = num / 10000; 
	        int d2 = (num / 1000) % 10;
	        int d4 = (num/ 10) % 10; 
	        int d5 = num % 10;

	        if ( (d1 == d5) && (d2 == d4)) {
	            System.out.println("O número é um palíndromo");
	        } else {
	            System.out.println("O número não é um palíndromo.");
	        }
	        
	        teclado.close();
	    }
	}



