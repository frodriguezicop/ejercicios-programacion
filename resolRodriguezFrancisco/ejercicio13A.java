package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio13A {
	public static int sumaNaturalesRecursiva(int n) {
		
		if (n == 1) {
			return 1;
		} else {
			return n+sumaNaturalesRecursiva(n-1);
		}
	}
		
	public static void recursiva() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero N: ");
		int n = scanner.nextInt();
		
		int resultado = sumaNaturalesRecursiva(n);
		
		System.out.println("La suma de los primeros "+n+" numeros naturales es: "+resultado);
		
			
		
	}
}
