package Entidad;
import java.util.Scanner;
public class Operacion {
	private int numero1;
	private int numero2;
	
	//a
	public Operacion(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	//b
	public Operacion() {
		super();
	}
	
	//c
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	//d
	public void crearOperacion() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar Numero 1");
		numero1 = scanner.nextInt();
		
		System.out.println("Ingresar Numero 2");
		numero2 = scanner.nextInt();
			
	}
	
	public int metodoSumar() {
		
		return numero1+numero2;
		
		
	}
	
	public int metodoRestar() {
	
		return numero1-numero2;	
	}
	
	public int metodoMultiplicar() {
		
		if(numero1==0 || numero2 ==0) {
			System.out.println("Error, No ingresar numeros 0");
			return 0;	
		}
		
		return numero1*numero2;
	}

	public int metodoDividir() {
		if(numero2==0) {
			System.out.println("Error, no se puede dividir por 0");
			return 0;
		}
		
		return numero1 / numero2;
		
	}

}





