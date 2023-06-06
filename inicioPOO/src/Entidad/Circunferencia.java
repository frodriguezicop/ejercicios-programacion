package Entidad;
import java.util.Scanner;
public class Circunferencia {
	private double radio;
	
	double area;
	double perimetro;
	
	public Circunferencia(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}


	public void crearCircunferencia() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar radio de la circunferencia");
		radio = scanner.nextDouble();
		
		
	}

	public void metodoArea() {
		
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area es: "+area);
	}

	public void metodoPerimetro() {
		perimetro = 2 * Math.PI * radio;
		System.out.println("El perimetro es: "+perimetro);
		
	}
	
}

