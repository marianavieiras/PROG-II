package principal;

public class Employee {
	private String nome;
	private String sobrenome;
	private double salario;
	
	public Employee(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (salario > 0) {
			this.salario = salario;
		} else {
			this.salario = 0.0;
		}
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setSobrenome (String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setSalario (double salario) {
		if (salario > 0) {
			this.salario = salario;
		} else {
			this.salario = 0.0;
		}
	}
	
	public String getNome () {
		return nome;
	}
	public String getSobrenome () {
		return sobrenome;
	}
	public double getSalario (){
		return salario;
	}
	public double salarioAnual() {
		return salario * 12; 
	}
	public void aumentaSalario () {
		this.salario *= 1.1;
	}

}
