package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio6 {

	public static void esPrimo(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar numero");
		int num = scanner.nextInt();
		int ceros = 0;
		for(int i=1; i<=num; i++) {
			int div=num%i;
			
			if(div == 0) {
				ceros++;
			}
			
		}
		
		if (ceros<=2) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}
		
		
		
	}
	
	
	
	
	
	
	
}
