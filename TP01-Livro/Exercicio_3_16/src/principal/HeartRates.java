package principal;

import java.util.Calendar;

public class HeartRates {	
	 private String nome; 
	 private String sobrenome; 
	 private int data;
	 private int mes; 
	 private int ano;
	 
	 public HeartRates (String nome, String sobrenome, int data, int mes, int ano) {
		 this.nome = nome;
		 this.sobrenome = sobrenome; 
		 this.data = data;
		 this.mes = mes;
		 this.ano = ano;
	 }
	 
	 public void setNome (String nome) {
		 this.nome = nome;
	 }
	 public void setSobrenome (String sobrenome) {
		 this.sobrenome = sobrenome;
	 }
	 public String getNome () {
		 return nome;
	 }
	 public String getSobrenome() {
		 return sobrenome;
	 }
	 public void setData (int data) {
		 this.data = data;
	 }
	 public void setMes (int mes) {
		 this.mes = mes;
	 }
	 public void setAno (int ano) {
		 this.ano = ano;
	 }
	 public int getData () {
		 return data;
	 }
	 public int getMes () {
		 return mes;
	 }
	 public int getAno () {
		 return ano;
	 }
	 
	 public int calcularIdade() {
	        Calendar atual = Calendar.getInstance();
	        int anoAtual = atual.get(Calendar.YEAR);
	        int mesAtual = atual.get(Calendar.MONTH) + 1;
	        int diaAtual = atual.get(Calendar.DAY_OF_MONTH);
	        
	        int idade = anoAtual - ano;
	        
	        if (mesAtual < mes || (mesAtual == mes && diaAtual < data)) {
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
	 
}
