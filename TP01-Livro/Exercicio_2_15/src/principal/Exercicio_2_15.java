package principal;
import java.util.Scanner;

public class Exercicio_2_15 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Adicione um inteiro: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Adicione o segundo numero inteiro: ");
		int num2 = teclado.nextInt();
		float div = (float)num1/num2;
		int soma = num1 + num2;
		int dif;
		if(num1 >= num2) { 
		 dif = num1 - num2;
		} else {
			dif = num2 - num1;
		}
		System.out.printf("A soma dos produtos inteiros são: %d\n", soma);
		System.out.printf("A diferença entre os produtos é de: %d\n", dif);
		System.out.printf("A divisão entre eles resulta em: %.2f\n", div);
		
		teclado.close();
		
	}

}
