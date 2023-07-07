package principal;

import java.util.Scanner;

public class Test {
	public static void main (String [] args) {
	       Scanner teclado = new Scanner(System.in);
	       
	        System.out.print("Digite o nome: ");
	        String nome = teclado.nextLine();
	        System.out.print("Digite o sobrenome: ");
	        String sobrenome = teclado.nextLine();
	        System.out.print("Digite o sexo: ");
	        String sexo = teclado.nextLine();
	        
	        System.out.print("Ano de Nascimento: ");
	        int ano = teclado.nextInt();
	        System.out.print("Mês de Nascimento: ");
	        int mes = teclado.nextInt();
	        System.out.print("Dia de Nascimento: ");
	        int dia= teclado.nextInt();
	        
	        System.out.print("Digite a Altura: ");
	        double altura= teclado.nextInt();
	        System.out.print("Digite o Peso: ");
	        double peso= teclado.nextInt();
	       

	        HealtProfile p1 = new HealtProfile (nome, sobrenome, sexo, dia, mes, ano, altura, peso);

	        System.out.println("Nome: " + p1.getNome() + " " + p1.getSobrenome());
	        System.out.println("Data de Nascimento: " + p1.getDia() + "/" + p1.getMes() + "/" + p1.getAno());
	     
	        
	        System.out.println("Idade: " + p1.calcularIdade());
	        System.out.println("Frequencia Cardíaca Máxima: " + p1.calcularFrequenciaCardiacaMaxima());
	        System.out.println("Frequência Cardíaca Alvo: " + p1.calcularFrequenciaCardiacaAlvo());
	        System.out.println("IMC: " + p1.calcularIMC());
	        
	        teclado.close();
	        
	}
}
