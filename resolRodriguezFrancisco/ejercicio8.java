package resolRodriguezFrancisco;
import java.util.Scanner;
public class ejercicio8 {
	public static void contarBilletes(){
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.println("Ingresar monto");
	    int monto = scanner.nextInt();
	
	    contarBilletes(monto);
	} 
	
	public static void contarBilletes(int monto) {
		
	//equivalente a : monto = monto % 100, % es el resto de la division.
		int billete100 = monto / 100;
		monto %= 100; 
		
		int billete50 = monto / 50;
		monto %= 50;
		
		int billete20 = monto / 20;
		monto %= 20;
		
		int billete10 = monto / 10;
		monto %= 10;
		
		int billete5 = monto / 5;
		monto %= 5;
		
		int billete2 = monto / 2;
		monto %= 2;
		
		int billete1 = monto / 1;
	
	
		System.out.println("Cantidad minima de billetes: ");
		System.out.println("$100: "+billete100);
		System.out.println("$50: "+billete50);
		System.out.println("$20: "+billete20);
		System.out.println("$10: "+billete10);
		System.out.println("$5: "+billete5);
		System.out.println("$2: "+billete2);
		System.out.println("$1: "+billete1);
	}
	
	
	
	
	}

