package principal;

public class InvoiceTest {
	public static void main (String [] args) {
		Invoice p1 = new Invoice("1D2", "Mouse", 10, -4.67);
		System.out.println("Produto: "+ p1.getDescricao());
		System.out.println("Preço do item: "+p1.getPrecoItem());
		System.out.println("Numero: "+p1.getNumero());
		System.out.println("Valor: "+p1.getInvoiceAmount());
	}

}
