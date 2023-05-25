package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio9 {
	public static void ordSeleccion(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresar cantidad de numeros del arreglo");
		int cantNumeros = scanner.nextInt();
		
		int [] arreglo = new int [cantNumeros];
		
		System.out.println("Ingresar elementos del arreglo");
		
		for(int i=0; i<cantNumeros; i++) {
			System.out.println("Elemento "+(i+1)+":");
			arreglo[i]= scanner.nextInt();
		}
		
		ordenarPorSeleccion(arreglo);
		
		System.out.println("Arreglo ordenado por seleccion: ");
		for(int i=0; i<cantNumeros; i++) {
			System.out.println(arreglo[i]);	
		}
	}
	
	public static void ordenarPorSeleccion(int [] arreglo) {
		
		int cantNumeros = arreglo.length;
		
		for(int i=0; i<cantNumeros-1; i++ ) {
			int indiceMinimo = i;
			
			for(int j=i+1; j<cantNumeros; j++) {
				if(arreglo[j]<arreglo[indiceMinimo]) {
					indiceMinimo = j;
					
				}
			}
			
			int temp = arreglo[indiceMinimo];
			arreglo [indiceMinimo] = arreglo [i];
			arreglo [i] = temp;
		}
			
	}
		
}
