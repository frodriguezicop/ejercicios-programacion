package Entidad;
import java.util.Scanner;
public class Rectangulo {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {
		super();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void crearRectangulo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Ingresar base del rectangulo");
		base = scanner.nextDouble();
		System.out.println(" Ingresar altura del rectangulo");
		altura = scanner.nextDouble();
		
	}
	
	public double calcularSuperficie() {
		
		return base * altura;
		
	}
	
	public double calcularPerimetro() {
		
		return (base+altura)*2;
	}
	
	public void dibujarRectangulo() {
		
		for(int i=0; i<altura; i++) {
			
			for(int j=0; j<base; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
