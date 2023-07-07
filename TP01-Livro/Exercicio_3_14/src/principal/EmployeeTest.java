package principal;

public class EmployeeTest {
	public static void main (String [] args) {
		 Employee ex1 = new Employee("João", "Silva", 5000);
	     Employee ex2 = new Employee("Maria", "Santos", 6000);

	       
	     System.out.println("Nome: "+ ex1.getNome() +"\nSalário:" + ex1.getSalario() + " Anual: " + ex1.salarioAnual());
	     System.out.println("Nome: "+ ex2.getNome() +"\nSalário:" + ex2.getSalario() + " Anual: " + ex2.salarioAnual());

	     ex1.aumentaSalario();
	     ex2.aumentaSalario();
	     
	     System.out.println("Nome: "+ ex1.getNome() +"\n Salário anual novo:  " + ex1.salarioAnual());
	     System.out.println("Nome: "+ ex2.getNome() +"\n Salário anual novo:" + ex2.salarioAnual());

	}

}
