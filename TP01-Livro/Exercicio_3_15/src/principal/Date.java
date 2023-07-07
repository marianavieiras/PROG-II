package principal;

public class Date {
	private int mes;
	private int dia;
	private int ano;
	
	public Date (int  mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	public void setMes (int mes){
		this.mes = mes;
	}
	public void setDia (int dia){
		this.dia = dia;
	}
	public void setAno (int ano){
		this.ano = ano;
	}
	public int getMes (){
		return mes;
	}
	public int getDia (){
		return dia;
	}
	public int getAno() {
		return ano;
	}
	
	public String displayDate () {
		return dia+"/"+mes+"/"+ano;
	}
	
}
