package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio11 {
	
	public static void operacionesVariables() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar valor entero para N");
		int N = scanner.nextInt();
		
		System.out.println("Ingresar valor decimal para A");
		double A = scanner.nextDouble();
		
		System.out.println("Ingresar un caracter para C");
		char C = scanner.next().charAt(0);		
		
		
		System.out.println("El valor de N es: " +N);
		System.out.println("El valor de A es: " +A);
		System.out.println("El valor de C es: " +C);
		
		int suma = N + (int) A;
		System.out.println("La suma de N + A es: " +suma);
		
		double diff = A - N;
		System.out.println("La diferencia de A - N es: " +diff);
	
		int valorNumerico = (int) C;
 		System.out.println("El valpr numerico correspondiente a C es: " +valorNumerico);
 		
 		double sumaTotal = N + A + valorNumerico;
 		System.out.println("La suma de N + A + C es: "  +sumaTotal);	
	}
	
	
	
	
}
