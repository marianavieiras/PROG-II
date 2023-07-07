package principal;
import java.util.Calendar;

public class HealtProfile {

	    private String nome;
	    private String sobrenome;
	    private String genero;
	    private int ano;
	    private int mes;
	    private int dia;
	    private double altura;
	    private double peso;

	    public  HealtProfile (String nome, String sobrenome, String genero, int ano, int mes, int dia, double altura, double peso) {
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.genero = genero;
	        this.ano = ano;
	        this.mes = mes;
	        this.dia = dia;
	        this.altura = altura;
	        this.peso = peso;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getSobrenome() {
	        return sobrenome;
	    }

	    public void setSobrenome(String sobrenome) {
	        this.sobrenome = sobrenome;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public int getAno() {
	        return ano;
	    }

	    public void setAno(int ano) {
	        this.ano = ano;
	    }

	    public int getMes() {
	        return mes;
	    }

	    public void setMes(int mes) {
	        this.mes = mes;
	    }

	    public int getDia() {
	        return dia;
	    }

	    public void setDia(int dia) {
	        this.dia = dia;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public int calcularIdade() {
	        Calendar atual = Calendar.getInstance();
	        int anoAtual = atual.get(Calendar.YEAR);
	        int mesAtual = atual.get(Calendar.MONTH) + 1;
	        int diaAtual = atual.get(Calendar.DAY_OF_MONTH);

	        int idade = anoAtual - ano;

	        if (mesAtual < mes || (mesAtual == mes && diaAtual < dia)) {
	            idade--;
	        }

	        return idade;
	    }

	    public int calcularFrequenciaCardiacaMaxima() {
	        int idade = calcularIdade();
	        return 220 - idade;
	    }
	    
	    public String calcularFrequenciaCardiacaAlvo() {
	        int freqMax = calcularFrequenciaCardiacaMaxima();
	        int limiteInf = (int) (freqMax * 0.5);
	        int limiteSup = (int) (freqMax * 0.85);
	        return limiteInf + "até" + limiteSup;
	    }
	    
	    public String calcularIMC() {
	    	double imc = peso / (altura*altura);
	    	String msg = "Calculando";
			if (imc < 18.5) {
				msg = "Abaixo do peso adequado";
			} else if (imc >= 18.5 && imc <=24.9) {
				msg = "Peso considerado normal!";
			} else if (imc >= 25 && imc <= 29.9) {
				msg = "Considerado com sobrepeso!";
			} else if (imc >= 30) {
				msg = "Considerado com obesidade!";
			}
			return msg;
		
	    }
	 


}
