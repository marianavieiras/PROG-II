package principal;

import java.util.Scanner;

public class Exercicio_4_29 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Adicione o tamanho (1 a 20): ");
        int tam = teclado.nextInt();

        if (tam >= 1 && tam <= 20) {
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j <= tam; j++) {
                    if (i == 0 || i == tam - 1|| j == 0 || j == tam - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamanho adicionado está incorreto!");
        }
    teclado.close();
	}
}
