package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio3 {
	
	public void capicua() {
		Scanner scanner = new Scanner(System.in);
		int n=0;
		int aux=0;
		int inverso=0;
		int cifras=0;
		
		System.out.println("Ingresar Numero");
		n = scanner.nextInt();
		
		aux = n;
		
		while(aux > 0) {
			cifras = aux % 10;
			inverso = inverso *10 + cifras;
			aux = aux / 10;
		}
		
		if(n == inverso) {
			System.out.println("Es capicua");
		}else {
				System.out.println("No es capicua");
			}
		
		}	
		
	}
	
	
	
	


