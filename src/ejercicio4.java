import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar Grados");
		int grados=scanner.nextInt();
		
		int res = 32 + (9*grados/5);
		
		System.out.println("El equivalente a Grados Fahrenheit es: "+res);
		
	}

}
