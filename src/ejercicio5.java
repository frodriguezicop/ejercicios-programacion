import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar Numero entero");
		int numero=scanner.nextInt();
		
		System.out.println("El doble es " + numero *2);
		System.out.println("El triple es " + numero *3);
		System.out.println("La raiz cuadrada es: " +Math.sqrt(numero));
		
	}

}
