package principal;

public class Exercicio_4_39 {
	 public static void main (String [] args) {
		 
	long populacao = 8000000000L;
    double taxa = 1.2;

    System.out.println("Ano\tPopulação\tAumento");

    for (int i = 1; i <= 75; i++) {
        long populacaoAno =(long) (populacao * (1 + taxa / 100));
        long aumento = populacaoAno - populacao;

        System.out.println(i + "\t" + populacaoAno + "\t\t" + aumento);
        populacao = populacaoAno;
    }

    int ano = 1;
    long dobro = populacao * 2;

    while (populacao < dobro) {
        populacao = (long) (populacao * (1 + taxa / 100));
        ano++;
    }

    System.out.println("Dobraria em relação a esse ano daqui: " + ano +" anos");
}

}
