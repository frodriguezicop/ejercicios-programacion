package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio13B {
	public static int sumaNaturalesIterativa(int n) {
		
		int suma = 0;
		
		for(int i=1; i<=n; i++) {
			suma+=i;
		}
		
		return suma;		
	}
	public static void iterativa() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero N: ");
		int n = scanner.nextInt();
		
		int resultado = sumaNaturalesIterativa(n);
		
		System.out.println("La suma de los primeros "+n+" numeros naturales es: "+resultado);
			
	}
}
