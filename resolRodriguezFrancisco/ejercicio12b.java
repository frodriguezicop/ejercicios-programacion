package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio12b {
	public static void ejerB() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingresar valor entero para la variable C");
	int C = scanner.nextInt();
	
	String signo = (C >= 0) ? "Positivo" : "Negativo";
	String parimpar = (C % 2 == 0 )? "Par" : "Impar";
	String multiplo5 = (C % 5 == 0)? "Multiplo de 5" : "No es multiplo de 5";
	String multiplo10 = (C % 10 == 0)? "Multiplo de 10" : "No es multiplo de 10";
	String mayormenor100 = (C > 100)? "Mayor a 100" : "Menor o igual a 100";
	
	System.out.println("El numero es: " +signo);
	System.out.println("El numero es: " +parimpar);
	System.out.println("El numero es: " +multiplo5);
	System.out.println("El numero es: " +multiplo10);
	System.out.println("El numero es: " +mayormenor100);
	}
}
