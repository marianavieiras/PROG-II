package principal;
import java.util.Scanner;

public class Exercicio_2_34 {
	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);

	        System.out.print("Informe a população mundial atual: ");
	        int popAtual = teclado.nextInt();

	        System.out.print("Informe a taxa de crescimento demográfico anual: ");
	        double taxaCresc = teclado.nextDouble();

	        System.out.print("Informe o número de anos para estimar: ");
	        int numAnos = teclado.nextInt();

	        double taxa= taxaCresc / 100; 

	        for (int i = 1; i <= numAnos; i++) {
	            popAtual += popAtual * taxa;
	            System.out.println("População mundial estimada: " + popAtual);
	        }

	        teclado.close();
	 }
}
