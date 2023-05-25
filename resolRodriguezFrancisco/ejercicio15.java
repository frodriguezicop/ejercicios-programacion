package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio15 {

	public static void vocalesMayuscula() {
		Scanner scanner = new Scanner(System.in);
		char [] vocales = {'A', 'E', 'I', 'O', 'U'};
		
		StringBuilder cadenaResultante = new StringBuilder();
		
		System.out.println("Introduce las posiciones del array (0-4) o -1 para finalizar");
		int posicion;
		do {
			posicion = scanner.nextInt();
			
			if(posicion>=0 && posicion<vocales.length) {
				
				cadenaResultante.append(vocales[posicion]);
			}else if(posicion != -1) {
				
				System.out.println("Error: posicion invalida, introduce otro numero");
		
			}
			
		}while(posicion != -1); 
					
		System.out.println("Cadena Resultante "+cadenaResultante.toString());
	}	
}
