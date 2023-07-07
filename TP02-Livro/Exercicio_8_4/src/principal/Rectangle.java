package principal;

public class Rectangle {
	private double length; //comprimento
	private double width; //largura
	
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length) {	
		if (length >= 0 || length <= 20) {
			this.length = length;
		} else {
			System.out.println("O valor inserido é inválido, favor inserir um valor apenas entre 0 a 20.");
		}		
	}
	
	public void setWidth(double width) {
		if (width >= 0 || width <= 0) {
			this.width = width;
		} else {
			System.out.println(" P valor inserido é inválido, favor inserir um valor apenas entre 0 e 20.");
		}
	}
	
	public double calcularPerimetro() {
		return 2 * (length + width);
	}
	public double calcularArea() {
		return length * width;
	}

}
