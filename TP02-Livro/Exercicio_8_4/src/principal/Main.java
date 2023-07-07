package principal;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		Rectangle r1 = new Rectangle ();
		Rectangle r2 = new Rectangle ();
		
		r1.setLength(4.52);
		r1.setWidth(9.67);
		
		System.out.println("Area: " +r1.calcularArea());
		System.out.println("Perimetro: " + r1.calcularPerimetro());
		
		System.out.println("__________________________________________");
		System.out.println("Adicione o valor para largura: ");
		double lar = teclado.nextDouble();
		System.out.println("Adicione o valor para comprimento: ");
		double comp = teclado.nextDouble();
		r2.setLength(comp);
		r2.setWidth(lar);
		
		System.out.println("Area: " +r2.calcularArea());
		System.out.println("Perimetro: " + r2.calcularPerimetro());
		
		teclado.close();
	}
}
