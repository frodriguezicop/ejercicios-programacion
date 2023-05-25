package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio14 {
	public static void vocalesArr() {
		
		
		int [] array = new int[10];
		
		//llenar array con valores ingresados por teclado
		llenarValores(array);
		
		//mostrar los indices y valores del array
		mostrarArray(array);
	}
		public static void llenarValores(int [] array) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese los valores del Array");
			
			for(int i=0; i<array.length; i++) {
				System.out.println("Ingrese el valor para el indice "+i+ ": ");
				array[i] = scanner.nextInt();
				
			
				
			}
			
			
		}
		
		public static void mostrarArray(int [] array) {
			
			System.out.println("Valores del array: ");
			
			for(int i=0; i<array.length; i++) {
				
				System.out.println("Indice "+i+ ": "+array[i]);
			}
			
			
		
		
	}
	
	
	
	
}
